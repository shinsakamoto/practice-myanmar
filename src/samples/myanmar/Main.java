package samples.myanmar;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JWindow;

public class Main {
	public static void main(String[] args) {

		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		Font fonts[] = ge.getAllFonts();
		Font font = null;
		for (Font f : fonts) {
			// Myanmar3
			// MyanmarMN
			// MyanmarMN-Bold
			// MyanmarSangamMN
			// MyanmarSangamMN-Bold
			// Zawgyi-One
			System.out.println(f.getName());
			if(f.getName().equals("Zawgyi-One")){
				font= f;
			}
		}
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
		f.setSize(500,300);
		JTextArea area = new JTextArea();
		f.getContentPane().add(area);
		StringBuffer sb = new StringBuffer();
		char text = 0x1000;
		for(int i =1;i<150;i++ ){
			sb.append(text);
			
			sb.append("("+Integer.toHexString(text)+")");
			if(i%10==0){
				sb.append("\n");
			}else{
				sb.append(" ");
			}
			text+=1;
		}
//		char ctext = '\u1000';
//		String stext = "\u1000";
//		System.out.println(text);
//		System.out.println(ctext);
//		System.out.println(font);
		//area.setFont(font);
		
		area.setText(sb.toString());

	}
}
