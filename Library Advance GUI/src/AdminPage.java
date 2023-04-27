import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminPage {
	
	public AdminPage(JFrame adminLogin) {
		// TODO Auto-generated constructor stub
		JFrame adminPage = new JFrame("Admin Page");
		adminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminPage.setSize(500,500);
		adminPage.setLocationRelativeTo(null);
		adminPage.setVisible(true);
		adminPage.setResizable(false);
		adminPage.setLayout(null);
		adminLogin.dispose();
		
		JLabel welcomeTitle = new JLabel("Welcome to NU Library System.");
		welcomeTitle.setBounds(50, 30, 500, 25);
		welcomeTitle.setFont(new Font("Century Gothic", Font.BOLD, 25));
		
		adminPage.add(welcomeTitle);
		
	}
	
}
