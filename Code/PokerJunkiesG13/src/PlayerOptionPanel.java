import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;


public class PlayerOptionPanel extends JPanel {
    private JButton checkButton = new JButton("Check");
    private JButton betButton = new JButton("Bet");
    private JButton callButton = new JButton("Call");
    private JButton foldButton = new JButton("Fold");
    private JTextField betField = new JTextField(5);
    private JPanel buttons = new JPanel();
    private JPanel betting = new JPanel();

    /**
     * This constructor adds the actionlistener to all
     * buttons. And then adds the button to the GUI
     */

    public PlayerOptionPanel(ActionListener buttonListener){
        foldButton.setBounds(62, 0, 62, 87);
        foldButton.addActionListener(buttonListener);
        callButton.setBounds(0, 87, 124, 87);
        callButton.addActionListener(buttonListener);
        betButton.addActionListener(buttonListener);
        buttons.setLayout(null);
        buttons.setSize(485, 463);
        checkButton.setBounds(-12, 0, 74, 87);
        checkButton.addActionListener(buttonListener);
        buttons.add(checkButton);
        buttons.add(foldButton);
        buttons.add(callButton);
        buttons.setPreferredSize(new Dimension(125, 175));

        betField.setText("0");
        betting.setLayout(new GridLayout(0,2));
        betting.add(betField);
        betting.add(betButton);

        add(buttons, BorderLayout.NORTH);
        add(new JSeparator(), BorderLayout.CENTER);
        add(betting, BorderLayout.SOUTH);     
    }

    /**
     * This method get str value from betField
     * and attempts to convert it to an int, or throws error
     *
     * @return          The int value of betField
     */

    public int betFieldNumber(){
        try {
            return Integer.valueOf(betField.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "You need to enter a integer!");
            System.exit(1);
            return 0;
        }
    }
}
