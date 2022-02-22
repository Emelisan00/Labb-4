import javafx.scene.canvas.Canvas;

public class MyCanvas extends Canvas {

	public MyCanvas(){
		
		setHeight(530);
		setWidth(900);
		
		 setOnMouseClicked(event -> {
		 System.out.println("Ojojoj, vi klicka i Canvas. Tvärtufft!");
	 });
		
	}
}
