public class Invoker {

    private ICommand iCommandOn;
    private ICommand iCommandOff;

    public Invoker(ICommand iCommandOn, ICommand iCommandOff) {
        this.iCommandOn = iCommandOn;
        this.iCommandOff = iCommandOff;
    }

    public void clickOn() {
        this.iCommandOn.execute();
    }

    public void clickOff() {
        this.iCommandOff.execute();
    }
}
