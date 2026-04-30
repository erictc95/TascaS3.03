package level2.exercise1;

public class StockBrokerAgency implements Observer{

    private String agencyName;


    public StockBrokerAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String message) {
        System.out.println(agencyName + " received notification: " + message);
    }
}
