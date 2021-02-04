package busstation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Passenger {
	
	Stage stage;
	Scene scene;
	Pick pick;
	public Passenger (Stage stage) {
		
		this.stage=stage;
	}
	
public void preparescene() {
	
	Label Welcome =new Label("Welcome");
	Label Name =new Label("Name:");
	Label Password=new Label("Password:");
	PasswordField Pass =new PasswordField();
	TextField Namee =new TextField ();
	Button Enter =new Button("Enter");
	
	GridPane root= new GridPane();
	root.add(Welcome, 0, 0);
	root.add(Name, 0, 1);
	root.add(Namee, 1,1);
	root.add(Password, 0, 2);
	root.add(Pass, 1, 2);
	root.add(Enter,1,3);
    root.setHgap(12);
	root.setVgap(10);
	root.setAlignment(Pos. TOP_CENTER);
	
    root.setStyle("-fx-background-color:CadetBlue ");
    scene =new Scene(root,600,400);
}

public Stage getStage() {
	return stage;
}

public void setStage(Stage stage) {
	this.stage = stage;
}

public Scene getScene() {
	return scene;
}

public void setScene(Scene scene) {
	this.scene = scene;
}

public void setPick(Pick pick) {
	this.pick = pick;
}

   
}
