package Observer;

import java.util.ArrayList;
import java.util.List;

public class Temperature implements Observable{

    private final List<Observer> observers;
    private int value;
    public Temperature() {
        this.observers = new ArrayList<>();
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove( observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.notifyMe(this);
        }
    }
}
