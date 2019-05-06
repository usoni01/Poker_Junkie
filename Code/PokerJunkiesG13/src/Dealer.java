import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Dealer extends JPanel {
    private BufferedImage image;
    public int potSize;
    public int highestBet;
    private JLabel potLabel;
    private JLabel communityCards;
  
    GUI front;
 int a=0;
setCards setcard;

    public Dealer(GUI front) {
		// TODO Auto-generated constructor stub
    	
    	 this.potSize = 0;
         this.highestBet = 0;
         
         this.front=front;
         setLayout(new GridLayout(3,0));
         setcard = new setCards();
         addLabelsToTable();
	}



	public void addLabelsToTable(){
        add(new JLabel());

        // add pot to panel
        this.potLabel = new JLabel("Pot \n" + this.potSize);
        this.potLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        this.potLabel.setForeground(Color.ORANGE);
        this.potLabel.setHorizontalAlignment(JLabel.CENTER);
        add(this.potLabel);

        // add community cards to panel
        this.communityCards = new JLabel();
        this.communityCards.setFont(new Font ("Helvetica", Font.BOLD, 13));
        this.communityCards.setForeground(Color.ORANGE);
        this.communityCards.setHorizontalAlignment(JLabel.CENTER);
        add(this.communityCards);
    }

    /**
     * This method adds an int to the pot.
     *
     * @param   change    int value to add or subtract from the pot.
     */

    public void addPot(int change){
        this.potSize += change;
        System.out.println("Pot \n" + potSize);
    }

    /**
     * This method sets the current highest bet on the table.
     *
     * @param   bet    int bet
     */

    public void setHighestBet(int bet){
        this.highestBet = bet;
    }

    /**
     * This method resets the highest bet.
     */

    public void resetHighestBet(){
        this.highestBet = 0;
    }

    /**
     * This method resets the pot label text.
     */

    public void refreshPotText(){
        this.potLabel.setText("Pot \n" + potSize);
    }

    /**
     * This method adds a card to the community cards view.
     * Is not stored.
     *
     *  @param   card    Card
     */

    public void addCommunityCard(Card card){
    	
    	if(a==0)
    	{
    		setcard.set(front.coc1, card);
    		
    		
    	}
    	
    	if(a==1)
    	{
    		setcard.set(front.coc2, card);
    		
    	}
    	
    	if(a==2)
    	{
    		setcard.set(front.coc3, card);
    		
    	}
    	
    	if(a==3)
    	{setcard.set(front.coc4, card);
    		
    		
    	}
    	
    	if(a==4)
    	{
    		setcard.set(front.coc5, card);
    		
    	}
    	
        String text = this.communityCards.getText();
        this.communityCards.setText(text + " " + card);
        System.out.println("communityCards= " +text);
      
        
        a=a+1;
    }

    /**
     * This method resets community cards label
     */

    public void resetCommunityCards(){
        this.communityCards.setText("");
        //start.cummunityCard.setText("");
    }

    /**
     * This method resets the pot value
     */

    public void resetPot(){
        this.potSize = 0;
    }

    /**
     * This method adds a background to the JPanel
     */

    public void paintComponent(Graphics g) {
        // create background
        g.drawImage(image, 0, 0, null);
    }
    
    public int potSize()
    {
    	return potSize;
    }
}
