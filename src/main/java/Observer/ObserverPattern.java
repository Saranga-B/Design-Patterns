package Observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        Display tv = new Display();
        AirConditioner ac = new AirConditioner();
        Notification message = new Notification();

        temperature.addObserver(tv);
        temperature.addObserver(ac);
        temperature.addObserver(message);
        temperature.setValue(20);
    }
}
