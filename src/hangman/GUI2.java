package hangman;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.JButton;

public class GUI2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI2() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLevelEasy = new JLabel("Congratulations, you win!");
		lblLevelEasy.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelEasy.setForeground(Color.BLUE);
		lblLevelEasy.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLevelEasy.setBackground(Color.WHITE);
		lblLevelEasy.setBounds(0, 88, 424, 41);
		contentPane.add(lblLevelEasy);
		
		JLabel label = new JLabel("The word was ______");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.CYAN);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 124, 424, 41);
		contentPane.add(label);
		
		JButton button = new JButton("Exit Game");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(Color.WHITE);
		button.setBounds(183, 223, 89, 27);
		contentPane.add(button);
		
		

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		//Container frame = null;
		//frame.add(new JLabel(new ImageIcon("celebrate.png")));
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
