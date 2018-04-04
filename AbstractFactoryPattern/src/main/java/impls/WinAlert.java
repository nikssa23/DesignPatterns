package impls;

import interfaces.Alert;

public class WinAlert implements Alert {
    @Override
    public void draw() {
        System.out.println("[Alert][Windows] - Draw");
    }
}
