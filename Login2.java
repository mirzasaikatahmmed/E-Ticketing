import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login2 extends JFrame implements ActionListener {
	ImageIcon icon;
	JLabel iconLabel,jLabel1,jLabel2;
	JButton Button1,Button2,Button3,logoutmbtn;
	JPanel menuPanel;
	
	public Login2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(820,630);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		
		icon = new ImageIcon(getClass().getResource("Storage/Login2i.jpg"));
		iconLabel = new JLabel(icon);
		iconLabel.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
		this.add(iconLabel);

		
		menuPanel = new JPanel();
		menuPanel.setBounds(23,0,760,40);
		iconLabel.add(menuPanel);
		menuPanel.setBackground(Color.decode("#C1EFFF"));
		menuPanel.setLayout(null);
		
		logoutmbtn=new JButton("Logout",new ImageIcon(getClass().getResource("Storage/logout.png")));
		logoutmbtn.setBounds(650, 0,100 , 45);
		menuPanel.add(logoutmbtn);
		logoutmbtn.setBackground(Color.decode("#C1EFFF"));
		logoutmbtn.setFocusable(false);
		logoutmbtn.setBorder(BorderFactory.createEmptyBorder());
		logoutmbtn.setFont(new Font("Montserrat",Font.PLAIN,18));
		

		
		jLabel1 = new JLabel("WHAT TYPE OF TRANSPORT");
		jLabel1.setBounds(70,150,350,30);
		jLabel1.setFont(new Font("Arial",Font.PLAIN,22));
		jLabel1.setForeground(Color.white);
		iconLabel.add(jLabel1);
		
		jLabel2 = new JLabel("YOU WANT TO TRAVEL ?");
		jLabel2.setBounds(70,175,350,40);
		jLabel2.setFont(new Font("Arial",Font.BOLD,25));
		jLabel2.setForeground(Color.white);
		iconLabel.add(jLabel2);
		
		Button1 = new JButton("BUS",new ImageIcon(getClass().getResource("Storage/bus.png")));
		
		Button1.setBounds(70,220,180,30);
		Button1.setFocusable(false);
		Button1.setIconTextGap(10);
		Button1.setFont(new Font("Arial",Font.PLAIN,20));
		iconLabel.add(Button1);
		
		Button2 = new JButton("SHIP",new ImageIcon(getClass().getResource("Storage/ship.png")));
		Button2.setBounds(70,265,180,30);
		Button2.setFont(new Font("Arial",Font.PLAIN,20));
		Button2.setFocusable(false);
		iconLabel.add(Button2);
		
		Button3 = new JButton("FLIGHT",new ImageIcon(getClass().getResource("Storage/plane.png")));
		Button3.setBounds(70,310,180,30);
		Button3.setFont(new Font("Arial",Font.PLAIN,20));
		Button3.setFocusable(false);
		iconLabel.add(Button3);
		
		Button3.addActionListener(this);
		Button2.addActionListener(this);
		Button1.addActionListener(this);
		logoutmbtn.addActionListener(this);
		
        }


	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==Button3)
		{
			dispose();
			PlaneDashboard plndsh = new PlaneDashboard();
			plndsh.setVisible(true);
		}
		
		
		if (e.getSource()==logoutmbtn)
		{
			int a=JOptionPane.showConfirmDialog(null, "Are you sure to logout?","Logout",JOptionPane.YES_NO_OPTION);
			if(a==0) {
				dispose();
				 new Login();
			}
			
		}
		if (e.getSource()==Button2)
		{
			dispose();
			ShipDashboard shipdsh = new ShipDashboard();
			shipdsh.setVisible(true);
		}
		
		if (e.getSource()==Button1)
		{
			dispose();
			BusDashboard busdsh = new BusDashboard();
			busdsh.setVisible(true);
		}
		
	}

	// public static void main(String[] args) {
	// 	Login2 Login2 = new Login2();
	// 	Login2.setVisible(true);

	// }

}
