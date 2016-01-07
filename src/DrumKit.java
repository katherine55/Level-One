import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {
JLabel drum;
JLabel symbol;
	JLabel drumLabelWithImage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		JFrame myFrame = new JFrame();
		myFrame.setVisible(true);
		// 2. Make the frame visible
		myFrame.setSize(000, 30000);
		// 3. Set the size of the frame
		myFrame.setTitle("Drum Kit");
		// 4. Set the title of the frame
		JPanel myDrum = new JPanel();
		// 5. Make a JPanel and initialize it.
		myFrame.add(myDrum);

		// 6. Add the panel to the frame. (The panel is invisible.)
		String drumName = "750-9675XLSMH_detail2.jpg";
		String symbolName = "SAB41606.jpg";
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".
		// 8. Put the name of your image in a String variable.
		drum = createLabelImage(drumName);
		symbol = createLabelImage(symbolName);
		// 9. Use the "createLabelImage()" method to initialize the
		// drumLabelWithImage variable.
		myDrum.add(drum);
		myDrum.add(symbol);
		// 10. Add the image to the panel
		GridLayout myLayout = new GridLayout();
		// 11. Set the layout of the panel to "new GridLayout()"
		myDrum.setLayout(myLayout);
		// 12. call the pack() method on the frame
		myFrame.pack();
		// 13. add a mouse listener to drumLabelWithImage.
		drum.addMouseListener(this);
		symbol.addMouseListener(this);

	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouse clicked");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package".
		// There are some sounds here: http://bit.ly/drum-sounds or you can also
		// get them from freesound.org
		// 16. If they clicked on the drumImage...
		//if(){
		if(drumClicked.equals(drum)){
		playSound("139501__robertmcdonald__big-hit-1.wav");
		// 17. ...use the playSound method to play a drum sound.
		}
		
		if(drumClicked.equals(symbol)){
			playSound("85767__schatzl03__symbol-long-ring.aif");
		}
		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
