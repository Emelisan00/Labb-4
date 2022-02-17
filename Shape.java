import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {

	private int X;
	private int Y;
	private Color myColor;
	
	public Shape( int X, int Y, Color myColor) {
		this.X = X;
		this.Y = Y;
		this.myColor = myColor;
		
	}
	
	
	//private abstract void drawYourself(GraphicContext2D context);
}
