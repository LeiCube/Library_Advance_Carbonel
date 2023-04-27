import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage{
	JFrame frame;
	JButton adminButton;
	JButton LibButton;
	
	LoginPage() {
		frame = new JFrame("Library Advance");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		JLabel title = new JLabel("Library Management - JavaTpoint");
		title.setBounds(85, 80, 500, 25);
		title.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		adminButton = new JButton("Admin Login");
		adminButton.setFocusable(false);
		adminButton.setBounds(140, 150, 200, 50);
		adminButton.setBackground(Color.black);
		adminButton.setForeground(Color.white);
		
		
		LibButton = new JButton("Librarian Login");
		LibButton.setFocusable(false);
		LibButton.setBounds(140, 220, 200, 50);
		LibButton.setBackground(Color.black);
		LibButton.setForeground(Color.white);


		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(title);
		panel.add(adminButton);
		panel.add(LibButton);
		
		frame.add(panel);
		
		adminButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == adminButton) {
					new AdminLogin(frame);
				}
				
			}
		});
		
		LibButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == LibButton) {
					new LibLogin(frame);
				}
			}
		});
		
	}



	
}
