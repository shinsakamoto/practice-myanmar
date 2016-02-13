package samples.myanmar.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * MM keyboard prototype<br>
 * Using JavaFX<br>
 * <img alt="image" src="./doc-files/ApplicationMain.png">
 * 
 * @author sakamoto
 *
 */
public class ApplicationMain extends Application {
    private double dragStartX;
    private double dragStartY;
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("MainView.fxml"));
			Scene scene = new Scene(root,800,300,Color.TRANSPARENT);
			scene.setOnMousePressed(e -> {
	            dragStartX = e.getSceneX();
	            dragStartY = e.getSceneY();
	        });
	        scene.setOnMouseDragged(e -> {
	        	primaryStage.setX(e.getScreenX() - dragStartX);
	            primaryStage.setY(e.getScreenY() - dragStartY);
	        });
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
