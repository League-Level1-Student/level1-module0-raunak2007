package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		int score=0;
		String thanos="http://pixelartmaker.com/art/003e25de4e4fa37.png";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image=createImage(thanos);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer=JOptionPane.showInputDialog("Which Avengers End-Game character does this picture symbolize?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer.equalsIgnoreCase("thanos")) {
			System.out.println("CORRECT");
			score += 1;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component flag=createImage("https://www.cia.gov/library/publications/the-world-factbook/graphics/flags/large/cs-lgflag.gif");
		// 11. add the second image to the quiz window
		quizWindow.add(flag);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answerTwo=JOptionPane.showInputDialog("Which country in North America has this flag?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answerTwo.equalsIgnoreCase("Costa Rica")) {
			System.out.println("CORRECT");
			score += 2;
		}
		else {
			System.out.println("INCORRECT");
		}
		JOptionPane.showMessageDialog(null, "Your score is "+score+"/3");

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
