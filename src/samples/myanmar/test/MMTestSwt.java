package samples.myanmar.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class MMTestSwt {
	public static void main(String[] args) {
		//
		// GraphicsEnvironment ge = GraphicsEnvironment
		// .getLocalGraphicsEnvironment();
		// Font font = new Font("Myanmar3", Font.PLAIN, 20);
		// Font fonts[] = ge.getAllFonts();
		// for (Font f : fonts) {
		// // Myanmar3
		// // MyanmarMN
		// // MyanmarMN-Bold
		// // MyanmarSangamMN
		// // MyanmarSangamMN-Bold
		// // Zawgyi-One
		// System.out.println(f.getName());
		// }
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("SWT");
		shell.setLayout(new GridLayout(2, false));

		// フォントの作成と指定
		FontData fontData1 = new FontData("Myanmar3", 20, SWT.NORMAL);
		FontData fontData2 = new FontData("Myanmar Sangam MN", 20, SWT.NORMAL);
		FontData fontData3 = new FontData("Noto Sans Myanmar", 20, SWT.NORMAL);
		FontData fontData4 = new FontData("Zawgyi-One", 20, SWT.NORMAL);
		Font font1 = new Font(display, fontData1);
		Font font2 = new Font(display, fontData2);
		Font font3 = new Font(display, fontData3);
		Font font4 = new Font(display, fontData4);

		{
			Label label = new Label(shell, SWT.NONE);
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint = 30;
			gd.horizontalSpan = 2;
			label.setLayoutData(gd);
			label.setFont(font1);
			label.setText("Myanmar3: " + "\u1000\u102c \u1000\u102b");
		}
		{
			Label label = new Label(shell, SWT.NONE);
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint = 30;
			gd.horizontalSpan = 2;
			label.setLayoutData(gd);
			label.setFont(font2);
			label.setText("Myanmar Sangam MN: " + "\u1000\u102c \u1000\u102b");
		}
		{
			Label label = new Label(shell, SWT.NONE);
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint = 30;
			gd.horizontalSpan = 2;
			label.setLayoutData(gd);
			label.setFont(font3);
			label.setText("Noto Sans Myanmar: " + "\u1000\u102c \u1000\u102b");
		}
		{
			Label label = new Label(shell, SWT.NONE);
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint = 30;
			gd.horizontalSpan = 2;
			label.setLayoutData(gd);
			label.setFont(font4);
			label.setText("Zawgyi-One: " + "\u1000\u102c \u1000\u102b");
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		// フォントリソースの開放
		font1.dispose();
		font2.dispose();
		font3.dispose();
		display.dispose();

		// f.setFont(font);
		//
		// f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// f.setVisible(true);
		// f.setSize(500,300);
		// JTextArea area = new JTextArea();
		// area.setFont(font);
		//
		// f.getContentPane().add(area);
		// StringBuffer sb = new StringBuffer();
		// char text1 = 0x1000;// ka
		// char text2 = 0x102b;//
		// char text3 = 0x102c;//
		// String text = "\u1000\u102c";
		// char[] t1 = new char[] { text1, text2 };
		// char[] t2 = new char[] { text2, text1 };
		// char[] t3 = new char[] { text1, text3 };
		// char[] t4 = new char[] { text3, text1 };
		// String ts1 = new String(t1);
		// String ts2 = new String(t2);
		// String ts3 = new String(t3);
		// String ts4 = new String(t4);
		//
		//
		// area.setText(text);
		// area.setText(" Myanmar3 : " + ts1 + " " + ts2 + " " + ts3 + " " +
		// ts4);

	}
}
