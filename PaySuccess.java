import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaySuccess extends JFrame implements ActionListener {
	
	JLabel paysuccJLabel;
	JButton finishButton;
	
	public PaySuccess() {
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		finishButton = new JButton("FINISH");
		finishButton.setBounds(270, 420, 140, 40);
		finishButton.setFocusable(false);
		finishButton.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		finishButton.setForeground(Color.white);
		finishButton.setBackground(Color.decode("#C00000"));
		this.add(finishButton);
		
		paysuccJLabel = new JLabel();
		paysuccJLabel.setIcon(new ImageIcon(getClass().getResource("Storage/Payment-success.png")));
		paysuccJLabel.setBounds(0, 0, 700, 420);
		this.add(paysuccJLabel);
		
		finishButton.addActionListener(this);
		
		
	}
	
	
	public static void main (String [] args) {
		
		PaySuccess p = new PaySuccess();
		p.setVisible(true);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==finishButton) {
			
			System.exit(0);
		}
		
	}
	}

