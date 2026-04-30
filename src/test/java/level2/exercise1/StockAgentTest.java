package level2.exercise1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StockAgentTest {

    private StockAgent stockAgent;
    private StockBrokerAgency alphaBrokers;
    private StockBrokerAgency zenithInvestments;
    private ByteArrayOutputStream outputStreamCaptor;

    @BeforeEach
    void setUp() {
        stockAgent = new StockAgent();
        alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        zenithInvestments = new StockBrokerAgency("Zenith Investments");

        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldNotifyAllObserversWhenMarketGoesUp() {
        stockAgent.addObserver(alphaBrokers);
        stockAgent.addObserver(zenithInvestments);

        stockAgent.stockMarketUp(150.75);

        String output = outputStreamCaptor.toString();

        assertTrue(output.contains("Alpha Brokers received notification: Stock market went UP to 150.75"));
        assertTrue(output.contains("Zenith Investments received notification: Stock market went UP to 150.75"));
    }

    @Test
    void shouldNotifyAllObserversWhenStockMarketGoesDown() {
        stockAgent.addObserver(alphaBrokers);
        stockAgent.addObserver(zenithInvestments);

        stockAgent.stockMarketDown(145.50);

       String output = outputStreamCaptor.toString();

       assertTrue(output.contains("Alpha Brokers received notification: Stock market went DOWN to 145.5"));
       assertTrue(output.contains("Zenith Investments received notification: Stock market went DOWN to 145.5"));
    }

    @Test
    void shouldNotNotifyRemovedObserver() {
        stockAgent.addObserver(alphaBrokers);
        stockAgent.addObserver(zenithInvestments);

        stockAgent.removeObserver(zenithInvestments);

        stockAgent.stockMarketUp(200.00);

        String output = outputStreamCaptor.toString();

        assertTrue(output.contains("Alpha Brokers received notification: Stock market went UP to 200.0"));
        assertFalse(output.contains("Zenith Investments received notification"));
    }


}
