import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener{
	
	JLabel framepic;
	JButton jButton1,jButton2,jButton3,jButton4,jButton5,jButton6;
	
	public Admin() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1260, 840);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		
		
		jButton1 = new JButton("Manage Room");
		jButton1.setBounds(30, 40, 250, 40);
		jButton1.setFocusable(false);
		jButton1.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		jButton1.setForeground(Color.white);
		jButton1.setBackground(Color.decode("#b8860b"));
		this.add(jButton1);
		
		
		jButton2 = new JButton("Manage Customer");
		jButton2.setBounds(310, 40, 250, 40);
		jButton2.setFocusable(false);
		jButton2.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		jButton2.setForeground(Color.white);
		jButton2.setBackground(Color.decode("#b8860b"));
		this.add(jButton2);
		
		
		
		jButton3 = new JButton("Manage Employee");
		jButton3.setBounds(590, 40, 250, 40);
		jButton3.setFocusable(false);
		jButton3.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		jButton3.setForeground(Color.white);
		jButton3.setBackground(Color.decode("#b8860b"));
		this.add(jButton3);
		
		
		jButton4 = new JButton("Customer Details");
		jButton4.setBounds(870, 40, 250, 40);
		jButton4.setFocusable(false);
		jButton4.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		jButton4.setForeground(Color.white);
		jButton4.setBackground(Color.decode("#b8860b"));
		this.add(jButton4);
		
		
		jButton5 = new JButton("Logout");
		jButton5.setBounds(30, 100, 250, 40);
		jButton5.setFocusable(false);
		jButton5.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		jButton5.setForeground(Color.white);
		jButton5.setBackground(Color.decode("#b8860b"));
		this.add(jButton5);
		
		
		jButton6 = new JButton("EXIT");
		jButton6.setBounds(1150, 40, 90, 40);
		jButton6.setFocusable(false);
		jButton6.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,25));
		jButton6.setForeground(Color.white);
		jButton6.setBackground(Color.decode("#C00000"));
		this.add(jButton6);

		
		framepic = new JLabel();
		framepic.setIcon(new ImageIcon(getClass().getResource("Storage/hotel.jpg")));
		framepic.setBounds(0, 0, 1254, 836);
		this.add(framepic);
		
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
		jButton3.addActionListener(this);
		jButton4.addActionListener(this);
		jButton5.addActionListener(this);
		jButton6.addActionListener(this);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == jButton1) {
		
		}
		
		
		if(e.getSource()==jButton6) {
			
			System.exit(0);
		}
		
	}

	// public static void main (String [] args) {
		
	// 	Admin  a = new Admin();
	// 	a.setVisible(true);

// }
}