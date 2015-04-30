package autoclicker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.AWTException;


public class Swingerinos extends Click {

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 109);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Toggle On / Off");
		btnNewButton.addActionListener((ActionListener) this);
		btnNewButton.setToolTipText("Toggles the  autoclicker on / off.");
		panel.add(btnNewButton);
		
	}
		
    public void actionPerformed(ActionEvent e) {
    toggle();
    }
	
}
