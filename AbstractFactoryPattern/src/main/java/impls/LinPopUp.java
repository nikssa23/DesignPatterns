package impls;

import interfaces.PopUp;

public class LinPopUp implements PopUp {
    @Override
    public void popUp() {
        System.out.println("[PopUp][Linux] - Activate PopUp");
    }
}
