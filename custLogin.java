/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class custLogin {
	
	private Stage stage;
	private Scene scene;
	private FirstPage pick;
	private Reservation reservation;
	private CustomerPick cpick;
	private personsss person;
	private String x;
	private int i=0;
	private Arraylists array;

	
public custLogin (Stage stage,Arraylists array) {
		this.stage=stage;
		this.array=array;
		
	}
	
public void preparescene() {
	
		
	Text Welcome =new Text("PLEASE ENTER YOUR NAME AND ID");
	Text Name =new Text("Name:");
	Text Password=new Text("Password:");
        Text output=new Text();
	PasswordField Pass =new PasswordField();
	TextField Namee =new TextField ();
	Button Enter =new Button("Enter");
	Rectangle rect1 = new Rectangle(10, 10,580 , 380);
	Group grid= new Group();
        Welcome.setFill(Color.LIGHTBLUE);
        Welcome.setFont(Font.font("verdana", 20));
        Name.setFill(Color.LIGHTBLUE);
        Name.setFont(Font.font("verdana", 20));
        Password.setFill(Color.LIGHTBLUE);
        Password.setFont(Font.font("verdana", 20));
        Enter.setStyle("-fx-background-color:LIGHTBLUE");
        Enter.setFont(Font.font("verdana", 16));
         
    
        rect1.setFill(Color.WHITE);
        rect1.setArcHeight(30);
        rect1.setArcWidth(30);
        rect1.setStroke(Color.WHITE);
        
        grid.getChildren().add(rect1);
        grid.getChildren().add(Welcome);
        grid.getChildren().add(Name);
        grid.getChildren().addAll(Password);
        grid.getChildren().add(output);
        grid.getChildren().add(Pass);
        grid.getChildren().addAll(Namee);
        grid.getChildren().add(Enter);
    
	Welcome.setLayoutX(110);
        Welcome.setLayoutY(90);
        Name.setLayoutX(100);
        Name.setLayoutY(170);
        Password.setLayoutX(100);
        Password.setLayoutY(210);
        output.setLayoutX(210);
        output.setLayoutY(130);
        Namee.setLayoutX(210);
        Namee.setLayoutY(150);
        Pass.setLayoutX(210);
        Pass.setLayoutY(190);
        Enter.setLayoutX(250);
        Enter.setLayoutY(250);
	
    
        setScene(new Scene(grid,600,400,Color.LIGHTBLUE));
	
	
	  Enter.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
                            setX(Namee.getText());
				 setX(Namee.getText());
				//System.out.print(getX());
				 for(setI(0);getI()<getArray().getCustomerlist().size();setI(getI() + 1)){
					 //System.out.println(array.customerlist.get(i).id+array.customerlist.get(i).name);
					 System.out.println(String.valueOf(getArray().getCustomerlist().get(getI()).getId())+String.valueOf(getArray().getCustomerlist().get(getI()).getName()));
		               if((Pass.getText().equals(String.valueOf(getArray().getCustomerlist().get(getI()).getId())))&&(getX().equals(String.valueOf(getArray().getCustomerlist().get(getI()).getName())))){
		              	getStage().setScene(getCpick().getScene());
		                output.setText("Done!");
		                break;
		               }else{
		               //to do label here//
		                   output.setText("wrong username or password");
		                  
		             
		               }
		              }
	
				
			}

		});
		    
	
  
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

public void setPick(FirstPage pick) {
	this.pick = pick;
}

public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}

public void setCpick(CustomerPick cpick) {
	this.cpick = cpick;
}

public void setX(String x) {
	this.x = x;
}

public String getX() {
	
	return x;
}

    /**
     * @return the pick
     */
    public FirstPage getPick() {
        return pick;
    }

    /**
     * @return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * @return the cpick
     */
    public CustomerPick getCpick() {
        return cpick;
    }

    /**
     * @return the person
     */
    public personsss getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(personsss person) {
        this.person = person;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the array
     */
    public Arraylists getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(Arraylists array) {
        this.array = array;
    }

   
}
