/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author scs
 */
public class Employee1 {
    private Stage stage;
    private Scene scene;
    private FirstPage pick;
    private LoginForm login1;
    private LoginForm login2;
    private String Checker ;
   
    public Employee1(Stage stage ) {
        this.stage=stage;
        
    }
    
    public void preparescene(){
        
       // Button manager = new Button();
        Button manager = new Button("manager");
        Button driver = new Button("driver");
        manager.setFont(Font.font("verdana", 17));
        driver.setFont(Font.font("verdana", 17));
        Text text= new Text("please choose your profession");
        
        Group grid=new Group();
        Rectangle rect1 = new Rectangle(10, 10,580 , 380);
        rect1.setFill(Color.WHITE);
        rect1.setArcHeight(30);
        rect1.setArcWidth(30);
        rect1.setStroke(Color.WHITE);
        manager.setStyle("-fx-background-color:LIGHTBLUE");
        driver.setStyle("-fx-background-color:LIGHTBLUE");
        text.setFill(Color.LIGHTBLUE);
        text.setFont(Font.font("verdana", 20));
        
        grid.getChildren().add(rect1);
        grid.getChildren().add(manager);
        grid.getChildren().add(driver);
        grid.getChildren().add(text);
        
        
        manager.setLayoutX(180);
        manager.setLayoutY(170);
        driver.setLayoutX(320);
        driver.setLayoutY(170);
        text.setLayoutX(150);
        text.setLayoutY(150);
        
        setScene(new Scene(grid,600,400,Color.LIGHTBLUE));
        
        
        
        
        
        
        manager.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                  setChecker(manager.getText());
                getStage().setScene(getLogin1().getScene());
                
            
            }
        });
        driver.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                setChecker(driver.getText());
                getStage().setScene(getLogin2().getScene());
            }
        });
}

    public Scene getscene() {
        return this.getScene();
    
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

    public FirstPage getpick() {
        return getPick();
    }


    public LoginForm getLogin() {
        return getLogin1();
    }

    public void setLogin(LoginForm login) {
        this.setLogin1(login);
    }

    public void setLogin2(LoginForm login2) {
        this.login2 = login2;
    }

    /**
     * @return the pick
     */
    public FirstPage getPick() {
        return pick;
    }

    /**
     * @param pick the pick to set
     */
    public void setPick(FirstPage pick) {
        this.pick = pick;
    }

    /**
     * @return the login1
     */
    public LoginForm getLogin1() {
        return login1;
    }

    /**
     * @param login1 the login1 to set
     */
    public void setLogin1(LoginForm login1) {
        this.login1 = login1;
    }

    /**
     * @return the login2
     */
    public LoginForm getLogin2() {
        return login2;
    }

    /**
     * @return the Checker
     */
    public String getChecker() {
        return Checker;
    }

    /**
     * @param Checker the Checker to set
     */
    public void setChecker(String Checker) {
        this.Checker = Checker;
    }

   
    
}
