package Observer;

public class AirConditioner implements Observer{
    @Override
    public void notifyMe(Observable observable) {
        System.out.println("Temp changed ");
    }
}
