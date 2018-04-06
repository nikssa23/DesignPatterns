package impls;

import interfaces.Alert;
import interfaces.PopUp;
import interfaces.UIFactory;

public class MacUIFactory implements UIFactory {
    @Override
    public Alert getAlert() {
        return new MacAlert();
    }

    @Override
    public PopUp getPopUp() {
        return new MacPopUp();
    }
}
