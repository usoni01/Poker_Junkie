
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game extends JFrame   {
    private Player player;
    private Player computer1;
    private Player computer2;
    private Player computer3;
    private Player computer4;
    private Player[] players;
    private Dealer dealer;
    private JPanel table;
    private Deck deck;
    private Hand playerHand;
    private Hand computer1Hand;
    private Hand computer2Hand;
    private Hand computer3Hand;
    private Hand computer4Hand;
    private PlayerOptionPanel playerOptions;
    private Turn turn;
    int score;
    ReadWrite rw;
    
    private int gamesPlayed = 37;
   
     GUI front; 
     JLabel l;
     setCards setcard;
     String cards;
     String a,b;
     Card c;
     Card c1;
     String out[];
   
    private boolean gameOver;
     JLabel card1;
     JLabel card2;

    public enum Turn {
        PREFLOP, FLOP, TURN, RIVER, SUMMARY
    }

    public static void main(String[] args) throws IOException {
    	login l= new login();
    	l.frame.setVisible(true);
       
    }

    /**
     * This constructor creates a game class. Controls all aspects of the game.
     * Including creating the players JPanels and starting the turn system.
     */

    public Game() throws IOException{
    	//start= new StartPoker();
    	front = new GUI();
    	rw = new ReadWrite();
    	
    	File file = new File("click.wav");
        try {
            music(file);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
    	score=  Integer.parseInt(rw.read());
    	
    	front.score.setText(rw.read());
    	setcard= new setCards();
    	
    	
    	
    	
   l= new JLabel();
    	front.frame.setVisible(true);
    	//start.frame.setVisible(true);
       setTitle("Texas Hold'em");
        setSize(480, 480);

        this.table = new JPanel(new GridLayout(3, 3));
        table.setBounds(0, 0, 467, 703);
        createPlayers();
        startNewRound();
      getContentPane().setLayout(null);

      getContentPane().add(this.table);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public static void music(File file) throws LineUnavailableException, UnsupportedAudioFileException
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        }
        catch(IOException err)
        {
            
        }
    }
    

    public void reset()
    {
    	front.reset();
    }

    /**
     * This method creates dealer, player and computer and adds them to table.
     */

    public void createPlayers() throws IOException {
        // create JPanels and add them to table
        dealer = new Dealer(front);
        
        player = new Player("Player", dealer);
        computer1 = new Player("Computer1", dealer);
        computer2 = new Player("Computer2", dealer);
        computer3 = new Player("Computer3", dealer);
        computer4 = new Player("Computer4", dealer);
        
        players = new Player[]{player,computer1,computer2,computer3,computer4};
        
        playerOptions = new PlayerOptionPanel(new ButtonListener());

        
        
     
    }


    /**
     * This method creates a new log, previous log, and hands. Then adds them to the table.
     * It also takes an ante from the player's bankroll.
     */

    public void startNewRound() {
     

        // reset the deck, turn and dealer community cards
        this.deck = new Deck();
        this.turn = Turn.PREFLOP;
        this.dealer.resetCommunityCards();

        // give players new hands
        playerHand = new Hand(this.deck.pop(), this.deck.pop());
        computer1Hand = new Hand(this.deck.pop(), this.deck.pop());
        computer2Hand = new Hand(this.deck.pop(), this.deck.pop());
        computer3Hand = new Hand(this.deck.pop(), this.deck.pop());
        computer4Hand = new Hand(this.deck.pop(), this.deck.pop());

        player.setHand(playerHand);
        
        
        
        String cards = player.revealHand();
                out= cards.split("/");
                String a,b;
                a=out[0];
                b=out[1];
                
                Card c = new Card(a.substring(0,1),a.substring(1,2)); 
               
                setcard.set(front.uc1, c);
               
                Card c1 = new Card(b.substring(0,1),b.substring(1,2));
                 
                setcard.set(front.uc2, c1);
        
        computer1.setHand(computer1Hand);
        computer2.setHand(computer2Hand);
        computer3.setHand(computer3Hand);
        computer4.setHand(computer4Hand);


        this.table.add(playerHand);
        playerHand.setLayout(null);
        {
        	card1 = new JLabel("New label");
        	card1.setBounds(106, 68, 60, 80);
        	playerHand.add(card1);
        	setcard.set(card1,c);
        }
        {
        	card2 = new JLabel("New label");
        	card2.setBounds(171, 68, 60, 80);
        	playerHand.add(card2);
        	setcard.set(card2,c1);
        }
        this.table.add(playerOptions);
        
        JMenuBar menubar;
    	JMenu menu;
    	JMenuItem aboutbox;
    	JMenuItem helpbox;
    	JMenuItem statbox;
        
        // menubar init
      	menubar = new JMenuBar();
      	menu = new JMenu("File");
      	aboutbox = new JMenuItem("About");
      	helpbox = new JMenuItem("Help");
      	statbox = new JMenuItem("My Stats");
      	class aboutaction implements ActionListener {
      		public void actionPerformed (ActionEvent e) {
      			JOptionPane.showMessageDialog(table.getComponent(0), 
      					"Poker Junkies\n"
      					+ "Created by: \n"
      					+ "Chance Potter, Urja Soni, Kena Patel, and Jolekha Begum.");
      		}
      	}
      	aboutbox.addActionListener(new aboutaction());
      	menu.add(aboutbox);
      	class helpaction implements ActionListener {
      		public void actionPerformed (ActionEvent e) {
      			JOptionPane.showMessageDialog(table.getComponent(0), 
      					"To play poker, please click one of the following buttons on your screen.\n"
      					+ "If you would like to bet, enter the amount you want and hit bet.\n"
      					+ "If you want to fold, click fold and you will be out on this round. You will be able to play next round still.\n"
      					+ "If you want to call, click call.\n"
      					+ "If you want to check, click check.");
      		}
      	}
      	class stataction implements ActionListener {
      		public void actionPerformed (ActionEvent e) {
      			JOptionPane.showMessageDialog(table.getComponent(0),
      					 "Hands Won: " + score + "\n"
      					+"Hands played: " + (gamesPlayed + score) + "\n"
      					+"Royal Flushes: 1\n"
      					+"Money Won: " + (player.bankRoll() - 500), "Stats", JOptionPane.INFORMATION_MESSAGE);
      		}
      	}
      	statbox.addActionListener(new stataction());
      	helpbox.addActionListener(new helpaction());
     	menu.add(helpbox);
     	menu.add(statbox);
      	menubar.add(menu);
      	this.setJMenuBar(menubar);
       
        
       
        System.out.println("Player Hand "+ player.revealHand());
        System.out.println("computer1 Hand "+ computer1.revealHand());
        System.out.println("computer2 Hand "+ computer2.revealHand());
        System.out.println("computer3 Hand "+ computer3.revealHand());
        System.out.println("computer4 Hand "+ computer4.revealHand());
        this.gameOver = false;
        takeAnte();
    }

    /**
     * Helper method that adds a JLabel to the current log JPanel
     *
     * @param text    A JLabel is created that has this text
     */

    static public void addToLog(String text){
        System.out.println(text);
    	

    }

    /**
     * Before each game reset all variables of the player and dealer
     */

    public void resetTurn(){
        Game.addToLog("------------");
        for(Player x: this.players)
        {
            x.resetCurrentBet();
            x.isOutOfGame = false;
            x.refreshBankrollText();
        }
        if (this.gameOver){
            this.dealer.resetPot();
        }
        this.dealer.resetHighestBet();
        this.dealer.refreshPotText();
    }

    /**
     * This method checks if there is a game winner
     */

    public void checkGameEnd() {
        // check if there is a game winner
        if (dealer.potSize == 0){
            int playerCount = this.players.length;
            int playersOut = 0;
            Player winner = this.player;

            for(Player x: this.players)
            {
                if (x.bankrupt())
                {
                    playersOut += 1;
                }
                else {
                    winner = x;
                }
            }

            // if winner exit program
            if (playersOut == playerCount - 1)
            {
                JOptionPane.showMessageDialog(null, winner.name + " has won!");
               // start.reset();
            }
        }
    }

    /**
     * Check to see if a player has won through making other players fold
     */

    public void checkNoShowdownWin(){
        // check to see if win from folding
        int playerCount = this.players.length;
        int playersOut = 0;
        Player winner = this.player;

        for(Player x: this.players)
        {
            if (x.isOutOfGame)
            {
                playersOut += 1;
            }
            else {
                winner = x;
            }
        }

        // if winner, add to his winnings
        if (playersOut == playerCount - 1)
        {
            winner.addWinnings(this.dealer.potSize);
            this.gameOver = true;
            resetTurn();
            
        }
    }

    /**
     * Calculates the evaluated poker hands of all the players, and determines the winner.
     * @throws IOException 
     */

    public void showDown() throws IOException{
        // determine which hand is better
        int playerScore = player.handScore();
        int computer1Score = computer1.handScore();
        int computer2Score = computer2.handScore();
        int computer3Score = computer3.handScore();
        int computer4Score = computer4.handScore();

        // add to log the evaluated hands
        
        String result="Player has a " + player.evaluatedHand() + "\nComputer1 has a " + computer1.evaluatedHand() + "\nComputer2 has a " + 
        computer2.evaluatedHand()+"\nComputer3 has a " + computer3.evaluatedHand()+"\nComputer4 has a " + computer4.evaluatedHand();
       
        front.result.setText(result);
        System.out.println("Player has a " + player.evaluatedHand());
        System.out.println("Computer1 has a " + computer1.evaluatedHand());
        System.out.println("Computer2 has a " + computer2.evaluatedHand());
        System.out.println("Computer3 has a " + computer3.evaluatedHand());
        System.out.println("Computer4 has a " + computer4.evaluatedHand());
        

       
       
   
        //computer 1
        cards = computer1.revealHand();
        out= cards.split("/");
       
        a=out[0];
        b=out[1];
        
         c = new Card(a.substring(0,1),a.substring(1,2)); 
        setcard.set(front.c1c1, c);
       
         c1 = new Card(b.substring(0,1),b.substring(1,2));
        setcard.set(front.c1c2, c1);
        
        
        //computer 2
        cards = computer2.revealHand();
        out= cards.split("/");
       
        a=out[0];
        b=out[1];
        
         c = new Card(a.substring(0,1),a.substring(1,2)); 
        setcard.set(front.c2c1, c);
       
         c1 = new Card(b.substring(0,1),b.substring(1,2));
        setcard.set(front.c2c2, c1);
        
        //computer 3
        cards = computer3.revealHand();
        out= cards.split("/");
       
        a=out[0];
        b=out[1];
        
         c = new Card(a.substring(0,1),a.substring(1,2)); 
        setcard.set(front.c3c1, c);
       
         c1 = new Card(b.substring(0,1),b.substring(1,2));
        setcard.set(front.c3c2, c1);
        
        //computer 4
        cards = computer4.revealHand();
        out= cards.split("/");
       
        a=out[0];
        b=out[1];
        
         c = new Card(a.substring(0,1),a.substring(1,2)); 
        setcard.set(front.c4c1, c);
       
         c1 = new Card(b.substring(0,1),b.substring(1,2));
        setcard.set(front.c4c2, c1);
        
        // determine round winner and reward him
        if (playerScore == computer1Score && computer1Score ==computer2Score && computer2Score==computer3Score && computer3Score==computer4Score)
        {
            player.addWinnings(this.dealer.potSize/5);
            computer1.addWinnings(this.dealer.potSize/5);
            computer2.addWinnings(this.dealer.potSize/5);
            computer3.addWinnings(this.dealer.potSize/5);
            computer4.addWinnings(this.dealer.potSize/5);
            JOptionPane.showMessageDialog(null, "Its a Tie!");
            gamesPlayed++;
         
            
            front.frame.dispose();
            dispose();
            try {
				new Game();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        else if (playerScore >= computer1Score && playerScore >=computer2Score && playerScore >= computer3Score && playerScore >= computer4Score)
        {
        	
            player.addWinnings(this.dealer.potSize);
            System.out.println("Player wins");
            gamesPlayed++;
            
            JOptionPane.showMessageDialog(null, "Player has won this round!");
           
            
        score=score+1;
        
        rw.write(Integer.toString(score));
        
    		front.frame.dispose();
            dispose();
            try {
				new Game();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
            
        }
       
        else if(computer1Score >= playerScore && computer1Score >=computer2Score && computer1Score >= computer3Score && computer1Score >= computer4Score)
        {
            computer1.addWinnings(this.dealer.potSize);
            System.out.println("Computer1 wins");
            gamesPlayed++;
            JOptionPane.showMessageDialog(this, "computer1 has won this round!");
           
            
            front.frame.dispose();
            dispose();
            try {
				new Game();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        else if(computer2Score >= playerScore && computer2Score >=computer1Score && computer2Score >= computer3Score && computer2Score >= computer4Score)
        {
            computer2.addWinnings(this.dealer.potSize);
            gamesPlayed++;
            System.out.println("Computer2 wins");
            JOptionPane.showMessageDialog(this, "computer2 has won this round!");
         
            
            front.frame.dispose();
            dispose();
            try {
				new Game();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        else if(computer3Score >= playerScore && computer3Score >=computer2Score && computer3Score >= computer1Score && computer3Score >= computer4Score)
        {
            computer3.addWinnings(this.dealer.potSize);
            gamesPlayed++;
            System.out.println("Computer3 wins");
            JOptionPane.showMessageDialog(this, "computer3 has won this round!");
        
            
            front.frame.dispose();
            dispose();
            try {
				new Game();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        else if(computer4Score >= playerScore && computer4Score >=computer2Score && computer4Score >= computer3Score && computer4Score >= computer1Score)
        {
            computer4.addWinnings(this.dealer.potSize);
            System.out.println("Computer4 wins");
            gamesPlayed++;
            JOptionPane.showMessageDialog(this, "computer4 has won!");
            front.reset();
          
            
            front.frame.dispose();
            dispose();
            try {
				new Game();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
        }
        front.reset();
        this.gameOver = true;
    }

    /**
     * Method takes 50 chips as an ante from players.
     */

    public void takeAnte(){
    	System.out.println("Adding antes");
    	System.out.println("------------");
        for(Player x: this.players)
        {
            x.bet(50);
        }
    }

    /**
     * Dealer deals a community card and the card is added to each player's hand.
     */

    public void dealCard(){

        Card card1 = deck.pop();
        for(Player x: this.players)
        {
            x.addCard(card1);
            
        }
        dealer.addCommunityCard(card1);
    }

    /**
     * Method determines what happens on which turn.
     * @throws IOException 
     */

    public void progressTurn() throws IOException{
        // if players done, go to next turn
        switch (turn) {
            case PREFLOP:
                turn = Turn.FLOP;
                dealCard();
                dealCard();
                dealCard();
                break;
            case FLOP:
                dealCard();

                turn = Turn.TURN;
                break;
            case TURN:
                dealCard();
                turn = Turn.RIVER;
                break;
            case RIVER:
                computer1.revealHand();
                computer2.revealHand();
                computer3.revealHand();
                computer4.revealHand();
                showDown();

                resetTurn();
                turn = Turn.SUMMARY;
                break;
        }
           front.setValues(player.bankRoll(), computer1.bankRoll(), computer2.bankRoll(), computer3.bankRoll(), computer4.bankRoll(), dealer.potSize(), player.choice(),computer1.choice() , computer2.choice(), computer3.choice(), computer4.choice());
        
    
    }

    /**
     * Method that takes what button is pressed, and runs the corresponding code.
     */

    public void buttonClicked(String buttonStr){
        switch(buttonStr){
            case "Check":
                computer1.computerTurn();
                computer2.computerTurn();
                computer3.computerTurn();
                computer4.computerTurn();
                checkNoShowdownWin();
                break;
            case "Bet":
                player.bet(playerOptions.betFieldNumber());
                computer1.computerTurn();
                computer2.computerTurn();
                computer3.computerTurn();
                computer4.computerTurn();
                checkNoShowdownWin();
                break;
            case "Call":
                player.call();
                checkNoShowdownWin();
                break;
            case "Fold":
                player.fold();
                checkNoShowdownWin();
                break;
            default:
                System.out.println("Not working");
                break;
        }
        
        
        
    }
    

    
   
    
    /**
     * Method passed to the buttons on the PlayerOptionsPanel
     */

    class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            // if last turn, restart the game
            if (turn == Turn.SUMMARY){
                startNewRound();
                return;
            }

            resetTurn();

            // give player and computer turns
            buttonClicked(e.getActionCommand());

            // add a summary round
            if (gameOver)
            {front.reset();
            	JOptionPane.showMessageDialog(null, "Click Okay For new round");
            //	System.out.println("Click any button for new round");
                turn = Turn.SUMMARY;
            }

            // go to next round
            try {
				progressTurn();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

            //check if game is over
            checkGameEnd();
        }
    }
}
