package samples.myanmar;

import java.awt.GraphicsEnvironment;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class MainController implements Initializable {

	@FXML
	private TextField text;
	@FXML
	private Pane keyPane;
	private List<Key> keys = new ArrayList<>();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for(String name : Font.getFontNames()){
			// Myanmar3
			// Myanmar MN
			// MyanmarMN-Bold
			// Myanmar Sangam MN
			// MyanmarSangamMN-Bold
			// Zawgyi-One
			System.out.println(name);			
		}
		
		initKeys();
		Font f = Font.font("Myanmar Sangam MN", 16);
		text.setFont(f);
		for (Key key : keys) {
			String name = Character.toString(key.text);
			Button b = new Button(name);
			b.setFont(f);
			b.setOnAction((ActionEvent) -> {
				text.insertText(0, name);
			});
			keyPane.getChildren().add(b);
			System.out.println(key.toString());
		}

	}

	private void initKeys() {
		char text = 0x1000;
		int x = 0;
		int y = 30;
		int width = 30;
		int height = 30;
		for (int i = 1; i < 150; i++) {
			keys.add(new Key(text, x, y, width, height));
			text+=1;
			x=x+width+2;
		}
	}

}

class Key {
	public Key(char text, double x, double y, double width, double height) {
		this.text = text;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public char text;
	public double x;
	public double y;
	public double width;
	public double height;

	@Override
	public String toString() {

		return text + "(" + Integer.toHexString(text) + ")";
	}
}