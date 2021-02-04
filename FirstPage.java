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
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author scs
 */
public class FirstPage {
     private Stage stage;
     private Scene scene;
     private Employee1 employee1;
     private custLogin pass1; 
     

    public FirstPage(Stage stage) {
        this.stage=stage;
    }
    

    public void preparescene(){
       Button employee = new Button();
        Button passenger= new Button();
        Label choose= new Label();
        choose.setText("choose");
        employee.setText("Employee");
        passenger.setText("passenger");
        employee.setStyle("-fx-background-color:WHITE");
        passenger.setStyle("-fx-background-color:WHITE");
        employee.setTextFill(Color.web("LIGHTBLUE"));
        employee.setFont(Font.font("verdana", 13));
        passenger.setTextFill(Color.web("LIGHTBLUE"));
        passenger.setFont(Font.font("verdana", 13));
         Group grid = new Group();
        Rectangle rect1 = new Rectangle(10, 10,580 , 380);
        rect1.setFill(Color.WHITE);
        rect1.setArcHeight(17);
        rect1.setArcWidth(17);
        rect1.setStroke(Color.WHITE);
        
        Rectangle rect2 = new Rectangle(140, 90,300 , 200);
        rect2.setFill(Color.LIGHTBLUE);
        rect2.setArcHeight(17);
        rect2.setArcWidth(17);
        rect2.setStroke(Color.WHITE);
        
        grid.getChildren().add(rect1);
        grid.getChildren().add(rect2);
        grid.getChildren().add(employee);
        grid.getChildren().add(passenger);
        
        employee.setLayoutX(200);
        employee.setLayoutY(170);
        passenger.setLayoutX(300);
        passenger.setLayoutY(170);
        
        setScene(new Scene(grid, 600, 400,Color.LIGHTBLUE)); 
        
        
        employee.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                getStage().setScene(getEmployee1().getscene());
            }
        });
        passenger.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                getStage().setScene(getPass1().getScene());
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

    public Employee1 getEmployee1() {
        return employee1;
    }

    public void setEmployee1(Employee1 employee1) {
        this.employee1 = employee1;
    }

    public custLogin getPassenger() {
        return getPass1();
    }

    public void setPassenger(custLogin passenger) {
        this.setPass1(passenger);
    }

    /**
     * @return the pass1
     */
    public custLogin getPass1() {
        return pass1;
    }

    /**
     * @param pass1 the pass1 to set
     */
    public void setPass1(custLogin pass1) {
        this.pass1 = pass1;
    }

    
    
    
}
