package hangman;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class GUI3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public GUI3() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JLabel lblSorryYouLose = new JLabel("Sorry, you lose!");
		lblSorryYouLose.setHorizontalAlignment(SwingConstants.CENTER);
		lblSorryYouLose.setForeground(Color.BLUE);
		lblSorryYouLose.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSorryYouLose.setBackground(Color.WHITE);
		lblSorryYouLose.setBounds(10, 108, 424, 41);
		add(lblSorryYouLose);
		
		JLabel lblTheWordWas = new JLabel("The word was ______");
		lblTheWordWas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheWordWas.setForeground(Color.CYAN);
		lblTheWordWas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTheWordWas.setBackground(Color.WHITE);
		lblTheWordWas.setBounds(10, 146, 424, 41);
		add(lblTheWordWas);
		
		JButton button = new JButton("Exit Game");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(Color.WHITE);
		button.setBounds(174, 262, 89, 27);
		add(button);

	}

}
