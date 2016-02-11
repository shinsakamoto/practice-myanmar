package samples.myanmar.test;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * How to use MM font<br>
 * Using JavaFX with WebView<br>
 * <img alt="image" src="./doc-files/MMTestFxWebView.png">
 * @author sakamoto
 *
 */
public class MMTestFxWebView extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox pane = new VBox(5.0d);
		WebView web = new WebView();
		WebEngine engine = web.getEngine();
		String content = new String(
				Files.readAllBytes(Paths.get(new URI(getClass().getResource("MMTestHTML.html").toString()))));
		engine.loadContent(content);
		System.out.println(content);
		pane.getChildren().add(web);
		Scene scene = new Scene(pane, 520, 320);
		stage.setScene(scene);
		stage.show();
	}
}
