import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LibLogin {

	public LibLogin(JFrame frame) {
		// TODO Auto-generated constructor stub
		JFrame libLogin = new JFrame("Librarian Login");
		libLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libLogin.setSize(500,500);
		libLogin.setLocationRelativeTo(null);
		libLogin.setVisible(true);
		libLogin.setResizable(false);
		libLogin.setLayout(null);
		frame.dispose();
		
		JLabel LibTitle = new JLabel("LIBRARIAN LOGIN");
		LibTitle.setBounds(150, 30, 500, 25);
		LibTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
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
				// TODO Auto-generated method stub
				if (e.getSource() == submit) {
					String[] LibUsername = {"Librarian_01", "Librarian_02", "Librarian_03"};
					String[] LibPassword = {"LibOne", "LibTwo", "LibThree"};
					
					String username = inputUsername.getText();
				    String password = inputPassword.getText();
					
					for (int i = 0; i < LibUsername.length; i++) {
						if (username.equals(LibUsername[i]) && password.equals(LibPassword[i])) {
							JOptionPane.showMessageDialog(null, "Welcome Librarian");
							new LibPage(libLogin);
						}
						else if (!username.equals(LibUsername[i]) && password.equals(LibPassword[i])) {
							JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
						}
						else if (username.equals(LibUsername[i]) && !password.equals(LibPassword[i])) {
							JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
						}
					}
					if(!username.equals(LibUsername[0])&& !password.equals(LibPassword[0])&&
						!username.equals(LibUsername[1])&& !password.equals(LibPassword[1]) && 
						!username.equals(LibUsername[2])&& !password.equals(LibPassword[2])) {
						JOptionPane.showMessageDialog(null, "INCORRECT USERNAME & PASSWORD");
					}
				}
				
			}
		});
		
		libLogin.add(LibTitle);
		libLogin.add(userLabel);
		libLogin.add(inputUsername);
		libLogin.add(passLabel);
		libLogin.add(inputPassword);
		libLogin.add(submit);
	}
	
}
