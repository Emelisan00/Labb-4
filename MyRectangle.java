import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class MyRectangle extends Shape{

	public MyRectangle(double X, double Y) {
		super(X, Y);
	
	}

	@Override
	public void drawYourself(MouseEvent event, GraphicsContext gc, Model model) {
		gc.fillRect(event.getX(), event.getY(), 70, 70);
		model.addDrawnShape(new MyRectangle(event.getX(),event.getY()));
	}

}
