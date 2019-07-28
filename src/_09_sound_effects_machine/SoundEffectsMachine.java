package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.applet.AudioClip;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton buttonOne;
	JButton buttonTwo;
	public void showButton() {
		frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		frame.add(panel);
		buttonOne=new JButton();
		buttonTwo=new JButton();
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonOne.setText("lightsaber");
		buttonTwo.setText("sawing wood");
		panel.add(buttonOne);
		panel.add(buttonTwo);
		frame.pack();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button=(JButton) e.getSource();
		if(button==buttonOne) {
			playSound("78667__joe93barlow__hit0.wav");
		}
		else if(button==buttonTwo) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		
	}
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}
	

}
