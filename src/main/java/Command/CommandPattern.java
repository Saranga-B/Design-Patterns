package Command;


public class CommandPattern {
    public static void main(String[] args) {

        KitchenLight kitchenLight = new KitchenLight();

        LightOnCommand lightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffCommand = new LightOffCommand(kitchenLight);

        lightOnCommand.execute();
        lightOffCommand.execute();


    }
}
