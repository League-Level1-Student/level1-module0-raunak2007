package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot rob=new Robot();
		rob.setSpeed(100);
		rob.setX(20);
		rob.setY(300);
		for (int i = 0; i < 10; i++) {
			drawPointyHouse("small",255,200,200,rob);
			drawPointyHouse("medium",0,200,100,rob);
			drawFlatHouse("large",255,100,50,rob);
		}
	}
	static void drawPointyHouse(String size,int r, int g, int b, Robot rob) {
		int height=0;
		if(size.equals("small")){
			height=60;
		}
		if(size.equals("medium")){
			height=120;
		}
		rob.setPenColor(r,g,b);
		rob.penDown();
		rob.move(height);
		rob.turn(60);
		rob.move(20);
		rob.turn(60);
		rob.move(20);
		rob.turn(60);
		rob.move(height);
		rob.setPenColor(0, 100, 0);
		rob.turn(270);
		rob.move(50);
		rob.turn(-90);
	}
	static void drawFlatHouse(String size,int r, int g, int b, Robot rob) {
		int height=0;
		if(size.equals("large")){
			height=250;
		}
		rob.setPenColor(r,g,b);
		rob.penDown();
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
		rob.setPenColor(0, 100, 0);
		rob.turn(270);
		rob.move(50);
		rob.turn(-90);
	}
}
