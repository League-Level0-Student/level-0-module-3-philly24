//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101)+1;
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String answer = JOptionPane.showInputDialog("pick a number 1-100"); 
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int go = Integer.parseInt(answer);
			// 5. if the guess is correct
				// 6. Win
			if (go==random) {
				JOptionPane.showMessageDialog(null, "You win!");
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			else if (go>random) {
				JOptionPane.showMessageDialog(null, "too high");
				JOptionPane.showMessageDialog(null, "you Lose");
			}
			
			// 9. if the guess is low
				// 10. Tell them it's too low
	else {
		JOptionPane.showMessageDialog(null, "to low");
	JOptionPane.showMessageDialog(null, "you Lose");
	}
	
	
	}
	
	
	}


// 13. Tell them they lose
		
	
	




