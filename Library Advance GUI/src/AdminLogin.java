import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AdminLogin {
	
	public AdminLogin(JFrame frame) {
		JFrame adminLogin = new JFrame("Admin Login");
		adminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminLogin.setSize(500,500);
		adminLogin.setLocationRelativeTo(null);
		adminLogin.setVisible(true);
		adminLogin.setResizable(false);
		adminLogin.setLayout(null);
		frame.dispose();
		
		JLabel adminTitle = new JLabel("ADMIN LOGIN");
		adminTitle.setBounds(150, 30, 500, 25);
		adminTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		JLabel userLabel = new JLabel("Input Username:");
		userLabel.setBounds(195, 110, 200, 25);
		userLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		
		JTextField inputUsername = new JTextField();
		inputUsername.setBounds(150, 140, 200, 50);
		inputUsername.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		inputUsername.setBackground(Color.black);
		inputUsername.setForeground(Color.white);
		inputUsername.setCaretColor(Color.white);
		
		JLabel passLabel = new JLabel("Input Username:");
		passLabel.setBounds(195, 210, 200, 25);
		passLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		
		JTextField inputPassword = new JTextField();
		inputPassword.setBounds(150, 240, 200, 50);
		inputPassword.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		inputPassword.setBackground(Color.black);
		inputPassword.setForeground(Color.white);
		inputPassword.setCaretColor(Color.white);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(200, 325, 100, 40);
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setFocusable(false);
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == submit) {
					String[] adminUsername = {"Admin_01", "Admin_02", "Admin_03"};
					String[] adminPassword = {"AdminOne", "AdminTwo", "AdminThree"};
					
					String username = inputUsername.getText();
				    String password = inputPassword.getText();
					
					for (int i = 0; i < adminUsername.length; i++) {
						if (username.equals(adminUsername[i]) && password.equals(adminPassword[i])) {
							JOptionPane.showMessageDialog(null, "Welcome Admin");
							new AdminPage(adminLogin);
						}
						else if (!username.equals(adminUsername[i]) && password.equals(adminPassword[i])) {
							JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
						}
						else if (username.equals(adminUsername[i]) && !password.equals(adminPassword[i])) {
							JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
						}
						
					}
					if(!username.equals(adminUsername[0])&& !password.equals(adminPassword[0])&&
						!username.equals(adminUsername[1])&& !password.equals(adminPassword[1]) && 
						!username.equals(adminUsername[2])&& !password.equals(adminPassword[2])) {
						JOptionPane.showMessageDialog(null, "INCORRECT USERNAME & PASSWORD");
					}
				}
				
			}
		});
		
		adminLogin.add(adminTitle);
		adminLogin.add(userLabel);
		adminLogin.add(inputUsername);
		adminLogin.add(passLabel);
		adminLogin.add(inputPassword);
		adminLogin.add(submit);
	}
	
}
