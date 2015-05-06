package autoclicker;

import java.awt.AWTException;

/**
 * The main program for the autoclicker.
 */
public class AutoClicker {
    public static void main(String[] args) throws AWTException {
        Click click = new Click(true);
        click.clicker(); 
        try {
        Swingerinos sw = new Swingerinos();
        }
        catch (AWTException e) { System.exit(-1); }
    }
}
