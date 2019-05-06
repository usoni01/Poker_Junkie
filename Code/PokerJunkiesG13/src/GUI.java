import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class GUI {
	
	JFrame frame;

	JLabel coc1,
	coc2,
	coc3,
	coc4,
	coc5,
	uc1,
	uc2,
	c1c1,
	c1c2,
	c2c1,
	c2c2,
	c3c1,
	c3c2,
	c4c1,
	c4c2,
	player,
	computer1,
	computer2,
	computer3,
	computer4,
	playerChoice,	
	computerChoice1,
	computerChoice2,
	computerChoice3,
	computerChoice4,
	potSize,
	score;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem aboutbox;
	private JMenuItem helpbox;
	JTextArea result; 
	 ImageIcon table = new ImageIcon(new ImageIcon("icon/19.jpg").getImage().getScaledInstance(901, 438, Image.SCALE_DEFAULT));
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 898);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 coc1 = new JLabel("Hidden");
		
		coc1.setBounds(416, 69, 60, 80);
		
		frame.getContentPane().add(coc1);
		
		 coc2 = new JLabel("Hidden");
		coc2.setBounds(488, 69, 60, 80);
	
		frame.getContentPane().add(coc2);
		
		 coc3 = new JLabel("Hidden");
		coc3.setBounds(550, 69, 60, 80);
	
		frame.getContentPane().add(coc3);
		
		 coc4 = new JLabel("Hidden");
		coc4.setBounds(612, 69, 60, 80);
		
		frame.getContentPane().add(coc4);
		
		 coc5 = new JLabel("Hidden");
		coc5.setBounds(684, 69, 60, 80);
		
		frame.getContentPane().add(coc5);
		
		JLabel lblPlayers = new JLabel("Players");
		lblPlayers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPlayers.setBounds(12, 187, 70, 32);
		frame.getContentPane().add(lblPlayers);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUser.setBounds(243, 187, 70, 32);
		frame.getContentPane().add(lblUser);
		
		JLabel lblComputer = new JLabel("Computer1");
		lblComputer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComputer.setBounds(381, 187, 98, 32);
		frame.getContentPane().add(lblComputer);
		
		JLabel lblComputer_1 = new JLabel("Computer2 ");
		lblComputer_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComputer_1.setBounds(567, 187, 111, 32);
		frame.getContentPane().add(lblComputer_1);
		
		JLabel lblComputer_2 = new JLabel("Computer3");
		lblComputer_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComputer_2.setBounds(751, 187, 98, 32);
		frame.getContentPane().add(lblComputer_2);
		
		JLabel lblComputer_3 = new JLabel("Computer4");
		lblComputer_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComputer_3.setBounds(930, 187, 98, 32);
		frame.getContentPane().add(lblComputer_3);
		
		JLabel lblCards = new JLabel("Cards");
		lblCards.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCards.setBounds(12, 307, 70, 32);
		frame.getContentPane().add(lblCards);
		
		 uc1 = new JLabel("");
		
		uc1.setBounds(204, 278, 60, 80);
		
		frame.getContentPane().add(uc1);
		
		 uc2 = new JLabel("");
	
		uc2.setBounds(276, 278, 60, 80);
		frame.getContentPane().add(uc2);
		
		 c1c1 = new JLabel("---Hidden");
	
		c1c1.setBounds(366, 278, 60, 80);
		frame.getContentPane().add(c1c1);
		
		 c1c2 = new JLabel("Hand");
		
		c1c2.setBounds(438, 278, 60, 80);
		frame.getContentPane().add(c1c2);
		
		 c2c1 = new JLabel("---Hidden");
		
		c2c1.setBounds(548, 278, 60, 80);
		frame.getContentPane().add(c2c1);
		
		 c2c2 = new JLabel("Hand");
	
		c2c2.setBounds(620, 278, 60, 80);
		frame.getContentPane().add(c2c2);
		
		 c3c1 = new JLabel("---Hidden");
		
		c3c1.setBounds(733, 278, 60, 80);
		frame.getContentPane().add(c3c1);
		
		 c3c2 = new JLabel("Hand");
		
		c3c2.setBounds(805, 278, 60, 80);
		frame.getContentPane().add(c3c2);
		
		 c4c1 = new JLabel("---Hidden");
		
		c4c1.setBounds(906, 278, 60, 80);
		frame.getContentPane().add(c4c1);
		
		 c4c2 = new JLabel("Hand");
		
		c4c2.setBounds(978, 278, 60, 80);
		frame.getContentPane().add(c4c2);
		
		JLabel lblBankRoll = new JLabel("Bank Roll");
		lblBankRoll.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBankRoll.setBounds(12, 455, 89, 32);
		frame.getContentPane().add(lblBankRoll);
		
		 player = new JLabel("1450");
		player.setBounds(243, 461, 47, 27);
		frame.getContentPane().add(player);
		
		 computer1 = new JLabel("1450");
		computer1.setBounds(407, 460, 47, 27);
		frame.getContentPane().add(computer1);
		
		 computer2 = new JLabel("1450");
		computer2.setBounds(590, 455, 47, 27);
		frame.getContentPane().add(computer2);
		
		 computer3 = new JLabel("1450");
		computer3.setBounds(770, 455, 47, 27);
		frame.getContentPane().add(computer3);
		
		 computer4 = new JLabel("1450");
		computer4.setBounds(969, 455, 47, 27);
		frame.getContentPane().add(computer4);
		
		JLabel lblTotalGamesWon = new JLabel("Total Games Won:");
		lblTotalGamesWon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalGamesWon.setBounds(0, 0, 166, 32);
		frame.getContentPane().add(lblTotalGamesWon);
		
		JLabel lblChoice = new JLabel("Choice");
		lblChoice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChoice.setBounds(12, 570, 89, 32);
		frame.getContentPane().add(lblChoice);
		
		 playerChoice = new JLabel("Bets 50");
		playerChoice.setBounds(220, 575, 93, 27);
		frame.getContentPane().add(playerChoice);
		
		 computerChoice1 = new JLabel("Calls");
		computerChoice1.setBounds(386, 570, 93, 27);
		frame.getContentPane().add(computerChoice1);
		
		 computerChoice2 = new JLabel("Calls");
		computerChoice2.setBounds(585, 570, 93, 27);
		frame.getContentPane().add(computerChoice2);
		
		 computerChoice3 = new JLabel("Calls");
		computerChoice3.setBounds(756, 570, 93, 27);
		frame.getContentPane().add(computerChoice3);
		
		 computerChoice4 = new JLabel("Calls");
		computerChoice4.setBounds(960, 570, 93, 27);
		frame.getContentPane().add(computerChoice4);
		
		JLabel lblPotSize = new JLabel("Pot Size:");
		lblPotSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPotSize.setBounds(515, 690, 89, 32);
		frame.getContentPane().add(lblPotSize);
		
		 potSize = new JLabel("250");
		potSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
		potSize.setBounds(616, 690, 89, 32);
		frame.getContentPane().add(potSize);
		
		 result = new JTextArea();
		result.setBounds(193, 758, 860, 80);
		frame.getContentPane().add(result);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(12, 786, 89, 32);
		frame.getContentPane().add(lblResult);
		
		JLabel lblCommunityCards = new JLabel("Community Cards");
		lblCommunityCards.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCommunityCards.setBounds(12, 90, 166, 32);
		frame.getContentPane().add(lblCommunityCards);
		
		score = new JLabel("");
		score.setFont(new Font("Tahoma", Font.PLAIN, 20));
		score.setBounds(63, 27, 70, 32);
		frame.getContentPane().add(score);
		
		JLabel Table = new JLabel("Table");
		Table.setIcon(table);
		Table.setBounds(178, 0, 901, 438);
		frame.getContentPane().add(Table);
		
		// menubar init
		/*
		menubar = new JMenuBar();
		menu = new JMenu("File");
		aboutbox = new JMenuItem("About");
		helpbox = new JMenuItem("Help");
		class aboutaction implements ActionListener {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(frame.getComponent(0), 
		 						"Poker Junkies\n"
		 						+ "Created by: \n"
		 						+ "Chance Potter, Urja Soni, Kena Patel, and Jolekha Begum.");
		 		}
		 	}
		aboutbox.addActionListener(new aboutaction());
		menu.add(aboutbox);
		class helpaction implements ActionListener {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(frame.getComponent(0), 
		 						"To play poker, please click one of the following buttons on your screen.\n"
		 						+ "If you would like to bet, enter the amount you want and hit bet.\n"
		 						+ "If you want to fold, click fold and you will be out on this round. You will be able to play next round still.\n"
		 						+ "If you want to call, click call.\n"
		 						+ "If you want to check, click check.");
		 		}
		 	}
		helpbox.addActionListener(new helpaction());
		menu.add(helpbox);
		menubar.add(menu);
		frame.setJMenuBar(menubar);
		*/
	}
	
	
	//bank roll, choice, potsize 
	public void setValues(int player,int computer1, int computer2,int computer3,int computer4, int potSize,String pc,String cc1,String cc2,String cc3,String cc4)
	{
		
	this.player.setText(Integer.toString(player));
	this.computer1.setText(Integer.toString(computer1));
	this.computer2.setText(Integer.toString(computer2));
	this.computer3.setText(Integer.toString(computer3));
	this.computer4.setText(Integer.toString(computer4));
	
	this.potSize.setText(Integer.toString(potSize));
	
	playerChoice.setText(pc);
	computerChoice1.setText(cc1);
	computerChoice2.setText(cc2);
	computerChoice3.setText(cc3);
	computerChoice4.setText(cc4);
	}
	
	public  void reset()
	{
		
		playerChoice.setText(" ");
		computerChoice1.setText(" ");
		computerChoice2.setText(" ");
		computerChoice3.setText(" ");
		computerChoice4.setText(" ");
	}
}
