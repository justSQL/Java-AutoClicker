package autoclicker;

import java.awt.*;
import java.awt.event.InputEvent;

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