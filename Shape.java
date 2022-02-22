
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public abstract class Shape {

	
	public Shape( double X, double Y) {
		
		
	}
	
	public abstract void drawYourself(MouseEvent event, GraphicsContext gc, Model model);


}
