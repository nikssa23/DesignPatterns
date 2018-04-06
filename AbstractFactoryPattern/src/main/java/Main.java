import impls.WinUiFactory;
import interfaces.Alert;
import interfaces.PopUp;
import interfaces.UIFactory;

public class Main {

    public static void main(String args[]) {

        UIFactory uiFactory = new WinUiFactory();

        // get components based on sme OS.
        Alert alert = uiFactory.getAlert();
        PopUp popUp = uiFactory.getPopUp();

        alert.draw();
        popUp.popUp();

    }
}
