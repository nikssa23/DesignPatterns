public class Main {
    public static void main(String args[]) {

        /**
         * TODO: Implement undo action
         */
        Light light = new Light();

        Invoker invoker = new Invoker(new LightOnCommand(light), new LightOffCommand(light));

        invoker.clickOn();
        invoker.clickOff();
        invoker.clickOn();
        invoker.clickOff();

    }
}
