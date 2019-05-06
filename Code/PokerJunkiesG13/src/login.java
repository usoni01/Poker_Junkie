import java.awt.EventQueue;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class login extends JFrame {

	ImageIcon login = new ImageIcon(new ImageIcon("icon/honor_diamond.png").getImage().getScaledInstance(292, 250, Image.SCALE_DEFAULT));
	
	public JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		login window = new login();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public login() {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Texas Hold'em | Login");
		frame.setResizable(false);
		frame.setBounds(100, 100, 627, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel welcome = new JPanel();
		welcome.setBounds(-132, 0, 459, 431);
		frame.getContentPane().add(welcome);
		welcome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setBounds(213, 38, 213, 57);
		welcome.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Level:");
		lblNewLabel_1.setBounds(188, 115, 68, 19);
		welcome.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		
		
		

		JLabel lblLogin = new JLabel("Username");
		lblLogin.setIcon(null);
		
		lblLogin.setBounds(282, 217, 75, 23);
		welcome.add(lblLogin);
		lblLogin.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setIcon(null);
		lblPassword.setBounds(282, 285, 75, 29);
		welcome.add(lblPassword);
		lblPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		
		JTextField	txtLogin = new JTextField();
		txtLogin.setText("");
		txtLogin.setBounds(213, 251, 213, 23);
		welcome.add(txtLogin);
		txtLogin.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setText("");
		passwordField.setBounds(213, 317, 213, 23);
		welcome.add(passwordField);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Pro");
		rdbtnAdmin.setBackground(new Color(51, 153, 204));
		rdbtnAdmin.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		rdbtnAdmin.setSelected(true);
		buttonGroup.add(rdbtnAdmin);
		rdbtnAdmin.setBounds(282, 115, 84, 23);
		welcome.add(rdbtnAdmin);
		
		JRadioButton rdbtnEmployee = new JRadioButton("Noob");
		rdbtnEmployee.setBackground(new Color(51, 153, 204));
		rdbtnEmployee.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		buttonGroup.add(rdbtnEmployee);
		rdbtnEmployee.setBounds(282, 141, 84, 23);
		welcome.add(rdbtnEmployee);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setIcon(null);
		btnLogin.setBackground(new Color(51, 153, 204));
		btnLogin.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String name= txtLogin.getText();
				String pass=passwordField.getText();
 				String namedb = null,passdb=null;
 				
 				if(txtLogin.getText().isEmpty() || passwordField.getText().isEmpty())
 				{
 					JOptionPane.showMessageDialog(frame, "Please Fill All The Fields");
 				}
 				
 				else
 				{
				if(rdbtnAdmin.isSelected())
				{
					
					
				            	
				            		JOptionPane.showMessageDialog(frame, "Login Success");
				            		frame.dispose();
				            		
				            		try {
				            				new Game();
				            		
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}      	
				            	}
 				}
			}
		});
		btnLogin.setBounds(254, 359, 137, 35);
		welcome.add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(308, 0, 313, 435);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(login);
		label.setBounds(21, 41, 292, 305);
		panel.add(label);
		
	
		
		
	}
	
	
}
