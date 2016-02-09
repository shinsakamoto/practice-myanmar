package samples.myanmar.test;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MMTestSwing {
	public static void main(String[] args) {
		showAllFont();
		showMyanamrFontOnGUI();
	}

	private static void showMyanamrFontOnGUI() {
		// Myanmar3
		// MyanmarMN
		// MyanmarMN-Bold
		// MyanmarSangamMN
		// MyanmarSangamMN-Bold
		// Zawgyi-One
		Font font = new Font("Myanmar3", Font.PLAIN, 20);

		JFrame f = new JFrame();

		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(500, 300);
		JTextArea area = new JTextArea();
		area.setFont(font);

		f.getContentPane().add(area);
		String text = "\u1000\u102b , \u1000\u102c , \u102b\u1000 , u102c\u1000";

		area.setText(text);
		f.setVisible(true);
	}

	private static void showAllFont() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font fonts[] = ge.getAllFonts();
		for (Font f : fonts) {
			// Myanmar3
			// MyanmarMN
			// MyanmarMN-Bold
			// MyanmarSangamMN
			// MyanmarSangamMN-Bold
			// Zawgyi-One
			System.out.println(f.getName());
		}
	}
}
