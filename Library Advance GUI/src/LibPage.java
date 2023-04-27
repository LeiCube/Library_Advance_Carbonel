import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class LibPage {

	public LibPage(JFrame libLogin) {
		JFrame LibPage = new JFrame("Librarian Page");
		LibPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibPage.setSize(550,500);
		LibPage.setLocationRelativeTo(null);
		LibPage.setVisible(true);
		LibPage.setResizable(false);
		LibPage.setLayout(null);
		libLogin.dispose();
		
		JLabel welcomeTitle = new JLabel("Welcome to NU Library System");
		welcomeTitle.setBounds(65, 30, 500, 25);
		welcomeTitle.setFont(new Font("Century Gothic", Font.BOLD, 25));
		
		JLabel chooseLabel = new JLabel("AVAILABLE BOOKS:");
		chooseLabel.setBounds(190, 80, 500, 25);
		chooseLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));

		ArrayList<Book> books = new ArrayList<Book>();
		
		Book book1 = new Book();
		book1.setName("System Analysis and Design");
		book1.setAuthor("Gary B. Shelly");
		book1.setCopy(2);
			
		Book book2 = new Book();
		book2.setName("Android Application");
		book2.setAuthor("Corine Hoisington");
		book2.setCopy(3);
			
		Book book3 = new Book();
		book3.setName("Programming Concepts and Logic Formulation");
		book3.setAuthor("Rosauro E. Manuel");
		book3.setCopy(4);
			
		books.add(book1);
		books.add(book2);
		books.add(book3);

		JLabel book1Label = new JLabel("1.    "+book1.getName()+ ", " + book1.getAuthor());
		JLabel book2Label = new JLabel("2.    "+book2.getName()+ ", " + book2.getAuthor());
		JLabel book3Label = new JLabel("3.    "+book3.getName()+ ", " + book3.getAuthor());
		
		book1Label.setBounds(10, 20, 500, 20);
		book1Label.setFont(new Font("Arial", Font.BOLD, 15));
		
		book2Label.setBounds(10, 50, 500, 20);
		book2Label.setFont(new Font("Arial", Font.BOLD, 15));
		
		book3Label.setBounds(10, 80, 500, 20);
		book3Label.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 130, 550, 130);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.add(book1Label);
		panel.add(book2Label);
		panel.add(book3Label);
		
		JTextField numberField = new JTextField();
		numberField.setBounds(170, 270, 200, 50);
		numberField.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		numberField.setBackground(Color.black);
		numberField.setForeground(Color.white);
		numberField.setCaretColor(Color.white);
		
		JButton rentButton = new JButton("Rent");
		rentButton.setBackground(Color.black);
		rentButton.setForeground(Color.white);
		rentButton.setBounds(170, 330, 200, 30);
		rentButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int choice = Integer.parseInt(numberField.getText());
	    		Book book = books.get(choice-1);
				int copy = book.getCopy();
	    		if(copy > 0){
	    			JOptionPane.showMessageDialog(null, "You rented " + books.get(choice-1).getName());	    			//resultJLabel.setText("You rented " + books.get(choice).getName());
	    			book.setCopy(copy-=1);
	    		}else{
	    			JOptionPane.showMessageDialog(null, "NO COPIES AVAILABLE");
	    		}
			}
		});

		
		LibPage.add(welcomeTitle);
		LibPage.add(chooseLabel);
		LibPage.add(panel);
		LibPage.add(numberField);
		LibPage.add(rentButton);
		
		
	}
	
}
