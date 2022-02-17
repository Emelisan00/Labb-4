import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class Model {

	private Shape currentShape;
	private Color currentColor;
	//private  ArrayList<Shape> ourShapes = new ArrayList<Shape>();
	
	public void setShape(Shape currentShape) {
		this.currentShape = currentShape;
	}
	
	public void setColor(Color currentColor) {
		this.currentColor = currentColor;
	}
	
}
