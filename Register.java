import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Register implements ActionListener {

	JFrame registerframe;
	JLabel firstNameLabel;
	JLabel lastNameLabel;
	JLabel userNameLabel2;
	JLabel emailLabel;
	JLabel phoneNmbrLabel;
	JLabel passwordLabel2;
	JLabel registerPageImg;
	JLabel registerPageText;
	JLabel userLogo;
	JLabel passLogo;

	JTextField firstNameText;
	JTextField lastNameText;
	JTextField userNameTextr;
	JTextField passwordTextr;
	JTextField emailText;
	JTextField phoneNmbrTextField;
	JButton signupr;

	Register() {

		registerframe = new JFrame();

		Font headerText = new Font("Montserrat", Font.BOLD, 35);

		firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(520, 60, 150, 20);
		firstNameLabel.setForeground(Color.black);

		lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(520, 100, 150, 20);
		lastNameLabel.setForeground(Color.black);

		userNameLabel2 = new JLabel("Username");
		userNameLabel2.setBounds(520, 143, 150, 20);
		userNameLabel2.setForeground(Color.black);

		passwordLabel2 = new JLabel("Password");
		passwordLabel2.setBounds(520, 190, 150, 20);
		passwordLabel2.setForeground(Color.black);

		emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(520, 280, 150, 20);
		emailLabel.setForeground(Color.black);

		phoneNmbrLabel = new JLabel("Contact Number");
		phoneNmbrLabel.setBounds(520, 235, 150, 20);
		phoneNmbrLabel.setForeground(Color.black);


		registerPageText = new JLabel("Register");
		registerPageText.setBounds(520, 0, 150, 50);
		registerPageText.setFont(headerText);
		registerPageText.setForeground(Color.orange);
		registerPageText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.orange));

		firstNameText = new JTextField();
		firstNameText.setBounds(520, 80, 240, 25);

		lastNameText = new JTextField();
		lastNameText.setBounds(520, 120, 240, 25);

		userNameTextr = new JTextField();
		userNameTextr.setBounds(520, 165, 240, 25);

		emailText = new JTextField();
		emailText.setBounds(520, 300, 240, 25);

		phoneNmbrTextField = new JTextField();
		phoneNmbrTextField.setBounds(520, 255, 240, 25);

		passwordTextr = new JPasswordField();
		passwordTextr.setBounds(520, 210, 240, 25);

		signupr = new JButton("Sign Up");
		signupr.setBounds(520, 340, 240, 30);
		signupr.setBackground(Color.orange);

		registerPageImg = new JLabel();
		registerPageImg.setIcon(new ImageIcon("Storage/Login Page.jpg"));
		registerPageImg.setBounds(0, -290, 1902, 1076);

		registerframe.add(firstNameLabel);
		registerframe.add(lastNameLabel);
		registerframe.add(userNameLabel2);
		registerframe.add(passwordLabel2);
		registerframe.add(emailLabel);
		registerframe.add(phoneNmbrLabel);
		registerframe.add(registerPageText);
		registerframe.add(firstNameText);
		registerframe.add(lastNameText);
		registerframe.add(userNameTextr);
		registerframe.add(passwordTextr);
		registerframe.add(emailText);
		registerframe.add(phoneNmbrTextField);
		registerframe.add(signupr);
		registerframe.add(registerPageImg);

		registerframe.setTitle("E-Ticketing");
		registerframe.setSize(815, 530);

		registerframe.setLocationRelativeTo(null);
		registerframe.setLayout(null);
		registerframe.setVisible(true);

		signupr.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){  
    
		String fname = firstNameText.getText();
		String lname = lastNameText.getText();
		String uname = userNameTextr.getText();
		String pass = passwordTextr.getText();
		String cnumber = phoneNmbrTextField.getText();
		String mail = emailText.getText();
		
		
         
        if(e.getSource() == signupr){  
			   
        	if (fname.isEmpty() || lname.isEmpty() || uname.isEmpty() || pass.isEmpty() || cnumber.isEmpty() ||  mail.isEmpty())
        	{
        		JOptionPane.showMessageDialog(null, "Please fill up all information");
        	}
        	
       	else {
        		
        		
        		try {
					
        			
        			File file = new File ("Data/Registration.txt");
            		
            		if(!file.exists()) {
            			
            			file.createNewFile();
            		}
            		
            		FileWriter fileWriter = new FileWriter(file,true);
            		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            		PrintWriter printWriter = new PrintWriter(fileWriter);
            		
            		
            		printWriter.println("First Name: "+fname);
            		printWriter.println("Last Name: "+lname);
            		printWriter.println("User Name: "+uname);
            		printWriter.println("Password: "+pass);
            		printWriter.println("Phone Number: "+cnumber);
            		printWriter.println("Email: "+mail);
            		printWriter.println("=========================================");
            		printWriter.close();
				} 
        		
        		
        		catch (Exception e2) {
					
        			System.out.println(e2);
				}
        		
        		
        		
        		
        		JOptionPane.showMessageDialog(null, "Account Created Successfully");
        		registerframe.setVisible(false);
        		new Login();

			}
        	
        
        		
			}
				


			}

	// public static void main(String[] args) {
	// 	new Register();
	// }

}
