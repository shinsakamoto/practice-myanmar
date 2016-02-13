package samples.myanmar.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import samples.myanmar.MMKey;
import swing2swt.layout.BorderLayout;
import swing2swt.layout.FlowLayout;

/**
 * MM keyboard prototype<br>
 * Using SWT<br>
 * <img alt="image" src="./doc-files/MMTyping.png">
 * 
 * @author sakamoto
 *
 */
public class MMTyping {

	protected Shell shlMyanmarTyping;
	private Text text;
	private SelectionListener listener = new SelectionListener() {

		@Override
		public void widgetSelected(SelectionEvent e) {
			MMKey key = (MMKey) e.widget.getData();
			text.append(key.toUnicode());

		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub

		}
	};

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MMTyping window = new MMTyping();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMyanmarTyping.open();
		shlMyanmarTyping.layout();
		while (!shlMyanmarTyping.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMyanmarTyping = new Shell();
		shlMyanmarTyping.setSize(785, 500);
		shlMyanmarTyping.setText("Myanmar Typing");
		shlMyanmarTyping.setLayout(new BorderLayout(0, 0));

		text = new Text(shlMyanmarTyping, SWT.BORDER);
		text.setLayoutData(BorderLayout.NORTH);

		Composite unicodeKeyPanel = new Composite(shlMyanmarTyping, SWT.NONE);
		unicodeKeyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		unicodeKeyPanel.setLayoutData(BorderLayout.CENTER);

		for (MMKey key : MMKey.ALL_MM_KEYS) {
			Button btnNewButton = new Button(unicodeKeyPanel, SWT.NONE);
			btnNewButton.setText(key.toUnicode());
			btnNewButton.setData(key);
			btnNewButton.addSelectionListener(listener);
		}

	}
}
