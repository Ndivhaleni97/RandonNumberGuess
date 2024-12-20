package randomguess;

/**
 *
 * @author Oscar
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class RandomGuess {

    public static void main(String[] args) {

        // displaying the first Dialogbox prompting the user to think of number between 1 and 10
        
        JOptionPane.showMessageDialog(null, "Think of the number between 1 to 10" );
        
        // generate a random number between 1 and 10

        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        
        // display the second dialogbox showing the random number
        JOptionPane.showMessageDialog(null, "The number is:" + randomNumber);
        
    }
    
}
