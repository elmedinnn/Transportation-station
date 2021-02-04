/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;


import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.text.View;

/**
 *
 * @author scs
 */
public class ManagerProfile {
    private Stage stage;
    private Scene scene;
    private LoginForm login;
    private ReadFile fp;
    private SaveFile file1;
    private File f;
    private String s;
    private Arraylists arr;
    private String driverId="no driver assigned" ;
    
    public ManagerProfile(Stage stage,Arraylists array,SaveFile file1) {
        this.stage=stage;
        this.fp=fp;
        this.f=f;
        this.arr=array;
        this.file1=file1;
        
    }
  
    public ManagerProfile(Stage stage,LoginForm login,ReadFile fp) {
        this.stage=stage;
        this.login=login;
        this.fp=fp;
    }
   
    
    public void preparescene(){
        
        Image image = new Image("/busstation1/driver.jpg",60, 60, true, true);
        ImageView mv = new ImageView(image);
        Text name= new Text("Manager name:");
        Text name1= new Text(getArr().getPersonlist().get(0).getName());
        Text id1= new Text(getArr().getPersonlist().get(0).getId());
        Text id= new Text("ID:");
        TextField remove1 =new TextField ("destination to remove...");
        TextField idDriver =new TextField ("write id of driver here..");
      //  TextField dest =new TextField ("please enter trip dest");
        Button show= new Button("show trips");
        Button save= new Button("save");
        Button remove= new Button("remove trip");
        Button info= new Button("Assign");
        ListView events = new ListView();
//        events = (ListView) findViewById(R.id.list_item);
        info.setFont(Font.font("verdana", 14));
        name.setFont(Font.font("verdana", 14));
        name1.setFont(Font.font("verdana", 14));
        show.setFont(Font.font("verdana", 14));
        remove.setFont(Font.font("verdana", 14));
        Button logout = new Button("Logout");
        ChoiceBox<String> fromto=new ChoiceBox<>();
        fromto.getItems().addAll("Alexandria-cairo","Dahab-Luxor","Cairo-Sudan");
        fromto.setValue("Alexandria-cairo");
        
        
        Group grid = new Group();
        Rectangle rect1 = new Rectangle(10, 10,580 , 380);
        rect1.setFill(Color.WHITE);
        rect1.setArcHeight(17);
        rect1.setArcWidth(17);
        rect1.setStroke(Color.WHITE);
        name.setFill(Color.WHITE);
        name1.setFill(Color.WHITE);
        id.setFill(Color.WHITE);
        id1.setFill(Color.WHITE);
        save.setFont(Font.font("verdana", 14));
        show.setStyle("-fx-background-color:LIGHTBLUE");
        save.setStyle("-fx-background-color:LIGHTBLUE");
        remove.setStyle("-fx-background-color:LIGHTBLUE");
        info.setStyle("-fx-background-color:LIGHTBLUE");
        Rectangle rect2 = new Rectangle(25, 20, 550, 100);
        rect2.setFill(Color.LIGHTBLUE);
        rect2.setArcHeight(17);
        rect2.setArcWidth(17);
     //   events.getItems().add("CAI-ALEX 22 March");
       // events.getItems().add("sharm-ALEX 10 March");
        //events.getItems().add("CAI-KSA 5 March");
        logout.setFont(Font.font("verdana", 13));
        logout.setTextFill(Color.web("LIGHTBLUE"));
        logout.setStyle("-fx-background-color: white");
        events.setStyle("-fx-background-color:LIGHTBLUE");
        
        
        grid.getChildren().add(rect1);
        grid.getChildren().add(rect2);
        grid.getChildren().add(events);
        grid.getChildren().addAll(mv);
        grid.getChildren().add(name);
        grid.getChildren().add(name1);
        grid.getChildren().add(id);
        grid.getChildren().add(id1);
        grid.getChildren().add(show);
        grid.getChildren().add(save);
        grid.getChildren().add(remove);
        grid.getChildren().add(remove1);
        grid.getChildren().add(idDriver);
//        grid.getChildren().add(dest);
        grid.getChildren().add(info);
        grid.getChildren().add(logout);
        grid.getChildren().add(fromto);
        
       
        name.setLayoutX(110);
        name.setLayoutY(40);
        name1.setLayoutX(225);
        name1.setLayoutY(40);
        id.setLayoutX(110);
        id.setLayoutY(70);
        id1.setLayoutX(140);
        id1.setLayoutY(70);
        mv.setLayoutX(35);
        mv.setLayoutY(30);
        show.setLayoutX(25);
        show.setLayoutY(200);
        save.setLayoutX(25);
        save.setLayoutY(170);
        remove.setLayoutX(25);
        remove.setLayoutY(250);
        remove1.setLayoutX(25);
        remove1.setLayoutY(290);
        info.setLayoutX(25);
        info.setLayoutY(130);
        events.setLayoutX(300);
        events.setLayoutY(130);
        events.setPrefSize(250, 250);
        logout.setLayoutX(400);
        logout.setLayoutY(50);
//        dest.setLayoutX(50);
//        dest.setLayoutY(100);
         fromto.setLayoutX(110);
        fromto.setLayoutY(135);
        idDriver.setLayoutX(110);
        idDriver.setLayoutY(165);
        
        
        
         
         setScene(new Scene(grid, 600, 400, Color.LIGHTBLUE));
  
       logout.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
                getStage().setScene(getLogin().getScene());
            }
        });
       show.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
                int i ;
                events.getItems().removeAll(getArr());
               for(i=0;i<getArr().getTriplist().size();i++){
                 events.getItems().add(getArr().getTriplist().get(i).getFromto() /*+ "-" +arr.triplist.get(i).To*/ );
               //  events.getItems().add(logic.getTripslist().get(i).dest);
               }
           //    events.getItems().removeAll();
               
               
            }
        });
        remove.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
                
                int i ;
               for(i=0;i<getArr().getTriplist().size();i++){
                     if(remove1.getText().equals(getArr().getTriplist().get(i).getFromto())){
    
                   arr.getTriplist().get(i).setSeat(0);
                   
                   //events.
                }
                if(remove1.getText().equals(getArr().getTriplist().get(i).getFromto())){
    
                        getArr().getTriplist().remove(i);
                  
                   
                   //events.
                }
                 
               }
               
            }
        });
         save.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
           
                getFile1().savetofile2();
        
            } 
        });
          info.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
           int i=0;
                 setDriverId(idDriver.getText());
           fromto.getValue();
          for(i=0;i<getArr().getTriplist().size();i++){
              if(fromto.getValue().equals(getArr().getTriplist().get(i).getFromto())){
                  arr.getTriplist().get(i).setDriverId(getDriverId());
      
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

    public void setLogin(LoginForm login) {
        this.login = login;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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
     * @return the fp
     */
    public ReadFile getFp() {
        return fp;
    }

    /**
     * @param fp the fp to set
     */
    public void setFp(ReadFile fp) {
        this.fp = fp;
    }

    /**
     * @return the file1
     */
    public SaveFile getFile1() {
        return file1;
    }

    /**
     * @param file1 the file1 to set
     */
    public void setFile1(SaveFile file1) {
        this.file1 = file1;
    }

    /**
     * @return the f
     */
    public File getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(File f) {
        this.f = f;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }

    /**
     * @return the arr
     */
    public Arraylists getArr() {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(Arraylists arr) {
        this.arr = arr;
    }

    
    
    
}
