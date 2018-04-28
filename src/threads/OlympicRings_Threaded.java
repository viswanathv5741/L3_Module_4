package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
		public static void main(String[] args) {
			Robot vai = new Robot(400,400);
			Robot con = new Robot(800,400);
			Robot max = new Robot(1200,400);
			Robot addi = new Robot(600,700);
			Robot steph = new Robot(1000,700);
			
			vai.setSpeed(10);
			con.setSpeed(10);
			max.setSpeed(10);
			addi.setSpeed(10);
			steph.setSpeed(10);
			
			vai.setPenWidth(5);
			con.setPenWidth(5);
			max.setPenWidth(5);
			addi.setPenWidth(5);
			steph.setPenWidth(5);
			
			vai.moveTo(400, 400);
			con.moveTo(800, 400);
			max.moveTo(1200, 400);
			addi.moveTo(600, 700);
			steph.moveTo(1000, 700);
			
			Thread r1 = new Thread(
					new Runnable() {
						public void run() {
							vai.penDown();
							vai.setPenColor(Color.BLUE);
							for (int i=1; i<361; i++) {
								vai.move(4);
								vai.setAngle(i);
							}
						}
					});
			Thread r2 = new Thread(
					new Runnable() {
						public void run() {
							con.penDown();
							con.setPenColor(Color.BLACK);
							for (int i=1; i<361; i++) {
								con.move(4);
								con.setAngle(i);
							}
						}
					});
			Thread r3 = new Thread(
					new Runnable() {
						public void run() {
							max.penDown();
							max.setPenColor(Color.RED);
							for (int i=1; i<361; i++) {
								max.move(4);
								max.setAngle(i);
							}	
						}
					});
			Thread r4 = new Thread(
					new Runnable() {
						public void run() {
							addi.penDown();
							addi.setPenColor(Color.YELLOW);
							for (int i=1; i<361; i++) {
								addi.move(4);
								addi.setAngle(i);
							}
						}
					});
			Thread r5 = new Thread(
					new Runnable() {
						public void run() {
							steph.penDown();
							steph.setPenColor(Color.GREEN);
							for (int i=1; i<361; i++) {
								steph.move(4);
								steph.setAngle(i);
							}
						}
					});
			
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();
		}
}

