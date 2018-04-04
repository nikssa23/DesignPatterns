package impls;

import interfaces.Alert;
import interfaces.PopUp;
import interfaces.UIFactory;

public class LinUIFactory implements UIFactory {
    @Override
    public Alert getAlert() {
        return new LinAlert();
    }

    @Override
    public PopUp getPopUp() {
        return new LinPopUp();
    }
}
