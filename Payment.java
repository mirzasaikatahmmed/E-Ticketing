import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Payment extends JFrame implements ActionListener {
	
		JLabel titleLabel;
		JTextField nameField,cardField,validField,cvvField;
		JButton confirmButton,exitButton,backButton;
		
	
	public Payment() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 450);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
	
		
		titleLabel = new JLabel("Complete Your Payment Total Ammount: " +TotalCost()  );
		titleLabel.setBounds(110, 40, 1000, 50);
		titleLabel.setFont(new Font("Segoe UI Black",Font.PLAIN,22));
		this.add(titleLabel);
		
		
		titleLabel = new JLabel("We Accept Only");
		titleLabel.setBounds(130, 100, 200, 50);
		titleLabel.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,20));
		this.add(titleLabel);
		
		titleLabel = new JLabel();
		titleLabel.setIcon(new ImageIcon(getClass().getResource("Storage/MasterCard.png")));
		titleLabel.setBounds(280,100,100,50);
		this.add(titleLabel);
		
		
		titleLabel = new JLabel();
		titleLabel.setIcon(new ImageIcon(getClass().getResource("Storage/VisaCard.png")));
		titleLabel.setBounds(360,100,100,50);
		this.add(titleLabel);
		
		titleLabel = new JLabel("Card Details");
		titleLabel.setBounds(130, 150, 200, 50);
		titleLabel.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,20));
		this.add(titleLabel);
		
		titleLabel = new JLabel("Name On Card :");
		titleLabel.setBounds(140, 190, 200, 50);
		titleLabel.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(titleLabel);
		
		nameField = new JTextField();
		nameField.setBounds(275, 200, 300, 30);
		nameField.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(nameField);
		
		
		titleLabel = new JLabel("Card Number :");
		titleLabel.setBounds(140, 230, 200, 50);
		titleLabel.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(titleLabel);
		
		
		cardField = new JTextField();
		cardField.setBounds(275, 240, 300, 30);
		cardField.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(cardField);
		
		titleLabel = new JLabel("Valid On :");
		titleLabel.setBounds(140, 270, 120, 50);
		titleLabel.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(titleLabel);
		
		validField = new JTextField();
		validField.setBounds(230, 280, 120, 30);
		validField.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(validField);
		
		
		titleLabel = new JLabel("CVV Code :");
		titleLabel.setBounds(365, 270, 120, 50);
		titleLabel.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(titleLabel);
		
		
		cvvField = new JTextField();
		cvvField.setBounds(460, 280, 120, 30);
		cvvField.setFont(new Font("Segoe UI",Font.PLAIN,18));
		this.add(cvvField);
		
		
		confirmButton = new JButton("Confirm Payment");
		confirmButton.setBounds(330, 330, 250, 50);
		confirmButton.setFocusable(false);
		confirmButton.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		confirmButton.setForeground(Color.white);
		confirmButton.setBackground(Color.decode("#2E75B6"));
		this.add(confirmButton);
		
		
		exitButton = new JButton("EXIT");
		exitButton.setBounds(140, 330, 140, 50);
		exitButton.setFocusable(false);
		exitButton.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		exitButton.setForeground(Color.white);
		exitButton.setBackground(Color.decode("#C00000"));
		this.add(exitButton);

	
		backButton = new JButton("<<Back");
		backButton.setBounds(0, 0, 150, 50);
		backButton.setFocusable(false);
		backButton.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		backButton.setForeground(Color.white);
		backButton.setBackground(Color.decode("#2E75B6"));
        this.add(backButton);
		
		
		
		confirmButton.addActionListener(this);
		exitButton.addActionListener(this);
		backButton.addActionListener(this);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==exitButton) {
			
			System.exit(0);
		}
		
		
		if (e.getSource() == backButton)
		{
			dispose();
			Login2 Login2 = new Login2();
			Login2.setVisible(true);
		}
		if(e.getSource()==confirmButton) {
			
			String name = nameField.getText();
			String card = cardField.getText();
			String valid = validField.getText();
			String cvv = cvvField.getText();
			
			if (name.isEmpty()||card.isEmpty()||valid.isEmpty()||cvv.isEmpty()) {
				
				JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
				
			}
				
				else {
                    setVisible(false);
                   PaySuccess frame = new PaySuccess();
                   frame.setVisible(true);
			}
		}
		
	}
	
	public static void main (String [] args) {
		Payment payment = new Payment();
		payment.setVisible(true);
	}
}






