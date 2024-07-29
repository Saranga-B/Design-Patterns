package Observer;

public class Display implements Observer{

    @Override
    public void notifyMe(Observable observable) {
        Temperature temperature = (Temperature) observable;
        System.out.println("Current Temperature is:" + temperature.getValue());
    }
}
