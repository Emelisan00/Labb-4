import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

public class MyTriangle extends Shape {

	public MyTriangle(double X, double Y) {
		super(X, Y);
	}


	@Override
	public void drawYourself(MouseEvent event, GraphicsContext gc, Model model) {
		double[] xCoords = new double[3];
		
		xCoords[0] = (event.getX() + 40);
		xCoords[1] = (event.getX() + 80);
		xCoords[2] = event.getX();
	
		double[] yCoords = new double[3];
		yCoords[0] = event.getY();
		yCoords[1] = event.getY() + 80;
		yCoords[2] = event.getY() + 80;
		gc.fillPolygon(xCoords, yCoords, 3);
		model.addDrawnShape(new MyTriangle(event.getX(),event.getY()));
	}
		

}
