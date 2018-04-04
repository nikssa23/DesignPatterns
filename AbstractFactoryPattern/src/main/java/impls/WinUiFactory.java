package impls;

import interfaces.Alert;
import interfaces.PopUp;
import interfaces.UIFactory;

public class WinUiFactory implements UIFactory {
    @Override
    public Alert getAlert() {
        return new WinAlert();
    }

    @Override
    public PopUp getPopUp() {
        return new WinPopUp();
    }
}
