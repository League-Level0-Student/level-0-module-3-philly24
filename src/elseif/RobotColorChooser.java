//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
	for (int i = 0; i < 100; i++) {
		
	
		Robot rob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String answer=JOptionPane.showInputDialog("what color would you like? Red or blue");
		//5. Use an if/else statement to set the pen color that the user requested
if (answer.equalsIgnoreCase("red")) {
	rob.setPenColor(255,0,0);
	
} 

else if(answer.equalsIgnoreCase("blue")) {
rob.setPenColor(0,0,255);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	
	Random randomGenerator = new Random();
	int R = randomGenerator.nextInt(255);
	int G = randomGenerator.nextInt(255);
	int B = randomGenerator.nextInt(255);

	Color randomColour = new Color(R,G,B);
	rob.setPenColor(R,G,B);

	
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
rob.setSpeed(100);			
rob.penDown();
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);

	}
}
}
