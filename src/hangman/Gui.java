package hangman;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Gui extends JFrame {

	private JPanel contentPane;

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
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("WELCOME TO HANGMAN!");
		welcomeLabel.setBackground(Color.WHITE);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		welcomeLabel.setForeground(Color.BLUE);
		welcomeLabel.setBounds(5, 5, 424, 43);
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(welcomeLabel);
		
		JButton btnNewButton_1 = new JButton("Exit Game");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(174, 204, 89, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblSelectDifficultyLevel = new JLabel("Select  Difficulty Level:");
		lblSelectDifficultyLevel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelectDifficultyLevel.setForeground(Color.CYAN);
		lblSelectDifficultyLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectDifficultyLevel.setBounds(10, 85, 424, 14);
		contentPane.add(lblSelectDifficultyLevel);
		
		JButton btnNewButton_2 = new JButton("Easy");
		btnNewButton_2.setBounds(72, 110, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnMedium = new JButton("Medium");
		btnMedium.setBounds(174, 110, 89, 23);
		contentPane.add(btnMedium);
		
		JButton btnHard = new JButton("Hard");
		btnHard.setBounds(273, 110, 89, 23);
		contentPane.add(btnHard);
		

	}
}
