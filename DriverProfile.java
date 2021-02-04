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
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author scs
 */
public class DriverProfile {
    private Stage stage;
    private Scene scene;
    private LoginForm login;
    private Arraylists array;
    
    public DriverProfile(Stage stage,LoginForm login,Arraylists array) {
        this.stage=stage;
        this.login=login;
        this.array=array;
    }
   
    
    public void preparescene(){
        
        Image image = new Image("/busstation1/driver.jpg",60, 60, true, true);
        ImageView mv = new ImageView(image);
       // Text name= new Text("username:");
        //Text id= new Text("ID:");
        Text namelabel= new Text("welcome our favourite driver");
      //  Text idlabel= new Text(String.valueOf(login.ID));
        Text typeCar= new Text();
        Text info= new Text("General information");
        ListView events = new ListView();
        info.setFont(Font.font("verdana", 16));
        typeCar.setFont(Font.font("verdana", 13));
        Button logout = new Button("Logout");
        Button showtrips = new Button("show you trips");
        
        
        Group grid = new Group();
        Rectangle rect1 = new Rectangle(10, 10,580 , 380);
        rect1.setFill(Color.WHITE);
        rect1.setArcHeight(17);
        rect1.setArcWidth(17);
        rect1.setStroke(Color.WHITE);
        showtrips.setStyle("-fx-background-color:LIGHTBLUE");
//        name.setFill(Color.WHITE);
  //      id.setFill(Color.WHITE);
//        idlabel.setFill(Color.WHITE);
        namelabel.setFill(Color.WHITE);
        typeCar.setFill(Color.LIGHTBLUE);
        info.setFill(Color.BLACK);
        Rectangle rect2 = new Rectangle(25, 20, 550, 100);
        rect2.setFill(Color.LIGHTBLUE);
        rect2.setArcHeight(17);
        rect2.setArcWidth(17);
        logout.setFont(Font.font("verdana", 13));
        showtrips.setFont(Font.font("verdana", 13));
        logout.setTextFill(Color.web("LIGHTBLUE"));
        logout.setStyle("-fx-background-color: white");
        events.setStyle("-fx-background-color:LIGHTBLUE");
        namelabel.setFont(Font.font("verdana", 15));
        
        
        grid.getChildren().add(rect1);
        grid.getChildren().add(rect2);
        grid.getChildren().add(events);
        grid.getChildren().addAll(mv);
//        grid.getChildren().add(name);
  //      grid.getChildren().add(id);
        grid.getChildren().add(namelabel);
//        grid.getChildren().add(idlabel);
        grid.getChildren().add(typeCar);
        grid.getChildren().add(info);
        grid.getChildren().add(logout);
        grid.getChildren().add(showtrips);
        
       
//        name.setLayoutX(110);
  //      name.setLayoutY(40);
    //    id.setLayoutX(110);
      //  id.setLayoutY(70);
        namelabel.setLayoutX(175);
        namelabel.setLayoutY(60);
//        idlabel.setLayoutX(150);
//        idlabel.setLayoutY(70);
        mv.setLayoutX(35);
        mv.setLayoutY(30);
        typeCar.setLayoutX(25);
        typeCar.setLayoutY(200);
        showtrips.setLayoutX(25);
        showtrips.setLayoutY(250);
        info.setLayoutX(25);
        info.setLayoutY(160);
        events.setLayoutX(300);
        events.setLayoutY(130);
        events.setPrefSize(250, 250);
        logout.setLayoutX(400);
        logout.setLayoutY(50);
        
        
        
         
         setScene(new Scene(grid, 600, 400, Color.LIGHTBLUE));
         logout.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
                getStage().setScene(getLogin().getScene());
            }
        });
           showtrips.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
                int i=0;
            
              for(i=0;i<getArray().getTriplist().size();i++){
                if( getArray().getTriplist().get(i).getDriverId().equals(getLogin().getID())){
                
                    events.getItems().add(getArray().getTriplist().get(i).getFromto() /*+ "-" +array.triplist.get(i).To*/ );
                
                }else{
                    typeCar.setText("NO TRIPS YET!!");
                }    
              
            }
              }
            
        });
}
    
         
    

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    /**
     * @return the stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * @param stage the stage to set
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * @return the login
     */
    public LoginForm getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(LoginForm login) {
        this.login = login;
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
