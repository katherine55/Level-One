import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be
 * loaded.
 **/

public class BookOfIllusions extends MouseAdapter {
	String illusion1 = "8b.jpg";
	String illusion2 = "hi copy.jpg";

	JLabel myLabel;
	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want
	 * to get out of the static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	JFrame myFrame = new JFrame();

	private void createBook() {
		myFrame.setVisible(true);
		myFrame.setSize(500, 500);

		myLabel = loadImageFromComputer(illusion1);

		// 7. use the "loadImage..." methods below to initialize your JLabel
		myFrame.add(myLabel);
		// 8. add your JLabel to the frame
		myFrame.pack();
		// 9. call the pack() method on the frame
		myFrame.addMouseListener(this);
		JOptionPane.showMessageDialog(null, "Don't click the magicallllll illlusssionnn!!!");
		// 10. add a mouse listener to your frame (hint: use *this*)
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("clicked!");
		JOptionPane.showMessageDialog(null, "You clicked the magicallllll illlusssionnn!!! It will curse you forever");
		myFrame.remove(myLabel);

		// 11. Print "clicked!" to the console when the mouse is pressed
		// 12. remove everything from the frame that was added earlier
		myLabel = loadImageFromComputer(illusion2);
		myFrame.add(myLabel);
		myFrame.pack();
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
