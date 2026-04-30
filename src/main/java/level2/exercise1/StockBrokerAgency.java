package level2.exercise1;

public class StockBrokerAgency implements Observer{

    private String agencyName;


    private StockBrokerAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String message) {
        System.out.println(agencyName + "recieved notification " + message);
    }
}
