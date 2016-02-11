package samples.myanmar.test;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * How to use MM font<br>
 * Using Swing<br>
 * <img alt="image" src="./doc-files/MMTestSwing.png">
 * @author sakamoto
 *
 */
public class MMTestSwing {
	// Myanmar3
	// MyanmarSangamMN
	// NotoSansMyanmar
	// Zawgyi-One
	static private String[] fontNames = { "Myanmar3", "Myanmar Sangam MN", "Noto Sans Myanmar", "Zawgyi-One" };
	static private String text = "\u1000\u102c \u1000\u102b \u102c\u1000 \u102b\u1000";

	public static void main(String[] args) {
		JPanel pane = new JPanel();

		for (String name : fontNames) {
			Font font = new Font(name, Font.PLAIN, 20);
			JLabel label = new JLabel();
			label.setFont(font);
			label.setText(name + " : " + text);
			pane.add(label);
		}

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(500, 300);
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		f.setContentPane(pane);
		f.setVisible(true);
		showAllFont();
	}

	private static void showAllFont() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		for (String name : ge.getAvailableFontFamilyNames()) {
			System.out.println(name);
		}
	}
}
