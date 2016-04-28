import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class CutenessTV implements ActionListener{
	
	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JButton myButton1 = new JButton("Duck");
	JButton myButton2 = new JButton("Jump");
	JButton myButton3 = new JButton("Dance");
	
	
	
	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();
		
		cute.createUI();
		
	}
	
	void createUI(){
		
		myButton1.addActionListener(this);
		myButton2.addActionListener(this);
		myButton3.addActionListener(this);
		
		myPanel.add(myButton1);
		myPanel.add(myButton2);
		myPanel.add(myButton3);
		
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
	void showDucks() {
		playVideo("x20rWHi5kxY");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v="+ videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton1){
			showDucks();
		}
		else if(e.getSource() == myButton2){
			showFrog();
		}
		else if(e.getSource() == myButton3) {
			showFluffyUnicorns();
		}
	}

}
