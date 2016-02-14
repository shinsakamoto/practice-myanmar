package samples.myanmar.swt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import samples.myanmar.MM;
import samples.myanmar.MMKey;

/**
 * MM keyboard prototype<br>
 * Using SWT with WindowBuilder<br>
 * <br>
 * need swt.jar , swing2swt.jar<br>
 * 
 * <img alt="image" src="./doc-files/MMTypingWithWindowBuilder.png"><br>
 * 
 * WindowBuilderEditor image<br>
 * 
 * <img alt="image" src="./doc-files/MMTypingWithWindowBuilderEditor.png"><br>
 * 
 * 
 * @author sakamoto
 *
 */
public class MMTypingWithWindowBuilder {

	private String defaultText = "\u1000\u102c  \u1000\u102b  \u1014\u1037\u103A   \u1014\u103A\u1037";
	protected Shell shlMyanmarTyping;
	private SelectionListener listener = new SelectionListener() {

		@Override
		public void widgetSelected(SelectionEvent e) {
			MMKey key = (MMKey) e.widget.getData();
			text.append(key.toUnicode());
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	};

	private ModifyListener modifyListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
			String t = text.getText();
			text_1.setText(t);
			text_2.setText(t);
			text_3.setText(t);
			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < t.length(); i++) {
				char ch = t.charAt(i);
				if (ch == ' ') {
					buf.append(ch);
				} else {
					buf.append("\\u");
					buf.append(Integer.toHexString(ch).toUpperCase());
				}
			}
			text_4.setText(buf.toString());
		}
	};

	private ModifyListener modifyTextListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
			String t = text_5.getText();
			try {
				if (t.length() == 4) {
					int i = Integer.parseInt(t, 16);
					String s = Character.toString((char) i);
					lblNewLabel_2.setText(s);
				}
			} catch (Throwable th) {
				text_5.setText("");
			}
		}
	};
	private Text text;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn12;
	private Button btn13;
	private Button btn14;
	private Button btn15;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btn16;
	private Button btn18;
	private Button btn11;
	private Button btn19;
	private Button btn10;
	private Button btn24;
	private Button btn17;
	private Button btn22;
	private Button btn23;
	private Button btn20;
	private Button btn25;
	private Button btn21;
	private Button btn26;
	private Button btn27;
	private Button btn28;
	private Text text_1;
	private Composite composite;
	private Label lblNewLabel_1;
	private Label lblText;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MMTypingWithWindowBuilder window = new MMTypingWithWindowBuilder();
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
		initialize();
		shlMyanmarTyping.open();
		shlMyanmarTyping.layout();
		while (!shlMyanmarTyping.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	private Composite composite_1;
	private Composite composite_2;
	private Button btnSign1;
	private Button btnSign2;
	private Button btnSign7;
	private Button btnSign3;
	private Button btnSign4;
	private Button btnSign8;
	private Button btnSign5;
	private Button btnSign6;
	private Button btnSign9;
	private Button btnSign10;
	private Button btnSign11;
	private Button btnSign12;
	private Composite btnSign13;
	private Button btnSign14;
	private Button btnSign15;
	private Button btnSign16;
	private Button btnSign17;
	private Composite composite_4;
	private Button btnNum7;
	private Button btnNum8;
	private Button btnNum4;
	private Button btnNum5;
	private Button btnNum9;
	private Button btnNum6;
	private Button btnNum1;
	private Button btnNum2;
	private Button btnNum3;
	private Button btnNum0;
	private Composite composite_3;
	private Button button;
	private Label lblNewLabel;
	private Text text_2;
	private Text text_3;
	private Label lblPyidaungsu;
	private Text text_4;
	private Label lblUnicode;
	private Button button_1;
	private Button button_2;
	private Text text_5;
	private Button btnAdd;
	private Label lblNewLabel_2;

	private void initialize() {
		List<Control> children = new ArrayList<>(Arrays.asList(shlMyanmarTyping.getChildren()));
		while (!children.isEmpty()) {
			Control c = children.remove(0);
			if (c instanceof Composite) {
				children.addAll(Arrays.asList(((Composite) c).getChildren()));
			} else if (c instanceof Button) {
				Button b = (Button) c;
				MMKey key = MMKey.ALL_MM_KEY_MAP.get(b.getText().charAt(0));
				if (key != null) {
					b.setData(key);
					b.setText(key.toString());
					b.addSelectionListener(listener);
				}
			}
		}

		text.addModifyListener(modifyListener);
		text_5.addModifyListener(modifyTextListener);

		text_1.setEditable(false);
		text_2.setEditable(false);
		text_3.setEditable(false);
		text_4.setEditable(false);
		text.setFocus();
		text.setText(defaultText);
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMyanmarTyping = new Shell();
		shlMyanmarTyping.setSize(437, 456);
		shlMyanmarTyping.setText("Myanmar Typing");
		shlMyanmarTyping.setLayout(new GridLayout(2, false));

		lblUnicode = new Label(shlMyanmarTyping, SWT.NONE);
		lblUnicode.setText("Unicode:");
		lblUnicode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		text_4 = new Text(shlMyanmarTyping, SWT.BORDER);
		text_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		text_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		text_4.setFont(SWTResourceManager.getFont("Arial", 10, SWT.NORMAL));
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblText = new Label(shlMyanmarTyping, SWT.NONE);
		lblText.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblText.setText("Myanmar3:");

		text = new Text(shlMyanmarTyping, SWT.BORDER);
		text.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		text.setFont(SWTResourceManager.getFont("Myanmar3", 20, SWT.NORMAL));
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblPyidaungsu = new Label(shlMyanmarTyping, SWT.NONE);
		lblPyidaungsu.setText("Pyidaungsu:");
		lblPyidaungsu.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		text_3 = new Text(shlMyanmarTyping, SWT.BORDER);
		text_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		text_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		text_3.setFont(SWTResourceManager.getFont("Pyidaungsu", 12, SWT.NORMAL));
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblNewLabel = new Label(shlMyanmarTyping, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Noto Sans Myanmar:");

		text_2 = new Text(shlMyanmarTyping, SWT.BORDER);
		text_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		text_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		text_2.setFont(SWTResourceManager.getFont("Noto Sans Myanmar", 12, SWT.NORMAL));
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblNewLabel_1 = new Label(shlMyanmarTyping, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Zawgyi-One:");

		text_1 = new Text(shlMyanmarTyping, SWT.BORDER);
		text_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		text_1.setFont(SWTResourceManager.getFont("Zawgyi-One", 12, SWT.NORMAL));
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		composite_1 = new Composite(shlMyanmarTyping, SWT.NONE);
		composite_1.setLayout(new GridLayout(5, false));
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		gd_composite_1.heightHint = 73;
		gd_composite_1.widthHint = 174;
		composite_1.setLayoutData(gd_composite_1);
		new Label(composite_1, SWT.NONE);

		composite = new Composite(composite_1, SWT.NONE);
		composite.setLayout(new GridLayout(5, false));

		btn1 = new Button(composite, SWT.FLAT);
		btn1.setText(MM.KA);
		btn1.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn2 = new Button(composite, SWT.FLAT);
		btn2.setText(MM.KHA);
		btn2.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn3 = new Button(composite, SWT.FLAT);
		btn3.setText(MM.GA);
		btn3.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn4 = new Button(composite, SWT.FLAT);
		btn4.setText(MM.GHA);
		btn4.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn5 = new Button(composite, SWT.FLAT);
		btn5.setText(MM.NGA);
		btn5.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn6 = new Button(composite, SWT.FLAT);
		btn6.setText(MM.CA);
		btn6.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn7 = new Button(composite, SWT.FLAT);
		btn7.setText(MM.CHA);
		btn7.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn8 = new Button(composite, SWT.FLAT);
		btn8.setText(MM.JA);
		btn8.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn9 = new Button(composite, SWT.FLAT);
		btn9.setText(MM.JHA);
		btn9.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn10 = new Button(composite, SWT.FLAT);
		btn10.setText(MM.NNYA);
		btn10.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn11 = new Button(composite, SWT.FLAT);
		btn11.setText(MM.TA);
		btn11.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn12 = new Button(composite, SWT.FLAT);
		btn12.setText(MM.THA);
		btn12.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn13 = new Button(composite, SWT.FLAT);
		btn13.setText(MM.DA);
		btn13.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn14 = new Button(composite, SWT.FLAT);
		btn14.setText(MM.DHA);
		btn14.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn15 = new Button(composite, SWT.FLAT);
		btn15.setText(MM.NA);
		btn15.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn16 = new Button(composite, SWT.FLAT);
		btn16.setText(MM.PA);
		btn16.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn17 = new Button(composite, SWT.FLAT);
		btn17.setText(MM.PHA);
		btn17.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn18 = new Button(composite, SWT.FLAT);
		btn18.setText(MM.BA);
		btn18.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn19 = new Button(composite, SWT.FLAT);
		btn19.setText(MM.BHA);
		btn19.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn20 = new Button(composite, SWT.FLAT);
		btn20.setText(MM.MA);
		btn20.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn21 = new Button(composite, SWT.FLAT);
		btn21.setText(MM.YA);
		btn21.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn22 = new Button(composite, SWT.FLAT);
		btn22.setText(MM.RA);
		btn22.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn23 = new Button(composite, SWT.FLAT);
		btn23.setText(MM.LA);
		btn23.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn24 = new Button(composite, SWT.FLAT);
		btn24.setText(MM.WA);
		btn24.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn25 = new Button(composite, SWT.FLAT);
		btn25.setText(MM.SA);
		btn25.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		new Label(composite, SWT.NONE);

		btn26 = new Button(composite, SWT.FLAT);
		btn26.setText(MM.HA);
		btn26.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		btn27 = new Button(composite, SWT.FLAT);
		btn27.setText(MM.LLA);
		btn27.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		btn28 = new Button(composite, SWT.FLAT);
		btn28.setText(MM.A);
		btn28.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		new Label(composite, SWT.NONE);

		composite_2 = new Composite(composite_1, SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		composite_2.setLayout(new GridLayout(2, false));

		btnSign1 = new Button(composite_2, SWT.FLAT);
		btnSign1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnSign1.setText(MM.SIGN_TALL_AA);

		btnSign2 = new Button(composite_2, SWT.FLAT);
		btnSign2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		btnSign2.setText(MM.SIGN_AA);

		btnSign3 = new Button(composite_2, SWT.FLAT);
		btnSign3.setText(MM.SIGN_I);
		btnSign3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign4 = new Button(composite_2, SWT.FLAT);
		btnSign4.setText(MM.SIGN_II);
		btnSign4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign5 = new Button(composite_2, SWT.FLAT);
		btnSign5.setText(MM.SIGN_U);
		btnSign5.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign6 = new Button(composite_2, SWT.FLAT);
		btnSign6.setText(MM.SIGN_UU);
		btnSign6.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign7 = new Button(composite_2, SWT.FLAT);
		btnSign7.setText(MM.SIGN_E);
		btnSign7.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign8 = new Button(composite_2, SWT.FLAT);
		btnSign8.setText(MM.SIGN_AI);
		btnSign8.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign9 = new Button(composite_2, SWT.FLAT);
		btnSign9.setText(MM.SIGN_DOT_BELOW);
		btnSign9.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign10 = new Button(composite_2, SWT.FLAT);
		btnSign10.setText(MM.SIGN_ANUSVARA);
		btnSign10.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign11 = new Button(composite_2, SWT.FLAT);
		btnSign11.setText(MM.SIGN_VISARGA);
		btnSign11.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign12 = new Button(composite_2, SWT.FLAT);
		btnSign12.setText(MM.SIGN_ASAT);
		btnSign12.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		btnSign13 = new Composite(composite_1, SWT.NONE);
		btnSign13.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		btnSign13.setLayout(new GridLayout(2, false));

		btnSign14 = new Button(btnSign13, SWT.FLAT);
		btnSign14.setText(MM.SIGN_MEDIAL_YA);

		btnSign15 = new Button(btnSign13, SWT.FLAT);
		btnSign15.setText(MM.SIGN_MEDIAL_RA);

		btnSign16 = new Button(btnSign13, SWT.FLAT);
		btnSign16.setText(MM.SIGN_MEDIAL_WA);

		btnSign17 = new Button(btnSign13, SWT.FLAT);
		btnSign17.setText(MM.SIGN_MEDIAL_HA);

		button_1 = new Button(btnSign13, SWT.FLAT);
		button_1.setText(MM.SIGN_LITTLE_SECTION);

		button_2 = new Button(btnSign13, SWT.FLAT);
		button_2.setText(MM.SIGN_SECTION);

		composite_4 = new Composite(composite_1, SWT.NONE);
		composite_4.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		composite_4.setLayout(new GridLayout(3, false));

		btnNum7 = new Button(composite_4, SWT.FLAT);
		btnNum7.setText(MM.SEVEN);

		btnNum8 = new Button(composite_4, SWT.FLAT);
		btnNum8.setText(MM.EIGHT);

		btnNum9 = new Button(composite_4, SWT.FLAT);
		btnNum9.setText(MM.NINE);

		btnNum4 = new Button(composite_4, SWT.FLAT);
		btnNum4.setText(MM.FOUR);

		btnNum5 = new Button(composite_4, SWT.FLAT);
		btnNum5.setText(MM.FIVE);

		btnNum6 = new Button(composite_4, SWT.FLAT);
		btnNum6.setText(MM.SIX);

		btnNum1 = new Button(composite_4, SWT.FLAT);
		btnNum1.setText(MM.ONE);

		btnNum2 = new Button(composite_4, SWT.FLAT);
		btnNum2.setText(MM.TWO);

		btnNum3 = new Button(composite_4, SWT.FLAT);
		btnNum3.setText(MM.THREE);

		btnNum0 = new Button(composite_4, SWT.FLAT);
		btnNum0.setText(MM.ZERO);
		new Label(composite_4, SWT.NONE);
		new Label(composite_4, SWT.NONE);
		new Label(composite_1, SWT.NONE);

		composite_3 = new Composite(composite_1, SWT.NONE);
		GridData gd_composite_3 = new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1);
		gd_composite_3.widthHint = 102;
		composite_3.setLayoutData(gd_composite_3);
		composite_3.setLayout(new GridLayout(5, false));

		button = new Button(composite_3, SWT.FLAT);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				text.setText("");
			}
		});
		button.setText("Clear");
		new Label(composite_3, SWT.NONE);

		lblNewLabel_2 = new Label(composite_3, SWT.NONE);
		lblNewLabel_2.setAlignment(SWT.RIGHT);
		lblNewLabel_2.setText("<empty>");
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		text_5 = new Text(composite_3, SWT.BORDER);

		btnAdd = new Button(composite_3, SWT.FLAT);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String t = lblNewLabel_2.getText();
				if (t.length() == 1) {
					text.append(t);
				}
			}
		});
		btnAdd.setText("Add");
		new Label(composite_1, SWT.NONE);

		new Label(shlMyanmarTyping, SWT.NONE);
		new Label(shlMyanmarTyping, SWT.NONE);

	}
}
