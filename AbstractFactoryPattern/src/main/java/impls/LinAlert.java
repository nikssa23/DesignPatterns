package impls;

import interfaces.Alert;

public class LinAlert implements Alert {
    @Override
    public void draw() {
        System.out.println("[Alert][Linux] - Draw");
    }

}
