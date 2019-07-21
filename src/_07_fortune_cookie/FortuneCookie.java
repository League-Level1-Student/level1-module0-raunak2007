package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		//System.out.println("Button clicked");
		JFrame frame=new JFrame();
		frame.setVisible(true);
		JButton button=new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rnd=new Random().nextInt(5);
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "Woohoo");
		if(rnd==0) {
			JOptionPane.showMessageDialog(null, "You will have a plentiful life in the future");
		}
		if(rnd==1) {
			JOptionPane.showMessageDialog(null, "You will have a joyful life in the future");
		}
		if(rnd==2) {
			JOptionPane.showMessageDialog(null, "You will be a billionaire in the future");
		}
		if(rnd==3) {
			JOptionPane.showMessageDialog(null, "You will go to space in the future");
		}
		if(rnd==4) {
			JOptionPane.showMessageDialog(null, "You will get a Nobel Prize in the future");
		}
		
	}

}
