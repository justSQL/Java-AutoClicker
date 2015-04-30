package autoclicker;

import java.awt.AWTException;

//The main program for the autoclicker
class AutoClicker {
    public static void main(String[] args) throws AWTException {
        Click click = new Click(true);
        click.clicker();
    }
}
