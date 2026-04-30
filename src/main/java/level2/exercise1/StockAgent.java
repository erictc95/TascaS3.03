package level2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Subject {

    private List<Observer> observers;

    public StockAgent() {
        observers = new ArrayList<>();
    }

    public void stockMarketUp(double value) {
        String message = "Stock market went UP to " + value;
        notifyObservers(message);
    }

    public void stockMarketDown(double value) {
        String message = "Stock market went DOWN to " + value;
        notifyObservers(message);
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
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
