import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BinaryConverter implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	JTextField answer = new JTextField(20);
	JTextField input = new JTextField(20);

//	String convert(String binary) {
//		int asciiValue = Integer.parseInt(binary, 2);
//		char theLetter = (char) asciiValue;
//		return "" + theLetter;
//	}
//	
//	String convert2(String binary) {
//		int asciiValue = Integer.parseInt(binary, 2);
//		String ch = Integer.toBinaryString(asciiValue);
//		return ch;
//	}
	String stringToBinary(String str, boolean pad ) {
	    byte[] bytes = str.getBytes();
	    StringBuilder binary = new StringBuilder();
	    for (byte b : bytes)
	    {
	       binary.append(Integer.toBinaryString((int) b));
	       if(pad) { binary.append(' '); }
	    }
	    return binary.toString();        
	}

	void createUI() {
		panel.add(input);
		panel.add(button);
		panel.add(answer);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		button.addActionListener(this);

	}

	public static void main(String[] args) {
		BinaryConverter bi = new BinaryConverter();
		bi.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String hi = stringToBinary(input.getText(), true);
			answer.setText(hi);
		}

	}
}
