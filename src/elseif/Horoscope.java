package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("what is your star sign");
if (answer.equalsIgnoreCase("aries")) {
	JOptionPane.showMessageDialog(null, "Its time to look to the future and explore opportunities, just be sure of what you want first.");

} 

else if (answer.equalsIgnoreCase("taurus")) {
	JOptionPane.showMessageDialog(null, "Find the facts today amid misunderstandings, and dont let your emotions alone guide you.");
	
} 
else if(answer.equalsIgnoreCase("gemini")) {
JOptionPane.showMessageDialog(null, "Today you can use your natural energy to get close to an influential person and enhance your reputation.");
	
}

else if (answer.equalsIgnoreCase("cancer")) {
	JOptionPane.showMessageDialog(null, "With Mercury in trine with Jupiter today something in your life will wind down to its end.");
}

else if (answer.equalsIgnoreCase("leo")) {
	JOptionPane.showMessageDialog(null, "When you want to work on a more meaningful project today, dont apologise for it, find your own path.");
}

else if (answer.equalsIgnoreCase("virgo")) {
	JOptionPane.showMessageDialog(null, "When you dwell on the past today, ask yourself why, this could be something you havent dealt with.");
}
 
else if (answer.equalsIgnoreCase("libra")) {
	JOptionPane.showMessageDialog(null, "People have set ideas about you so its time to show them your unpredictable side, and explore new activities.");
}

else if (answer.equalsIgnoreCase("scorpio")) {
	JOptionPane.showMessageDialog(null, "With Jupiter in trine with Mercury today youll feel the need to please others, examine why this is.");
}

else if (answer.equalsIgnoreCase("sagittarius")) {
	JOptionPane.showMessageDialog(null, "Your laid back energy today means youll let the day take you where it will, have fun with it.");
}

else if (answer.equalsIgnoreCase("capricorn")) {
	JOptionPane.showMessageDialog(null, "Its a quiet day today, Capricorn, and you can use it to get organised and start something, or just to relax");
}

else if (answer.equalsIgnoreCase("aquarius")) {
	JOptionPane.showMessageDialog(null, "A slow morning gives way to some financial news later, which you can use to organise your money.");
}

else if (answer.equalsIgnoreCase("pisces")) {
	JOptionPane.showMessageDialog(null, "You can welcome someone closer in to your life today with your natural warmth and kindness.");
}
else {
JOptionPane.showMessageDialog(null, "that's not a star sign!");
	
}
}
}


