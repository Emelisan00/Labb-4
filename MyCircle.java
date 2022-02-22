import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class MyCircle extends Shape{

	public MyCircle(double X, double Y) {
		super(X, Y);
	
	}

	@Override
	public void drawYourself(MouseEvent event, GraphicsContext gc, Model model) {
		gc.fillOval(event.getX(), event.getY(), 70, 70);
		model.addDrawnShape(new MyCircle(event.getX(),event.getY()));
		
	}
}

//}
