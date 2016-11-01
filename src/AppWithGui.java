import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AppWithGui {

	private JFrame frmFirstGuiApp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWithGui window = new AppWithGui();
					window.frmFirstGuiApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWithGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFirstGuiApp = new JFrame();
		frmFirstGuiApp.setTitle("First GUI app");
		frmFirstGuiApp.setBounds(100, 100, 450, 300);
		frmFirstGuiApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFirstGuiApp.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 600, 21);
		frmFirstGuiApp.getContentPane().add(menuBar);
		
		JMenu mnColors = new JMenu("Colors");
		mnColors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnColors);
		
		JMenuItem mntmBlack = new JMenuItem("Black");
		mntmBlack.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
				frmFirstGuiApp.getContentPane().setBackground(Color.black);
				
				}
		});
		mnColors.add(mntmBlack);
		
		JMenuItem mntmRed = new JMenuItem("Red");
		mntmRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnColors.add(mntmRed);
	}
}
