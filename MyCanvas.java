import javafx.scene.canvas.Canvas;

public class MyCanvas extends Canvas {

	public MyCanvas(){
		
		setHeight(400);
		setWidth(1000);
		
		// setStyle("-fx-background-color: #98d4ed;");
		 
		 setOnMouseClicked(event -> {
		 System.out.println("Ojojoj, vi klicka i Canvas. Tvärtufft!");
	 });
		
	}
}
