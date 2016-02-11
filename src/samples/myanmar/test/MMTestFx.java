package samples.myanmar.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * How to use MM font<br>
 * Using JavaFX<br>
 * <img alt="image" src="./doc-files/MMTestFx.png">
 * @author sakamoto
 *
 */
public class MMTestFx extends Application {
	private String[] fontNames = { "Myanmar3", "Myanmar Sangam MN", "Noto Sans Myanmar", "Zawgyi-One" };
	private String text = "\u1000\u102c \u1000\u102b \u102c\u1000 \u102b\u1000";

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox pane = new VBox(5.0d);
		for (String name : fontNames) {
			Font f = Font.font(name, 20);
			Label label = new Label();
			label.setFont(f);
			label.setText(name + " : " + text);
			pane.getChildren().add(label);
		}
		Scene scene = new Scene(pane, 520, 320);
		stage.setScene(scene);
		stage.show();

		showAllFont();
	}

	private void showAllFont() {
		for (String name : Font.getFontNames()) {
			System.out.println(name);
		}
	}
}
