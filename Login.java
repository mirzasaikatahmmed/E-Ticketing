import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends JFrame implements ActionListener {

	JFrame Loginframe;
	JLabel userNameLabel, passwordLabel, loginPageImg, loginPageText, userLogo, passLogo;

	JTextField userNameText;
	JTextField passwordText;

	JButton loginB;
	JButton signup;
	JButton adminlogin;

	Login() {

		Loginframe = new JFrame();

		Font headerText = new Font("Montserrat", Font.BOLD, 35);

		userNameLabel = new JLabel("Username");
		userNameLabel.setBounds(520, 130, 150, 20);
		userNameLabel.setForeground(Color.black);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(520, 180, 150, 20);
		passwordLabel.setForeground(Color.black);

		loginPageText = new JLabel("User Login");
		loginPageText.setBounds(520, 70, 210, 50);
		loginPageText.setFont(headerText);
		loginPageText.setForeground(Color.orange);
		loginPageText.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.orange));

		userNameText = new JTextField();
		userNameText.setBounds(520, 150, 240, 25);

		passwordText = new JPasswordField();
		passwordText.setBounds(520, 200, 240, 25);

		loginB = new JButton("Login");
		loginB.setBounds(520, 250, 240, 30);
		loginB.setBackground(Color.orange);
		loginB.setFocusable(false);

		signup = new JButton("Create a new account");
		signup.setBounds(520, 290, 240, 30);
		signup.setBackground(Color.orange);
		signup.setFocusable(false);

		adminlogin= new JButton("Admin Login");
		adminlogin.setBounds(520, 330, 240, 30);
		adminlogin.setBackground(Color.orange);
		adminlogin.setFocusable(false);

		loginPageImg = new JLabel();
		loginPageImg.setIcon(new ImageIcon("Storage/Login Page.jpg"));
		loginPageImg.setBounds(0, -290, 1902, 1076);

		Loginframe.add(userNameLabel);
		Loginframe.add(passwordLabel);
		Loginframe.add(userNameText);
		Loginframe.add(passwordText);
		Loginframe.add(loginPageText);
		Loginframe.add(loginB);
		Loginframe.add(signup);
		Loginframe.add(adminlogin);
		Loginframe.add(loginPageImg);
		Loginframe.setResizable(false);

		Loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Loginframe.setLayout(null);

		Loginframe.setTitle("E-Ticketing");
		Loginframe.setSize(815, 530);

		loginB.addActionListener(this);
		signup.addActionListener(this);
		adminlogin.addActionListener(this);
		

		Loginframe.setVisible(true);
		Loginframe.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == signup) {

			Loginframe.setVisible(false);
			new Register();
		}

		if (e.getSource() == adminlogin) {

			Loginframe.setVisible(false);
			new AdminLogin();
		}

		if (e.getSource() == loginB) {

			String user = userNameText.getText();
			String pass = passwordText.getText();
            String file = "Data/Registration.txt";
			if (user.isEmpty() || pass.isEmpty()) {
				
				
				JOptionPane.showMessageDialog(null, "Please Enter Username and Password");
			}

			else {

	            try {
                    String userName = "User Name: " + user;
                    String password = "Password: " + pass;
                    BufferedReader reader = new BufferedReader(new FileReader(file));

                    int totalLines = 0;
                    while (reader.readLine() != null)
                        totalLines++;
                    reader.close();

                    for (int i = 0; i <= totalLines; i++) {
                        String line1 = Files.readAllLines(Paths.get(file)).get(i+2);
                        if (line1.equals(userName)) {
                            String line2 = Files.readAllLines(Paths.get(file)).get((i + 3));
                            if (line2.equals(password)) {
                            	
								Loginframe.setVisible(false);
                                Login2 l = new Login2();
                                l.setVisible(true);
                                break;
                            }
                        }  
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }

			}

		}

	}

	// public static void main(String[] args) {
	// 	new Login();

	// }

}
