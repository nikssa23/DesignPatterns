public class Light {

    private boolean on;

    public void on() {
        this.on = true;
        System.out.println("Turn light on");
    }

    public void off() {
        this.on = false;
        System.out.println("Turn light off");
    }
}
