package hangman;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPleaseChooseA = new JLabel("Please choose a difficulty:");
		lblPleaseChooseA.setBounds(5, 26, 199, 16);
		lblPleaseChooseA.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblPleaseChooseA.setVerticalAlignment(SwingConstants.TOP);
		lblPleaseChooseA.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblPleaseChooseA);
		
		JLabel lblEasymediumhard = new JLabel("1. Easy");
		lblEasymediumhard.setBounds(5, 54, 199, 16);
		panel.add(lblEasymediumhard);
		
		textField = new JTextField();
		textField.setBounds(5, 146, 179, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(34, 192, 117, 29);
		panel.add(btnNewButton);
		
		JLabel lblMedium = new JLabel("2. Medium");
		lblMedium.setBounds(5, 82, 75, 16);
		panel.add(lblMedium);
		
		JLabel lblHard = new JLabel("3. Hard");
		lblHard.setBounds(5, 110, 61, 16);
		panel.add(lblHard);
		
		JLabel welcomeLabel = new JLabel("Welcome to Hangman");
		contentPane.add(welcomeLabel, BorderLayout.NORTH);
		welcomeLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
