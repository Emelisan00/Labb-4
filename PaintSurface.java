import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintSurface extends MyCanvas {

	public PaintSurface(Model model) {

		setOnMouseClicked(event -> {
			Brush(event, model);
		});

	}

	public void Brush(MouseEvent event, Model model) {

		GraphicsContext gc = getGraphicsContext2D();
		gc.setFill(model.getColorChoice());

		model.getShapeChoice().drawYourself(event, gc, model);
		System.out.println("\n");
		model.printDrawnShapes();

	}

	public void clear() {
		GraphicsContext gc = getGraphicsContext2D();

		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, getWidth(), getHeight());
	}

}
