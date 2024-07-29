package Command;

public class LivingRoomLight implements Light{
    @Override
    public void on() {
        System.out.println("Living Room Light Switch On()");
    }

    @Override
    public void off() {
        System.out.println("Living Room Light Switch Off()");
    }
}
