
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class buttomPanel extends HBox{
private Button clearButton;
public buttomPanel(PaintSurface ps, Model model){
	
	
setStyle("-fx-background-color: #9fa3ab"); 
clearButton = new Button("rensa");

getChildren().add(clearButton);

clearButton.setOnAction(value -> { 
	ps.clear();
	model.clearDrawnShapes();
});
}
}

