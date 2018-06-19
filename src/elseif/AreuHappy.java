package elseif;

import javax.swing.JOptionPane;

public class AreuHappy {
public static void main(String[] args) {
       
	
	String answer =JOptionPane.showInputDialog(null, "Are you happy");
if (answer.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
} 

else if (answer.equalsIgnoreCase("no")) {
	String answer2 =JOptionPane.showInputDialog("do you want to be happy?");
	 if(answer2.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "change something");	}
	if (answer2.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
	}
	 
}




}
}
