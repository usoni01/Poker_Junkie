import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Player extends JPanel {
    private int currentBet;
   
    public String name;
    public Hand hand;
    private int bankroll;
    public Dealer dealer;
    private JLabel betLabel;
    private JLabel bankrollLabel;
    private JLabel nameLabel;
    private Boolean isPlayer;
    String choice; 
    public boolean isOutOfGame = false;


    public Player(String name, Dealer dealer) throws IOException {
        this.name = name;
        this.bankroll = 1500;
     
        this.dealer = dealer;
        this.currentBet = 0;
        this.isPlayer = (this.name.equals("Player"));

        setLayout(new GridLayout(3,0));

       
    }



    /**
     * This method uses the computers's hand strength to determine semi-randomly the next move.
     */

    public void computerTurn(){
        double rand = Math.random();
        double strengthOfHand = (rand*(handScore() + 1))/2;

        if (bankrupt()){
            check();
        }
        else if(canCheck())
        {
            if (strengthOfHand <.50)
            {
                check();
            }
            else if(strengthOfHand >= .50)
            {
                bet();
            }
        }
        else
        {
            if (strengthOfHand <.20)
            {
                fold();
            }
            else if(strengthOfHand >= .20 && strengthOfHand < 2.0)
            {
                call();
            }
            else
            {
                bet((int) (rand * this.dealer.highestBet));
            }
        }
    }

    /**
     * This method determines whether any player has bet in the current round
     *
     * @return          boolean any player has bet in the current round
     */

    public boolean canCheck(){
        return this.currentBet == this.dealer.highestBet;
    }

    /**
     * This method emulates a player checking
     */

    public void check(){
    	System.out.println(name + " checks ");
    	choice=" checks ";
    }

    /**
     * This method emulates a player betting. Reduces the bankroll and adds to the pot.
     */

    public void bet(int amount){
        if (amount > bankroll)
        {
            amount = bankroll;
        }

        this.currentBet += amount;
        this.bankroll -= amount;
        this.dealer.setHighestBet(this.currentBet);
        this.dealer.addPot(amount);

        System.out.println(name + " bets " + amount);
        choice=" bets " + amount;
        refreshBankrollText();
    }

    /**
     * This method simulates a computer checking
     */

    public void bet(){
        int amount = (int)(Math.random() * bankroll);
        this.bet(amount);
    }

    /**
     * This method emulates a player calling, matching a the current highest bet.
     * similar to a bet, reduces bankroll and adds to pot.
     */

    public void call(){
        int amount = this.dealer.highestBet - this.currentBet;

        if (amount > bankroll){
            amount = bankroll;
        }

        this.currentBet += amount;
        this.bankroll -= amount;
        this.dealer.addPot(amount);
        refreshBankrollText();

        System.out.println(name + " calls " + amount);
        choice=" calls ";
    }

    /**
     * This method emulates a player folding, knocking them out of the round.
     */

    public void fold(){
        this.isOutOfGame = true;

        System.out.println(name + " folds");
        choice=" folds";
    }

    /**
     * This method creates the background image.
     */


    /**
     * This method refreshes the bankroll and bet labels to the current values.
     */

    public void refreshBankrollText(){
    	System.out.println("Bankroll: " + bankroll);
    	System.out.println("Bet: " + currentBet);
    }

    /**
     * This method checks if a player has no value in their bankroll
     *
     * @return   boolean is bankrupt
     */

    public boolean bankrupt(){
        return (bankroll == 0);
    }

    /**
     * This method sets the hand of a player and adds the cards to the table.
     *
     * @param   hand Player's hand
     */

    public void setHand(Hand hand){
        this.hand = hand;
        this.hand.addStartingCardsToTable(this.isPlayer);
    }

    /**
     * This method adds a card to the player's hand.
     *
     * @param   card    A card from the deck
     */

    public void addCard(Card card){
        this.hand.addCard(card);
    }

    /**
     * This method returns an enum of the rank of the current hand
     *
     * @return   Enum of the rank of the current hand
     */

    public Enum evaluatedHand()
    {
        return new HandEvaluator(this.hand).calculateHand();
    }

    /**
     * This method returns an int of the strength of the current hand
     *
     * @return   Int of the strength of the current hand
     */

    public int handScore()
    {
        return new HandEvaluator(this.hand).rankOfHand();
    }

    /**
     * This method reveals the hand and adds it to the hand JPanel
     */
//***********************************************************************************//
    public String revealHand(){
        this.hand.revealHand();
    return this.hand.revealHand();
    }

    /**
     * This method adds an integer amount to the player's bankroll and returns the banroll
     *
     * @param   winnings An int amount to add to bankroll
     * @return   Int of new bankroll
     */

    public int addWinnings(int winnings){
        this.bankroll += winnings;
        refreshBankrollText();
        return this.bankroll;
    }

    /**
     * This method that resets the current bet
     */

    public void resetCurrentBet(){
        this.currentBet = 0;
    }
    
    public int bankRoll()
    {
    	return bankroll;
    }
    
    public String choice()
    {
    	return choice;
    	
    }
}
