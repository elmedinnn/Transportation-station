package busstation;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Pick {
	Scene scene;
	Stage stage;
    Passenger passenger;
   // Employee employee;
    

	public Pick (Stage stage) {
		this.stage=stage;
	}

	public void preparescene() {
		
		Button Employee =new Button ("Employee");
		Button Customer=new Button ("Customer");
		Label  Enter=new Label ("Pick,Bitch!");
		
		GridPane root= new GridPane();
		root.add(Employee, 4, 3);
		root.add(Customer, 0, 3);
		root.add(Enter,2,0);
		root.setHgap(12);
		root.setVgap(10);
		root.setAlignment(Pos. TOP_CENTER);
		
		
		   Enter.setTextFill(Color.web("Pink"));
		   Enter.setFont(new Font("Verdana",17));
		   Customer.setTextFill(Color.web("Pink"));
		   Customer.setFont(new Font("Verdana",17));
		   Employee.setTextFill(Color.web("Pink"));
		   Employee.setFont(new Font("Verdana",17));
		   
 /*    Employee.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent event) {
		stage.setScene(employee.getScene());
		
	}

});*/
     
		   Customer.setOnAction(new EventHandler<ActionEvent>() {

	    @Override
	     public void handle(ActionEvent event) {
	    	
		    stage.setScene(passenger.getScene());
		    
	}

});
		   
		     root.setStyle("-fx-background-color:CadetBlue ");
		    scene =new Scene(root,600,400);
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

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	/*public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
*/
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	

	
	
}
