/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class viewcustomer {
	
	private Scene scene;
	private Stage stage;
	private CustomerPick cpick;
	private Arraylists array;
	
//	Label  Name=new Label ("Name:");
//	Label  cartype=new Label("CarType:");
//	Label dest=new Label ("Destination:");
//	Label From=new Label("From:");
//	Label To=new Label ("To:");
//	Label stops=new Label("Stops:");
//	Label  typeofticket=new Label ("Type Of Ticket:");
//	Label  seat=new Label("Seat No:");
//	Label price=new Label("Price:");
//	int i=0;
//	for(i=0;i<)


public viewcustomer (Stage stage,Arraylists array) {
	this.stage=stage;
	this.array=array;
}
	

public void preparescene() {
		
		Label  Name=new Label ();
		Label  cartype=new Label();
		Label dest=new Label ();
		Label From=new Label();
		Label To=new Label ();
		Label stops=new Label();
		Label  typeofticket=new Label ();
		Label  seat=new Label();
		Label price=new Label();
		Button Back=new Button("Back");
		
		GridPane root= new GridPane();
		root.add(Name, 0, 0);
		root.add(cartype, 0, 1);
		root.add(dest, 0, 2);
		root.add(From, 0, 3);
		root.add(To, 0, 4);
		root.add(stops, 0, 5);
		root.add(typeofticket, 0, 6);
		root.add(seat, 0, 7);
		root.add(price, 0, 8);
		root.add(Back,3,11);
		
		root.setHgap(3);
		root.setVgap(3);
		root.setAlignment(Pos.BASELINE_CENTER);
		
		
		Back.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				getStage().setScene(getCpick().getScene());
			}
		});
		
		
	
	     root.setStyle("-fx-background-color:LightBlue ");
	    setScene(new Scene(root,600,400));
				
	}

public Scene getScene() {
	return scene;
}

public Stage getStage() {
	return stage;
}

public void setStage(Stage stage) {
	this.stage = stage;
}

public void setScene(Scene scene) {
	this.scene = scene;
}


public CustomerPick getCpick() {
	return cpick;
}


public void setCpick(CustomerPick cpick) {
	this.cpick = cpick;
}


public Arraylists getArray() {
	return array;
}


public void setArray(Arraylists array) {
	this.array = array;
}


}