import java.util.ArrayList;

public class CakeOrderingSystem implements Subject {
    ArrayList<Observer> observers;
    private volatile static CakeOrderingSystem uniqueInstance;

    private CakeOrderingSystem() {
        observers = new ArrayList<Observer>();
    }
 // Double-checked locking singleton pattern
    public static CakeOrderingSystem getInstance() {
        if (uniqueInstance == null) {
            synchronized (CakeOrderingSystem.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new CakeOrderingSystem();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers(Order order) {
        for (Observer observer : observers) {
            observer.update(order);
        }
    }

}
