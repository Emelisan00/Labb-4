import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SidePanel extends VBox {
private Button blue;
private Button red;
private Button yellow;
private Button green;
private Button black;
private Button white;
private Button orange;
private Button pink;
private Button currentColor;

private Button circle;
private Button rectangle;
private Button triangle;
private Button currentShape;
	public SidePanel(PaintSurface ps, Model model) throws FileNotFoundException{
		
		
	
		setStyle("-fx-background-color: #9fa3ab");
		blue = new Button();
		blue.setPrefSize(45, 40);
		blue.setStyle("-fx-background-color: #2525f5");
		red = new Button();
		red.setPrefSize(45, 40);
		red.setStyle("-fx-background-color: #f52525");
		yellow = new Button();
		yellow.setPrefSize(45, 40);
		yellow.setStyle("-fx-background-color: #fce700");;
		green = new Button();
		green.setPrefSize(45, 40);
		green.setStyle("-fx-background-color: #17b31f");;
		black = new Button();
		black.setPrefSize(45, 40);
		black.setStyle("-fx-background-color: #000000");;
		white = new Button();
		white.setPrefSize(45, 40);
		white.setStyle("-fx-background-color: #ffffff");;
		orange = new Button();
		orange.setPrefSize(45, 40);
		orange.setStyle("-fx-background-color: #eb8f34");;
		pink = new Button();
		pink.setPrefSize(45, 40);
		pink.setStyle("-fx-background-color: #fa9dcc");;
		currentColor = new Button();
		currentColor.setPrefSize(45, 40);
		currentColor.setStyle("-fx-background-color: #000000");;
		
		
		circle = new Button();
		Image cImage = new Image(new FileInputStream("C:\\Users\\Emelie Bergeryd\\eclipse-TDDE10\\Lab4\\src\\newcircle.png"));
		ImageView circleImage = new ImageView(cImage);
		circleImage.setFitHeight(30);
		circleImage.setFitWidth(30);
		circle.setGraphic(circleImage);
		
		rectangle = new Button();
		Image rImage = new Image(new FileInputStream("C:\\Users\\Emelie Bergeryd\\eclipse-TDDE10\\Lab4\\src\\square.png"));
		ImageView rectangleImage = new ImageView(rImage);
		rectangleImage.setFitHeight(30);
		rectangleImage.setFitWidth(30);
		rectangle.setGraphic(rectangleImage);
		
		
		triangle = new Button();
		Image tImage = new Image(new FileInputStream("C:\\Users\\Emelie Bergeryd\\eclipse-TDDE10\\Lab4\\src\\triangle.png"));
		ImageView triangleImage = new ImageView(tImage);
		triangleImage.setFitHeight(30);
		triangleImage.setFitWidth(30);
		triangle.setGraphic(triangleImage);
		
		currentShape = new Button();
		ImageView current = new ImageView(cImage);
		current.setFitHeight(30);
		current.setFitWidth(30);
		currentShape.setGraphic(current);
		
		
	
		
		getChildren().add(currentColor);
		getChildren().add(blue);
		getChildren().add(red);
		getChildren().add(yellow);
		getChildren().add(green);
		getChildren().add(black);
		getChildren().add(white);
		getChildren().add(orange);
		getChildren().add(pink);
		
		getChildren().add(currentShape);
		getChildren().add(circle);
		getChildren().add(rectangle);
		getChildren().add(triangle);
		
		
		blue.setOnAction(value -> { 
			currentColor.setStyle("-fx-background-color: #2525f5");
			model.chooseColor(0);
		});
		
		red.setOnAction(value -> { 
			
			currentColor.setStyle("-fx-background-color: #f52525");
			model.chooseColor(1);
		});
		
		yellow.setOnAction(value -> { 
			currentColor.setStyle("-fx-background-color: #fce700");
			model.chooseColor(2);
		});
		
		green.setOnAction(value -> { 
			
			currentColor.setStyle("-fx-background-color: #17b31f");
			model.chooseColor(3);
		});
		
		black.setOnAction(value -> { 
			currentColor.setStyle("-fx-background-color: #000000");
			model.chooseColor(4);
		});
		
		white.setOnAction(value -> { 
			currentColor.setStyle("-fx-background-color: #ffffff");
			model.chooseColor(5);
		});
		
		orange.setOnAction(value -> { 
			currentColor.setStyle("-fx-background-color: #eb8f34");
			model.chooseColor(6);
		});
		
		pink.setOnAction(value -> { 
			currentColor.setStyle("-fx-background-color: #fa9dcc");
			model.chooseColor(7);
		});
		
		circle.setOnAction(value -> { 
			ImageView temp = new ImageView(cImage);
			temp.setFitHeight(30);
			temp.setFitWidth(30);
			currentShape.setGraphic(temp);
			model.chooseShape(new MyCircle(70, 70) );
		});
		

		rectangle.setOnAction(value -> { 
			
			ImageView temp = new ImageView(rImage);
			temp.setFitHeight(30);
			temp.setFitWidth(30);
			currentShape.setGraphic(temp);
			model.chooseShape(new MyRectangle(70, 70));
		});
		
		triangle.setOnAction(value -> { 
			ImageView temp = new ImageView(tImage);
			temp.setFitHeight(30);
			temp.setFitWidth(30);
			currentShape.setGraphic(temp);
			model.chooseShape(new MyTriangle(70, 70));
		});
		

	}
	}
	

