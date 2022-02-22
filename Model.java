import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class Model {
	
	
	private  ArrayList<Shape> drawnShapes = new ArrayList<Shape>();

	private Color[] colors = {Color.BLUE, Color.RED, Color.YELLOW, Color.GREEN, Color.BLACK, Color.WHITE, Color.ORANGE, Color.PINK};
	private int colorChoice = 4;
	private Shape shapeChoice = new MyCircle(60, 30);
	
	
	public Color getColorChoice() {
		return colors[colorChoice];
	}
	
	public Shape getShapeChoice() {
		return shapeChoice;
	}
	public void chooseColor(int colorChoice){
		this.colorChoice = colorChoice;
	}

	public void chooseShape(Shape shapeChoice) {
		this.shapeChoice = shapeChoice;
	}
	
	public void addDrawnShape(Shape shape) {
		drawnShapes.add(shape);
	}
	public void printDrawnShapes() {
		for (Shape shape : drawnShapes) {
			System.out.println(shape);
		}
	}
	
	public void clearDrawnShapes() {
		drawnShapes.clear();
	}


	
}
