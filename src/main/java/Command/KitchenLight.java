package Command;

public class KitchenLight implements Light{
    @Override
    public void on() {
        System.out.println("Kitchen Light Switch On()");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Light Switch Off()");
    }
}
