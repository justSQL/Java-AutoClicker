package autoclicker;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Swingerinos extends Click implements WindowListener,ActionListener {

    private int numClicks = 0;
    TextField text;

    private JFrame frame;
    /**
     * @wbp.nonvisual location=181,19
     */
    private final JLabel lblAutoclicker = new JLabel("AutoClicker");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Swingerinos window = new Swingerinos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Swingerinos() throws AWTException {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 109);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.WEST);

        JButton btnNewButton = new JButton("Toggle On / Off");
        text = new TextField(20);
        text.setLocation(100, 100);
        btnNewButton.addActionListener(this);
        btnNewButton.setToolTipText("Toggles the  autoclicker on / off.");
        panel.add(btnNewButton);
        panel.add(text);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Toggle On / Off")) {
            toggle();
        }
    }


    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }


    public void windowOpened(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

}