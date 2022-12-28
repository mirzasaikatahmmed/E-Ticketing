import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AdminDashboard extends JFrame implements ActionListener{
	
	JPanel menuPanel,titleJPanel,dataTablePanel,busTablePanel,SteamerTablePanel,airplaneTablePanel;
	JLabel menuLabel;
	JButton button,busButton,steamerButton,airPlaneButton;
	JTable table,busTable,steamerTable,airPlanetTable;
	DefaultTableModel model,busModel,steamerModel,airPlaneModel;
	JScrollPane pane,busPane,steamerPane,airPlanePane;
	
	String[] column= new String[] {"First Name","Last Name","User Name","Password","Phone Number","Email"};
	String[] row = new String[6];
	
	
	String[] column2= new String[] {"From","To","Booking Date","Arrival","Seat No","Type","Total Cost"};
	String[] row2 = new String[8];
	
	
	public AdminDashboard() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		titleJPanel = new JPanel();
		titleJPanel.setBounds(0,0,900,50);
		titleJPanel.setBackground(Color.gray);
		titleJPanel.setLayout(null);
		this.add(titleJPanel);
		
		
		menuPanel = new JPanel();
		menuPanel.setBounds(0,50,170,600);
		menuPanel.setBackground(Color.blue);
		menuPanel.setLayout(null);
		this.add(menuPanel);
		
		menuLabel = new JLabel("Menu");
		menuLabel.setBounds(10,20,100,30);
		menuLabel.setFont(new Font("Arial",Font.BOLD,20));
		menuPanel.add(menuLabel);
		
				
		button = new JButton("User Data");
		button.setBounds(10,60,160,30);
		button.setFocusable(false);
		button.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,20));
		button.setForeground(Color.white);
		button.setBackground(Color.blue);
		menuPanel.add(button);
		
		busButton = new JButton("Bus Data");
		busButton.setBounds(10,110,160,30);
		busButton.setFocusable(false);
		busButton.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,20));
		busButton.setForeground(Color.white);
		busButton.setBackground(Color.blue);
		menuPanel.add(busButton);
		
		steamerButton = new JButton("Steamer Data");
		steamerButton.setBounds(10,160,160,30);
		steamerButton.setFocusable(false);
		steamerButton.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,20));
		steamerButton.setForeground(Color.white);
		steamerButton.setBackground(Color.blue);
		menuPanel.add(steamerButton);
		
		airPlaneButton = new JButton("Airplane Data");
		airPlaneButton.setBounds(10,210,160,30);
		airPlaneButton.setFocusable(false);
		airPlaneButton.setFont(new Font("Segoe UI SemiBold",Font.PLAIN,20));
		airPlaneButton.setForeground(Color.white);
		airPlaneButton.setBackground(Color.blue);
		menuPanel.add(airPlaneButton);
		
		userDataTable();
		busDataTable();
		steamerDataTable();
		airPlaneDataTable();
			
		
		button.addActionListener(this);
		busButton.addActionListener(this);
		steamerButton.addActionListener(this);
		airPlaneButton.addActionListener(this);
		
	
	}
	
		
public void userDataTable() {
		dataTablePanel = new JPanel();
		dataTablePanel.setBounds(170,50,730,550);
		dataTablePanel.setLayout(null);
		dataTablePanel.setVisible(false);
		this.add(dataTablePanel);
		
		table = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		table.setModel(model);
		table.setFont(new Font("Segoe UI", Font.BOLD, 10));
		table.setSelectionBackground(Color.pink);
		table.setRowHeight(30);
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.getColumnModel().getColumn(5).setPreferredWidth(120);

		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setBackground(Color.gray);
		tableHeader.setForeground(Color.white);
		tableHeader.setFont(new Font("Segoe UI", Font.ITALIC, 15));

		pane = new JScrollPane(table);
		pane.setBounds(20, 20, 650, 360);
		dataTablePanel.add(pane);
		
		String file1 = "Data/Registration.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			int totalLines = 0;

			while (reader.readLine() != null)
				totalLines++;
			reader.close();

			for (int i = 0; i < totalLines; i++) {
				String line = Files.readAllLines(Paths.get(file1)).get(i);
				String a = line.substring(0, 10);
				if (a.equals("First Name")) {
					row[0] = Files.readAllLines(Paths.get(file1)).get(i).substring(12);
					row[1] = Files.readAllLines(Paths.get(file1)).get(i + 1).substring(11);
					row[2] = Files.readAllLines(Paths.get(file1)).get(i + 2).substring(11);
					row[3] = Files.readAllLines(Paths.get(file1)).get(i + 3).substring(10);
					row[4] = Files.readAllLines(Paths.get(file1)).get(i + 4).substring(14);
					row[5] = Files.readAllLines(Paths.get(file1)).get(i + 5).substring(7);
					model.addRow(row);
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
}
	
	
public void busDataTable() {
		
		
		busTablePanel = new JPanel();
		busTablePanel.setBounds(170,50,730,550);
		busTablePanel.setBackground(Color.darkGray);
		busTablePanel.setLayout(null);
		busTablePanel.setVisible(false);
		this.add(busTablePanel);
		
		busTable = new JTable();
		busModel = new DefaultTableModel();
		busModel.setColumnIdentifiers(column2);
		busTable.setModel(busModel);
		busTable.setFont(new Font("Segoe UI", Font.BOLD, 10));
		busTable.setSelectionBackground(Color.pink);
		busTable.setRowHeight(30);
		
		busTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		busTable.getColumnModel().getColumn(0).setPreferredWidth(100);
		busTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		busTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		busTable.getColumnModel().getColumn(3).setPreferredWidth(100);
		busTable.getColumnModel().getColumn(4).setPreferredWidth(100);
		busTable.getColumnModel().getColumn(5).setPreferredWidth(100);
		busTable.getColumnModel().getColumn(6).setPreferredWidth(100);

		JTableHeader tableHeader = busTable.getTableHeader();
		tableHeader.setBackground(Color.red);
		tableHeader.setForeground(Color.white);
		tableHeader.setFont(new Font("Segoe UI", Font.ITALIC, 15));

		busPane = new JScrollPane(busTable);
		busPane.setBounds(20, 20, 670, 400);
		busTablePanel.add(busPane);
		
		String file1 = "Data/BusData.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			int totalLines = 0;

			while (reader.readLine() != null)
				totalLines++;
			reader.close();

			for (int i = 0; i < totalLines; i++) {
				String line = Files.readAllLines(Paths.get(file1)).get(i);
				String a = line.substring(0, 4);
				if (a.equals("From")) {
					row2[0] = Files.readAllLines(Paths.get(file1)).get(i ).substring(7);
					row2[1] = Files.readAllLines(Paths.get(file1)).get(i + 1).substring(5);
					row2[2] = Files.readAllLines(Paths.get(file1)).get(i + 2).substring(14);
					row2[3] = Files.readAllLines(Paths.get(file1)).get(i + 3).substring(10);
					row2[4] = Files.readAllLines(Paths.get(file1)).get(i + 4).substring(10);
					row2[5] = Files.readAllLines(Paths.get(file1)).get(i + 5).substring(7);
					row2[6] = Files.readAllLines(Paths.get(file1)).get(i + 6).substring(13);
					busModel.addRow(row2);
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
public void steamerDataTable() {
	
		SteamerTablePanel = new JPanel();
		SteamerTablePanel.setBounds(170,50,730,550);
		SteamerTablePanel.setLayout(null);
		SteamerTablePanel.setVisible(false);
		this.add(SteamerTablePanel);
		
		steamerTable = new JTable();
		steamerModel = new DefaultTableModel();
		steamerModel.setColumnIdentifiers(column2);
		steamerTable.setModel(steamerModel);
		steamerTable.setFont(new Font("Segoe UI", Font.BOLD, 10));
		steamerTable.setSelectionBackground(Color.pink);
		steamerTable.setRowHeight(30);
		
		steamerTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		steamerTable.getColumnModel().getColumn(0).setPreferredWidth(100);
		steamerTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		steamerTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		steamerTable.getColumnModel().getColumn(3).setPreferredWidth(100);
		steamerTable.getColumnModel().getColumn(4).setPreferredWidth(100);
		steamerTable.getColumnModel().getColumn(5).setPreferredWidth(100);
		steamerTable.getColumnModel().getColumn(6).setPreferredWidth(100);

		JTableHeader tableHeader = steamerTable.getTableHeader();
		tableHeader.setBackground(Color.gray);
		tableHeader.setForeground(Color.white);
		tableHeader.setFont(new Font("Segoe UI", Font.ITALIC, 15));

		steamerPane = new JScrollPane(steamerTable);
		steamerPane.setBounds(20, 20, 650, 360);
		SteamerTablePanel.add(steamerPane);
		
		String file1 = "Data/ShipData.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			int totalLines = 0;

			while (reader.readLine() != null)
				totalLines++;
			reader.close();

			for (int i = 0; i < totalLines; i++) {
				String line = Files.readAllLines(Paths.get(file1)).get(i);
				String a = line.substring(0, 4);
				if (a.equals("From")) {
					row2[0] = Files.readAllLines(Paths.get(file1)).get(i).substring(7);
					row2[1] = Files.readAllLines(Paths.get(file1)).get(i + 1).substring(5);
					row2[2] = Files.readAllLines(Paths.get(file1)).get(i + 2).substring(14);
					row2[3] = Files.readAllLines(Paths.get(file1)).get(i + 3).substring(10);
					row2[4] = Files.readAllLines(Paths.get(file1)).get(i + 4).substring(10);
					row2[5] = Files.readAllLines(Paths.get(file1)).get(i + 5).substring(7);
					row2[6] = Files.readAllLines(Paths.get(file1)).get(i + 6).substring(13);
					steamerModel.addRow(row2);
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
public void airPlaneDataTable() {
		
		
		airplaneTablePanel = new JPanel();
		airplaneTablePanel.setBounds(170,50,730,550);
		airplaneTablePanel.setLayout(null);
		airplaneTablePanel.setVisible(false);
		this.add(airplaneTablePanel);
		
		airPlanetTable = new JTable();
		airPlaneModel = new DefaultTableModel();
		airPlaneModel.setColumnIdentifiers(column2);
		airPlanetTable.setModel(busModel);
		airPlanetTable.setFont(new Font("Segoe UI", Font.BOLD, 10));
		airPlanetTable.setSelectionBackground(Color.pink);
		airPlanetTable.setRowHeight(30);
		
		airPlanetTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		airPlanetTable.getColumnModel().getColumn(0).setPreferredWidth(100);
		airPlanetTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		airPlanetTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		airPlanetTable.getColumnModel().getColumn(3).setPreferredWidth(100);
		airPlanetTable.getColumnModel().getColumn(4).setPreferredWidth(100);
		airPlanetTable.getColumnModel().getColumn(5).setPreferredWidth(100);
		airPlanetTable.getColumnModel().getColumn(6).setPreferredWidth(100);

		JTableHeader tableHeader = airPlanetTable.getTableHeader();
		tableHeader.setForeground(Color.white);
		tableHeader.setFont(new Font("Segoe UI", Font.ITALIC, 15));

		airPlanePane = new JScrollPane(airPlanetTable);
		airPlanePane.setBounds(20, 20, 650, 360);
		airplaneTablePanel.add(airPlanePane);
		
		String file1 = "Data/PlaneData.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			int totalLines = 0;

			while (reader.readLine() != null)
				totalLines++;
			reader.close();

			for (int i = 0; i < totalLines; i++) {
				String line = Files.readAllLines(Paths.get(file1)).get(i);
				String a = line.substring(0, 4);
				if (a.equals("From")) {
					row2[0] = Files.readAllLines(Paths.get(file1)).get(i).substring(7);
					row2[1] = Files.readAllLines(Paths.get(file1)).get(i + 1).substring(5);
					row2[2] = Files.readAllLines(Paths.get(file1)).get(i + 2).substring(14);
					row2[3] = Files.readAllLines(Paths.get(file1)).get(i + 3).substring(10);
					row2[4] = Files.readAllLines(Paths.get(file1)).get(i + 4).substring(10);
					row2[5] = Files.readAllLines(Paths.get(file1)).get(i + 5).substring(7);
					row2[6] = Files.readAllLines(Paths.get(file1)).get(i + 6).substring(13);
					airPlaneModel.addRow(row2);
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			dataTablePanel.setVisible(true);
			busTablePanel.setVisible(false);
			SteamerTablePanel.setVisible(false);
			airplaneTablePanel.setVisible(false);
		}
		if (e.getSource()==busButton) {
			busTablePanel.setVisible(true);
			dataTablePanel.setVisible(false);
			SteamerTablePanel.setVisible(false);
			airplaneTablePanel.setVisible(false);
		}
		if (e.getSource()==steamerButton) {
			SteamerTablePanel.setVisible(true);
			busTablePanel.setVisible(false);
			dataTablePanel.setVisible(false);
			airplaneTablePanel.setVisible(false);
		}
		if (e.getSource()==airPlaneButton) {
			airplaneTablePanel.setVisible(true);
			busTablePanel.setVisible(false);
			dataTablePanel.setVisible(false);
			SteamerTablePanel.setVisible(false);
			
		}
	
		
	}	
	
	// public static void main(String[] args) {
	// 	AdminDashboard a = new AdminDashboard();
	// 	a.setVisible(true);
	// }
}