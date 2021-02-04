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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CustomerPick {
	
	private Stage stage;
	private Scene scene;
	//LoginForm login;
	private Reservation reservation;
	private viewcustomer views;
        private Arraylists arr;
        private SaveFile file1;
        private custLogin login;
	

   public CustomerPick(Stage primaryStage,Arraylists array,SaveFile file1,custLogin login) {
        this.stage=primaryStage;
        this.arr=array;
        this.file1=file1;
        this.login=login;
    }

  public void preparescene(){
        
        Image image = new Image("/busstation1/customerpic.png",80, 80, true, true);
        ImageView mv = new ImageView(image);
        Text dest= new Text();
        Text id= new Text("welcome our favourite customer");
        Text namelabel= new Text();
        Text idlabel= new Text();
        Text Done= new Text();
        Text info= new Text("General information");
        ListView events = new ListView();
        info.setFont(Font.font("verdana", 16));
//        typeCar.setFont(Font.font("verdana", 13));
        Button logout = new Button("Logout");
        Button showtrips = new Button("show you trips");
        Button cancel = new Button("cancel");
        Button save = new Button("save");
        Button Book = new Button("Book your trip");
        ChoiceBox<String> fromto=new ChoiceBox<>();
        fromto.getItems().addAll("Alexandria-cairo","Dahab-Luxor","Cairo-Sudan");
        fromto.setValue(" ");
       
        
        
        Group grid = new Group();
        Rectangle rect1 = new Rectangle(10, 10,580 , 380);
        rect1.setFill(Color.WHITE);
        rect1.setArcHeight(17);
        rect1.setArcWidth(17);
        rect1.setStroke(Color.WHITE);
        showtrips.setStyle("-fx-background-color:LIGHTBLUE");
        cancel.setStyle("-fx-background-color:LIGHTBLUE");
        save.setStyle("-fx-background-color:LIGHTBLUE");
        Book.setStyle("-fx-background-color:LIGHTBLUE");
        dest.setFill(Color.WHITE);
        id.setFill(Color.WHITE);
        idlabel.setFill(Color.WHITE);
        namelabel.setFill(Color.WHITE);
//        typeCar.setFill(Color.LIGHTBLUE);
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
        
        
        grid.getChildren().add(rect1);
        grid.getChildren().add(rect2);
        grid.getChildren().add(events);
        grid.getChildren().addAll(mv);
        grid.getChildren().add(dest);
        grid.getChildren().add(id);
        grid.getChildren().add(namelabel);
        grid.getChildren().add(idlabel);
        grid.getChildren().add(Done);
        grid.getChildren().add(info);
        grid.getChildren().add(logout);
        grid.getChildren().add(showtrips);
        grid.getChildren().add(cancel);
        grid.getChildren().add(save);
        grid.getChildren().add(Book);
        grid.getChildren().add(fromto);
//        grid.getChildren().add(cancelto);
//        grid.getChildren().add(cancelfrom);
        
       
        dest.setLayoutX(50);
        dest.setLayoutY(160);
        id.setLayoutX(175);
        id.setLayoutY(60);
        namelabel.setLayoutX(150);
        namelabel.setLayoutY(40);
        idlabel.setLayoutX(150);
        idlabel.setLayoutY(70);
        mv.setLayoutX(35);
        mv.setLayoutY(35);
        Done.setLayoutX(90);
        Done.setLayoutY(250);
        showtrips.setLayoutX(25);
        showtrips.setLayoutY(160);
        cancel.setLayoutX(25);
        cancel.setLayoutY(200);
        save.setLayoutX(25);
        save.setLayoutY(240);
        Book.setLayoutX(25);
        Book.setLayoutY(280);
        info.setLayoutX(25);
        info.setLayoutY(140);
        events.setLayoutX(300);
        events.setLayoutY(130);
        events.setPrefSize(250, 250);
        logout.setLayoutX(400);
        logout.setLayoutY(50);
        fromto.setLayoutX(90);
        fromto.setLayoutY(200);
//        cancelto.setLayoutX(400);
//        canceltfo.setLayoutY(50);
        
        
        
         
         
	
	
	Book.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			getStage().setScene(getReservation().getScene());
			
		}

	});
	
	
	showtrips.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			//stage.setScene(views.getScene());
            int i;
              for(i=0;i<getArr().getTriplist().size();i++){
              
                if( getArr().getTriplist().get(i).getName().equals(getLogin().getX())){
                
                    events.getItems().add(getArr().getTriplist().get(i).getFromto()+ "-" +getArr().getTriplist().get(i).getCartype());
                
                }else{
               dest.setText("NO TRIPS YET!!");
                }    
              
            }
			
		}

	});
   	cancel.setOnAction(new EventHandler<ActionEvent>() {
	@Override
		public void handle(ActionEvent event) {
      
		                int i ,j;
                                j=0;
		               for(i=0;i<getArr().getTriplist().size();i++){
                                           if(fromto.getValue().equals(getArr().getTriplist().get(i).getFromto())){
                            //    for(j=i;j<arr.triplist.size();j++){
                             //       if(arr.triplist.get(i).name.equals(arr.triplist.get(i+1).name)){
                                       
                             //   } else {
                                        arr.getTriplist().get(i).setSeat(arr.getTriplist().get(i).getSeat() - 1);
                                        // }
                                        // break;
                                           //    }
                              
                   
                   //events.
                }
		                if(        getLogin().getX().equals(getArr().getTriplist().get(i).getName())&&fromto.getValue().equals(getArr().getTriplist().get(i).getFromto())/*&&cancelto.getText().equals(arr.triplist.get(i).To)*/) {
		                    getArr().getTriplist().remove(i);
		                    Done.setText("Done!");
		                }
		                //else 
		                	//Done.setText("Error!");
		                	
		               }
                               
		               
		            }
		        });
       
    save.setOnAction(new EventHandler<ActionEvent>() {
		   
		            @Override
		            public void handle(ActionEvent event) {
		            getFile1().savetofile2 ();
                            
		       
		}

	});
	
        setScene(new Scene(grid, 600, 400, Color.LIGHTBLUE));	
	
			    /*Linear(0%,0%) to (0%,100%) stops(0.0,red) (1.0,black)*/
   // root.setStyle("-fx-background-color:LightBlue ");
   // Book.setStyle("-fx-text-fill:red ");
   // scene =new Scene(root,600,400);
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
//public LoginForm getLogin() {
//	return login;
//}
//public void setLogin(LoginForm login) {
//	this.login = login;
//}
public Reservation getReservation() {
	return reservation;
}
public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}
public viewcustomer getViews() {
	return views;
}
public void setViews(viewcustomer views) {
	this.views = views;
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
     * @return the login
     */
    public custLogin getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(custLogin login) {
        this.login = login;
    }
	
	

}
