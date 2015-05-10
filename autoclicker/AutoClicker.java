package autoclicker;

import java.awt.AWTException;

/**
 * The main program for the autoclicker.
 */
public class AutoClicker {
    public static void main(String[] args) throws AWTException {
        Click click = new Click(true);
        Thread worker = new Thread(new Runnable() {
            public void run() {
                click.clicker();
            }
        });
        try {
            Swingerinos sw = new Swingerinos();
            sw.initialize();
        }
        catch (AWTException e) { e. printStackTrace(); System.exit(-1); }
    }
}
