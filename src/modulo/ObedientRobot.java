package modulo;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class ObedientRobot {
public static void main(String[] args) {

	String answer=JOptionPane.showInputDialog("what shape would you like?");
if (answer.equalsIgnoreCase("square")) {
	drawSquare();
}
else if (answer.equalsIgnoreCase("triangle")) {
	drawTriangle();
}
else if (answer.equalsIgnoreCase("circle")) {
	drawCircle();
}		
String answer2 = JOptionPane.showInputDialog("what color would you like? Red or Blue");
if (answer2.equalsIgnoreCase("blue")) {
	Robot rob = new Robot();
	
	rob.setWindowColor(0,0,255);
}
else if (answer2.equalsIgnoreCase("red")) {
Robot rob = new Robot();
	rob.setWindowColor(255,0,0);
} 
	
	
	
	
	
}
public static void drawSquare() {
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(100);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	}
public static void drawTriangle() {
	 Robot rob = new Robot();
	 rob.penDown();
	 rob.setSpeed(100);
	rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(135);
rob.move(150);	
}
public static void drawCircle() {
	Robot rob = new Robot();{
		
		rob.penDown();	
		rob.setSpeed(100);
			rob.move(100);
			rob.turn(45);
			rob.move(100);
			rob.turn(45);
			rob.move(100);
			
			rob.turn(45);
			rob.move(100);
			rob.turn(45);
			rob.move(100);
			rob.turn(45);
			rob.move(100);
			rob.turn(45);
			rob.move(100);
			rob.turn(45);
			rob.move(100);
			rob.turn(45);
			
		}
}
}


