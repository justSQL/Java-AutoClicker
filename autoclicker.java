package autoclicker;

import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.AWTException;

//The main program for the autoclicker
class AutoClicker {
    public static void main(String[] args) throws AWTException {
        Click click = new Click(true);
        click.clicker();
    }
}
//The clicker object:
class Click {
    private boolean active;
    private Robot robot;

    public Click(boolean active, Robot robot) {
        this.active = active;
        this.robot = robot;
    }

    public Click() throws AWTException {
        this(false, new Robot());
    }

    public Click (boolean active) throws AWTException {
        this(active, new Robot());
    }
//TODO: add click.toggle() to somewhere and control da clicker
    public void toggle() {
        active = !active;
    }
    

    public void clicker () {
        while (active) {
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.setAutoDelay(10000);
        }
    }
}