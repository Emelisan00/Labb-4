

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class buttomPanel extends HBox{
Button clearButton;
public buttomPanel(){
setStyle("-fx-background-color: #9fa3ab"); 
//setHeight(400); // Sätter höjden på panelen till 100 pixlar 
//setWidth(899); // Sätter bredden till 1000 pixlar

clearButton = new Button("rensa");

getChildren().add(clearButton);

clearButton.setOnAction(value -> { 
	//PaintSurface.clear();
	System.out.println("Vi tryckte på knappen! Det går bra nu!"); 
});
}
}

