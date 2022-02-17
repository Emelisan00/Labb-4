import javafx.scene.canvas.Canvas;

public class MyCanvas extends Canvas {

	public MyCanvas(){
		
//		setHeight(400);
//		setWidth(1000);
		
		 setOnMouseClicked(event -> {
		 System.out.println("Ojojoj, vi klicka i Canvas. Tvärtufft!");
	 });
		
	}
}
