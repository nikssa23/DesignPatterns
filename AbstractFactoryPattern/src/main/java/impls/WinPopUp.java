package impls;

import interfaces.PopUp;

public class WinPopUp implements PopUp {
    @Override
    public void popUp() {
        System.out.println("[PopUp][Windows] - Activate PopUp");
    }
}
