
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Välkommen till ritprogrammet!");
		primaryStage.setWidth(1000);
		primaryStage.setHeight(600);
		
		BorderPane border = new BorderPane();
		//HBox hbox = new HBox();
		Model model = new Model();
		MyCanvas canvas = new MyCanvas();
		PaintSurface ps = new PaintSurface(model);
		SidePanel sidePanel = new SidePanel(ps, model);
		buttomPanel buttomPanel = new buttomPanel(ps, model);
		border.setBottom(buttomPanel);
		border.setCenter(ps);
		border.setRight(sidePanel);

		Scene mainScene = new Scene(border);
		primaryStage.setScene(mainScene);

		primaryStage.show();
	
		
	}
	
	}
	


