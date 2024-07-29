package Observer;

public class Notification implements Observer{
    @Override
    public void notifyMe(Observable observable) {
        Temperature temperature = (Temperature) observable;
        System.out.println("Notification: Temperature Changed and Current Temperature is:" + temperature.getValue());
    }
}
