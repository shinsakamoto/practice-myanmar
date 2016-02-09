package samples.myanmar.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MMTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		char text1 = 0x1000;// ka
		char text2 = 0x102b;// 
		char text3 = 0x102c;// 
		char[] t1 = new char[] { text1, text2 };
		char[] t2 = new char[] { text2, text1 };
		char[] t3 = new char[] { text1, text3 };
		char[] t4 = new char[] { text3, text1 };

		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text2);
		System.out.println("---");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		// Myanmar3
		// Myanmar MN
		// MyanmarMN-Bold
		// Myanmar Sangam MN
		// MyanmarSangamMN-Bold
		// Zawgyi-One

		Font f1 = Font.font("Myanmar3", 20);
		Font f2 = Font.font("Myanmar Sangam MN", 20);
		Font f3 = Font.font("Noto Sans Myanmar", 20);
		Font f4 = Font.font("Zawgyi-One", 20);
		
		for(String name : Font.getFontNames()){
			System.out.println(name);
		}
		
		String ts1 = new String(t1);
		String ts2 = new String(t2);
		String ts3 = new String(t3);
		String ts4 = new String(t4);
		
		Label label0 = new Label( " 0x1000 0x102b  ,  0x102b 0x1000  ,  0x1000 0x102c  ,  0x102c 0x1000 ");
		
		Label label1 = new Label(ts3 );
		
		//Label label1 = new Label( " Myanmar3 : " + ts1 + "  " + ts2 + "  " + ts3 + "  " + ts4);
		label1.setFont(f1);
		label1.setText(new String(new char[]{0x1000 ,0x102c}));
		//Label label2 = new Label(" Myanmar Sangam MN : " + ts1 + "  " + ts2 + "  " + ts3 + "  " + ts4);
		Label label2 = new Label(ts3);
		label2.setFont(f2);
		Label label3 = new Label(" Noto Sans Myanmar : " +ts1 + "  " + ts2 + "  " + ts3 + "  " + ts4);
		label3.setFont(f3);
		Label label4 = new Label(" Zawgyi-One : " +ts1 + "  " + ts2 + "  " + ts3 + "  " + ts4);
		label4.setFont(f4);
		
		//FlowPane pane = new FlowPane();
		VBox pane = new VBox(5.0d);
		pane.getChildren().add(label0);
		pane.getChildren().add(label1);
		pane.getChildren().add(label2);
		pane.getChildren().add(label3);
		pane.getChildren().add(label4);
		Scene scene = new Scene(pane, 520, 320);
		stage.setScene(scene);
		stage.show();
	}
}
