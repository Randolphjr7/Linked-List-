
package com.mycompany.customdictionary;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author rando
 */
public class Dictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ImageIcon picture = new ImageIcon("dictionary.png");
        WordList  words   = new WordList();
        boolean   done    = false;

        JOptionPane.showMessageDialog(null,"This is a Program that accepts "
                + "words and their meanings, and displays the list of words in "
                + "lexicographical order, like a dictionary", "Java Dictionary",
                JOptionPane.INFORMATION_MESSAGE, picture);

        while (!done)
        {
            String menu = "This is a Program that accepts words and their "
                    + "meanings, and displays the list of words in "
                    + "lexicographical order, like a dictionary"
                    + "\n1. Enter (1) to type word & meaning\n2. Enter (2) to "
                    + "Display your Custom Dictionary\n3. Enter (3) to Quit";
            String s = (String)JOptionPane.showInputDialog(null,menu, "Enter a"
                    + " number");
            
            int option = Integer.parseInt(s);
            switch(option)
            {
                case 1:
                    String word = JOptionPane.showInputDialog("Type the word");
                    String definition = JOptionPane.showInputDialog("type the "
                                     + "definition");
                    words.add(new WordMeaning(word, definition));
                    break;
                case 2:
                    display(words.toString(), "Your Custom Dictionary List",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    done = true;
                    JOptionPane.showMessageDialog(null, "Goodbye!", "Java "
                            + "Dictionary"
                            + " Program", JOptionPane.INFORMATION_MESSAGE, 
                            picture);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "This option is"
                                + " undefined" ,"Error", 
                                JOptionPane.ERROR_MESSAGE);                      
            }
                        
        }
    }
    
    static void display(String s, int MESSAGE_TYPE, ImageIcon picture) { 
        JOptionPane.showMessageDialog(null, s, "Java Dictionary Simulation",
                MESSAGE_TYPE, picture);  
    }
    
    static void display(String s, String heading, int MESSAGE_TYPE) {
        JTextArea text = new JTextArea(s, 40, 70);
        JScrollPane pane = new JScrollPane(text);
        JOptionPane.showMessageDialog(null, pane, heading, MESSAGE_TYPE);
    }    
}
