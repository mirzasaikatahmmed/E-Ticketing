import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
//import java.security.PublicKey;
import java.time.LocalDate;

public class PlaneDashboard extends JFrame implements ActionListener {
	ImageIcon icon;
	JLabel iconLabel, jLabel1, jLabel2,totalCostLabel, jLabel3,jLabel4;
	JComboBox jComboBox, jComboBox2, jComboBox3, jComboBox4,jComboBox5,jComboBox6;
	JButton jButton, jButton2, jButton3, backButton;
	JPanel iconPanel, paymentPanel;
	JTextField datefield, datefield2,coachField;
	JLabel showPlainData;
	JTextField fromField,toField,seatField,typeField,bDateField,aDateField,cost2fiField,timeField;
	int totalCost;
	JRadioButton radioButton,radioButton2,radioButton3;

	public PlaneDashboard() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 570);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.decode("#3B9AE1"));

		iconPanel = new JPanel();
		iconPanel.setBounds(370, 0, 555, 630);
		iconPanel.setLayout(null);
		this.add(iconPanel);

		paymentPanel = new JPanel();
		paymentPanel.setBounds(0, 0, 555, 570);
		paymentPanel.setLayout(null);
		paymentPanel.setVisible(false);
		iconPanel.add(paymentPanel);

		icon = new ImageIcon(getClass().getResource("Storage/planedash.jpg"));
		iconLabel = new JLabel(icon);
		iconLabel.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		iconPanel.add(iconLabel);

		jLabel1 = new JLabel("WHERE WOULD YOU");
		jLabel1.setBounds(67, 50, 250, 30);
		jLabel1.setFont(new Font("Arial", Font.PLAIN, 22));
		jLabel1.setForeground(Color.black);
		this.add(jLabel1);

		jLabel2 = new JLabel("LIKE TO GO ?");
		jLabel2.setBounds(70, 75, 350, 40);
		jLabel2.setFont(new Font("Arial", Font.BOLD, 35));
		jLabel2.setForeground(Color.black);
		this.add(jLabel2);

		jLabel2 = new JLabel("From");
		jLabel2.setBounds(70, 120, 350, 15);
		jLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
		jLabel2.setForeground(Color.white);
		this.add(jLabel2);

		String[] from = { "Departure", "Bangladesh", "America", "Brazil", "Argentina" };
		jComboBox = new JComboBox(from);
		jComboBox.setBounds(70, 140, 230, 25);
		this.add(jComboBox);

		jLabel2 = new JLabel("To");
		jLabel2.setBounds(70, 173, 350, 15);
		jLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
		jLabel2.setForeground(Color.white);
		this.add(jLabel2);

		String[] from2 = { "Arrival", "Bangladesh", "America", "Brazil", "Argentina" };
		jComboBox2 = new JComboBox(from2);
		jComboBox2.setBounds(70, 190, 230, 25);
		this.add(jComboBox2);

		jLabel1 = new JLabel("Booking Date");
		jLabel1.setBounds(70, 223, 100, 15);
		jLabel1.setFont(new Font("Arial", Font.PLAIN, 13));
		jLabel1.setForeground(Color.white);
		this.add(jLabel1);

		jLabel1 = new JLabel("Arrival Date");
		jLabel1.setBounds(200, 223, 100, 15);
		jLabel1.setFont(new Font("Arial", Font.PLAIN, 13));
		jLabel1.setForeground(Color.white);
		this.add(jLabel1);

		jLabel2 = new JLabel("No.of person");
		jLabel2.setBounds(70, 277, 100, 15);
		jLabel2.setFont(new Font("Arial", Font.PLAIN, 13));
		jLabel2.setForeground(Color.white);
		this.add(jLabel2);

		String[] person = { "Select", "1", "2", "3", "4", "5", "6", "7" };
		jComboBox3 = new JComboBox(person);
		jComboBox3.setBounds(70, 294, 90, 25);
		this.add(jComboBox3);

		jLabel2 = new JLabel("Type");
		jLabel2.setBounds(200, 277, 100, 15);
		jLabel2.setFont(new Font("Arial", Font.PLAIN, 13));
		jLabel2.setForeground(Color.white);
		this.add(jLabel2);

		String[] Type = { "Business", "Economy" };
		jComboBox4 = new JComboBox(Type);
		jComboBox4.setBounds(200, 294, 100, 25);
		this.add(jComboBox4);
		
		jLabel3 = new JLabel("Time");
		jLabel3.setBounds(70, 320, 100, 25);
		jLabel3.setFont(new Font("Arial",Font.PLAIN,13));
		jLabel3.setForeground(Color.white);
		this.add(jLabel3);
		
		String[] Time = {"9:00 AM", "10:00 AM",  "12:00 PM", "7:00 PM",  "10:00 PM", "11:15PM", "12:00 AM" };
		jComboBox5 = new JComboBox(Time);
		jComboBox5.setBounds(70, 340, 100, 25);
		this.add(jComboBox5);
		
		jLabel4 =new JLabel("Airlines");
		jLabel4.setBounds(200,320,100,25);
		jLabel4.setFont(new Font("Arial",Font.PLAIN,13));
		jLabel4.setForeground(Color.white);
		this.add(jLabel4);
		
		String[] coach = { "Biman Bangladesh", "US-Bangla", "Novo-Air"};
		jComboBox6= new JComboBox(coach);
		jComboBox6.setBounds(200, 340, 140, 25);
		this.add(jComboBox6);
		
		

		datefield = new JTextField();
		datefield.setBounds(70, 240, 100, 30);
		datefield.setEditable(false);
		this.add(datefield);

		datefield2 = new JTextField();
		datefield2.setBounds(200, 240, 100, 30);
		this.add(datefield2);
		LocalDate date = LocalDate.now();
		datefield.setText("" + date);

		jButton3 = new JButton("Show Amount");
		jButton3.setBounds(70, 445, 230, 30);
		jButton3.setBackground(Color.orange);
		jButton3.setFocusable(false);
		this.add(jButton3);
		
		backButton = new JButton("<<Back");
		backButton.setBounds(0,0,100,30);
		backButton.setBackground(Color.decode("#3B9AE1"));
		backButton.setFocusable(false);
		this.add(backButton);

		jButton = new JButton("Proced to pay", new ImageIcon(getClass().getResource("Storage/money1.png")));
		jButton.setBounds(140, 460, 230, 30);
		jButton.setBackground(Color.orange);
		jButton.setFocusable(false);
		jButton.setVisible(false);
		paymentPanel.add(jButton);
		
		
		totalCostLabel = new JLabel();
		totalCostLabel.setBounds(120, 380,300 , 80);
		totalCostLabel.setFont(new Font("Arial",Font.BOLD,30));
		totalCostLabel.setForeground(Color.red);
		paymentPanel.add(totalCostLabel);
		
		
		
		
		showPlainData = new JLabel("Your Ticket Details");
		showPlainData.setBounds(90,30,250,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,25));
		paymentPanel.add(showPlainData);
		
		showPlainData = new JLabel("From : ");
		showPlainData.setBounds(90,80,100,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		showPlainData = new JLabel("To : ");
		showPlainData.setBounds(90,120,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		showPlainData = new JLabel("Booking Date : ");
		showPlainData.setBounds(90,160,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		showPlainData = new JLabel("Travel Date  : ");
		showPlainData.setBounds(90,200,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		showPlainData = new JLabel("Number Of Seat : ");
		showPlainData.setBounds(90,240,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		showPlainData = new JLabel("Type : ");
		showPlainData.setBounds(90,280,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		showPlainData= new JLabel("Airlines : ");
		showPlainData.setBounds(250,280,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		

		showPlainData = new JLabel("Time : ");
		showPlainData.setBounds(90,320,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		
		
		showPlainData = new JLabel("Fair :");
		showPlainData.setBounds(90,360,200,30);
		showPlainData.setFont(new Font("Arial",Font.BOLD,15));
		paymentPanel.add(showPlainData);
		
		
		fromField = new JTextField();
		fromField.setBounds(150,80,200,30);
		fromField.setFont(new Font("Arial",Font.PLAIN,15));
		fromField.setEditable(false);
		paymentPanel.add(fromField);
		
		
		toField = new JTextField();
		toField.setBounds(150,120,200,30);
		toField.setFont(new Font("Arial",Font.PLAIN,15));
		toField.setEditable(false);
		paymentPanel.add(toField);
		
		bDateField = new JTextField();
		bDateField.setBounds(210,160,200,30);
		bDateField.setFont(new Font("Arial",Font.PLAIN,15));
		bDateField.setEditable(false);
		paymentPanel.add(bDateField);
		
		
		aDateField = new JTextField();
		aDateField.setBounds(210,200,200,30);
		aDateField.setFont(new Font("Arial",Font.PLAIN,15));
		aDateField.setEditable(false);
		paymentPanel.add(aDateField);
		
		
		seatField = new JTextField();
		seatField.setBounds(220,240,200,30);
		seatField.setFont(new Font("Arial",Font.PLAIN,15));
		seatField.setEditable(false);
		paymentPanel.add(seatField);
		
		
		typeField = new JTextField();
		typeField.setBounds(145,280,100,30);
		typeField.setFont(new Font("Arial",Font.PLAIN,15));
		typeField.setEditable(false);
		paymentPanel.add(typeField);
		
		coachField = new JTextField();
		coachField.setBounds(325, 280, 150, 30 );
	    coachField.setFont(new Font("Arial",Font.PLAIN,15));
		coachField.setEditable(false);
		paymentPanel.add(coachField);
		
		timeField = new JTextField();
		timeField.setBounds(150,320,180,30);
		timeField.setFont(new Font("Arial",Font.PLAIN,15));
		timeField.setEditable(false);
		paymentPanel.add(timeField);

		
		cost2fiField = new JTextField();
		cost2fiField.setBounds(145, 360, 200, 30);
		cost2fiField.setFont(new Font("Arial",Font.PLAIN,15));
		cost2fiField.setEditable(false);
		paymentPanel.add(cost2fiField);
		jButton3.addActionListener(this);
		backButton.addActionListener(this);
		jButton.addActionListener(this);

		
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jButton3) {

			if (jComboBox.getSelectedIndex() == 0 && jComboBox2.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null,  "Please select Departure and Arival", "WARNING",JOptionPane.WARNING_MESSAGE);
			}

			else if (jComboBox.getSelectedIndex() == 1 && jComboBox2.getSelectedIndex() == 1) {
				JOptionPane.showMessageDialog(null, " You have selected same Departure and Arrival", "WARNING!!",JOptionPane.WARNING_MESSAGE);
			}

			else if (jComboBox.getSelectedIndex() == 2 && jComboBox2.getSelectedIndex() == 2) {
				JOptionPane.showMessageDialog(null, " You have selected same Departure and Arrival", "WARNING!!",JOptionPane.WARNING_MESSAGE);

			}

			else if (jComboBox.getSelectedIndex() == 3 && jComboBox2.getSelectedIndex() == 3) {
				JOptionPane.showMessageDialog(null, " You have selected same Departure and Arrival", "WARNING!!",JOptionPane.WARNING_MESSAGE);
			}

			else if (jComboBox.getSelectedIndex() == 4 && jComboBox2.getSelectedIndex() == 4) {
				JOptionPane.showMessageDialog(null, " You have selected same Deparure and Arrival", "WARNING!!",JOptionPane.WARNING_MESSAGE);
			}
				else if (jComboBox.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, " Please select departure", "WARNING!!",JOptionPane.WARNING_MESSAGE);
				}
				else if (jComboBox2.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, " Please select Arival", "WARNING!!",JOptionPane.WARNING_MESSAGE);
				}

				else if (datefield2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, " Please Write Arrival Date", "WARNING!!",JOptionPane.WARNING_MESSAGE);
				}

				
			 else if (jComboBox3.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null, "W Please Select Number of person", "WARNING!!",JOptionPane.WARNING_MESSAGE);
			}
			
			
			else {
				try {

					int cost = 0;
					if (jComboBox.getSelectedIndex() == 1 && jComboBox2.getSelectedIndex() == 2) {
						cost = 4000;
					} else if (jComboBox.getSelectedIndex() == 1 && jComboBox2.getSelectedIndex() == 3) {
						cost = 4800;

					} else if (jComboBox.getSelectedIndex() == 1 && jComboBox2.getSelectedIndex() == 4) {
						cost = 4500;

					} else if (jComboBox.getSelectedIndex() == 2 && jComboBox2.getSelectedIndex() == 1) {
						cost = 5000;

					} else if (jComboBox.getSelectedIndex() == 2 && jComboBox2.getSelectedIndex() == 3) {
						cost = 5500;

					} else if (jComboBox.getSelectedIndex() == 2 && jComboBox2.getSelectedIndex() == 4) {
						cost = 4400;

					} else if (jComboBox.getSelectedIndex() == 3 && jComboBox2.getSelectedIndex() == 1) {
						cost = 4800;

					} else if (jComboBox.getSelectedIndex() == 3 && jComboBox2.getSelectedIndex() == 2) {
						cost = 5500;

					} else if (jComboBox.getSelectedIndex() == 3 && jComboBox2.getSelectedIndex() == 4) {
						cost = 5200;

					} else if (jComboBox.getSelectedIndex() == 4 && jComboBox2.getSelectedIndex() == 1) {
						cost = 4500;

					} else if (jComboBox.getSelectedIndex() == 4 && jComboBox2.getSelectedIndex() == 2) {
						cost = 4400;

					} else if (jComboBox.getSelectedIndex() == 4 && jComboBox2.getSelectedIndex() == 3) {
						cost = 5200;

					}
					int cost2 = cost * (jComboBox3.getSelectedIndex());
					int cost3 = jComboBox3.getSelectedIndex();
					int cost4 = 0;
					if (jComboBox4.getSelectedIndex() == 0) {
						
						cost4 = 0 * cost3;
					}
					else if (jComboBox4.getSelectedIndex()==1) {
						
						cost4= -1200*cost3;
						
					}
					totalCost = cost2 + cost4;

					File file = new File(
							"Data/PlaneData.txt");
					if (!file.exists()) {

						file.createNewFile();
					}

					FileWriter fileWriter = new FileWriter(file, true);
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
					PrintWriter printWriter = new PrintWriter(fileWriter);

					printWriter.println("From : " + jComboBox.getSelectedItem());
					printWriter.println("To : " + jComboBox2.getSelectedItem());
					printWriter.println("Booking Date: " + datefield.getText());
					printWriter.println("Arrival : " + datefield2.getText());
					printWriter.println("Seat No : " + jComboBox3.getSelectedItem());
					printWriter.println("Type : " + jComboBox4.getSelectedItem());
					printWriter.println("Airlines : "+jComboBox6.getSelectedItem());
					printWriter.println("Time : "+jComboBox5.getSelectedItem());
					printWriter.println("Total Cost : " + totalCost);
					printWriter.println("=========================================");
					printWriter.close();

					jButton.setVisible(true);
					
					
					paymentPanel.setVisible(true);
					
					totalCostLabel.setText("Total Cost : "+totalCost);
					fromField.setText(""+jComboBox.getSelectedItem());
					toField.setText(""+jComboBox2.getSelectedItem());
					bDateField.setText(""+datefield.getText());
					aDateField.setText(""+datefield2.getText());
					seatField.setText(""+jComboBox3.getSelectedItem());
					typeField.setText(""+jComboBox4.getSelectedItem());
					timeField.setText(""+jComboBox5.getSelectedItem());
					coachField.setText(""+jComboBox6.getSelectedItem());
					if (jComboBox4.getSelectedIndex() == 0) {
						cost2fiField.setText(""+(cost));
					}else if (jComboBox4.getSelectedIndex()==1) {
						cost2fiField.setText(""+(cost-1200));
					}
					
				}

				catch (Exception e2) {

					System.out.println(e2);
				}
			}

		}
		if (e.getSource() == jButton) {
			dispose();
			Payment payment =new Payment();
			payment.setVisible(true);
		}
		if(e.getSource() == backButton) {
			dispose();
			Login2 Login2 = new Login2();
			Login2.setVisible(true);
		}

	}
	
	
	// public static void main(String[] args) {
	// 	PlaneDashboard plane = new PlaneDashboard();
	// 	plane.setVisible(true);

	// }

}
