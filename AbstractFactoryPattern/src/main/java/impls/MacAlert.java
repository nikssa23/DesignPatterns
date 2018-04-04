package impls;

import interfaces.Alert;

public class MacAlert implements Alert {
    @Override
    public void draw() {
        System.out.println("[Alert][Mac] - Draw");

    }
}
