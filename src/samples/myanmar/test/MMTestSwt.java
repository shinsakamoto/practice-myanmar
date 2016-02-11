package samples.myanmar.test;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * How to use MM font<br>
 * Using SWT<br>
 * <img alt="image" src="./doc-files/MMTestSwt.png">
 * @author sakamoto
 *
 */
public class MMTestSwt {
	static private String[] fontNames = { "Myanmar3", "Myanmar Sangam MN", "Noto Sans Myanmar", "Zawgyi-One" };
	static private String text = "\u1000\u102c \u1000\u102b \u102c\u1000 \u102b\u1000";

	public static void main(String[] args) {
		List<Font> fonts = new ArrayList<>();
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("SWT");
		shell.setLayout(new GridLayout(2, false));
		
		for (String name : fontNames) {
			FontData fontData = new FontData(name, 20, SWT.NORMAL);
			Font font = new Font(display, fontData);
			fonts.add(font);
			Label label = new Label(shell, SWT.NONE);
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint = 30;
			gd.horizontalSpan = 2;
			label.setLayoutData(gd);
			label.setFont(font);
			label.setText(name + " : " + text);
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		for (Font f : fonts) {
			f.dispose();
		}
		display.dispose();
	}
}
