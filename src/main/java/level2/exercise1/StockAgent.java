package level2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Subject {

    private List<Observer> observers;

    public StockAgent(List<Observer> observers) {
        this.observers = new ArrayList<>(observers);
    }

    public void stockMarketUp(double value) {
        String message = "Stock market went UP to " + value;
        notifyObserver(message);
    }

    public void stockMarketDown(double value) {
        String message = "Stock market went DOWN to " + value;
        notifyObserver(message);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
