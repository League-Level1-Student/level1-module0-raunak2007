package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton ducks;
	JButton frogs;
	JButton fluffyUnicorns;
	
	public void CutenessInterface() {
		frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		frame.add(panel);
		ducks=new JButton();
		frogs=new JButton();
		fluffyUnicorns=new JButton();
		ducks.setText("ducks");
		frogs.setText("frogs");
		fluffyUnicorns.setText("fluffyUnicorns");
		ducks.addActionListener(this);
		frogs.addActionListener(this);
		fluffyUnicorns.addActionListener(this);
		panel.add(frogs);
		panel.add(ducks);
		panel.add(fluffyUnicorns);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button=(JButton) e.getSource();
		if(button==ducks) {
			showDucks();
		}
		if(button==frogs) {
			showFrog();
		}
		if(button==fluffyUnicorns) {
			showFluffyUnicorns();
		}
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


}
