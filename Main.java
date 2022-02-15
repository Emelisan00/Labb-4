
import javafx.application.Application;
import java.io.FileInputStream;
import javafx.scene.layout.StackPane;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Main extends Application implements EventHandler<ActionEvent>{
Button button;
ImageView image;
	public static void main(String[] args) {
		launch(args);

	}
	public void start(Stage primaryStage) throws Exception {
		Label text = new Label("Hello World");
	//	Image cover = new Image(new FileInputStream("/home/emebe760/Downloads/cover.png"));
		//image = new ImageView(cover);
	//	ProgressComponent pc = new ProgressComponent(100, cover.getHeight());


		primaryStage.setTitle("Välkommen till ritprogremmet!");
		primaryStage.setWidth(1000);
		primaryStage.setHeight(600);
		
		HBox layout = new HBox();
		buttomPanel buttomPanel = new buttomPanel();
		MyCanvas canvas = new MyCanvas();
		
		button = new Button();
		button.setText("Rensa");
		button.setOnAction(this);
		
	//buttomPanel.setStyle("-fx-background-color: #bfbab4;");
		 canvas.setStyle("-fx-background-color: #98d4ed;");
	
		

		buttomPanel.setMaxHeight(30);
		buttomPanel.setMinHeight(30);
		buttomPanel.setMaxWidth(1000);
		buttomPanel.setMinWidth(1000);
		
		buttomPanel.getChildren().add(button);

		layout.getChildren().add(canvas);
		layout.getChildren().add(buttomPanel);

		
		
		
		Scene mainScene = new Scene(layout);
		primaryStage.setScene(mainScene);
	
		
		//layout.getChildren().add(text);
		
	
	//	layout.getChildren().add(image);
		
		
		primaryStage.show();
		



//
//
//		GraphicsContext context = getGraphicsContext2D();
//		context.setFill(Color.DEEPPINK);
//		context.fillRect(0,  0, 100, 100);
//		
		
		
	}
	@Override
	public void handle(ActionEvent event) {
	if(event.getSource()==button) {
		System.out.println("Allt försvinner");
	}
		
	}
	

}
