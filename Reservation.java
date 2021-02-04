/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Reservation {

	private Scene scene;
	private Stage stage;
	private custLogin passenger;
	private Arraylists booking;
	private CustomerPick cpick;
	private vehicle bus;
	private vehicle minibus;
	private vehicle limo;
	private personsss person;
	private String name;
	private SaveFile f2;
        private String optionVeh ;
	private String optionDest ;
	private String optionTick ;
	private String optionStop ;
        private String optionfromto;
         private ReadFile fp;
         private File f3;
         private SaveFile f;
         
	//String optionFrom;
	//String optionTo;
        
       
	


    Reservation(Stage primaryStage, Arraylists b, vehicle bus,vehicle minbus,vehicle limo,custLogin loginForm, SaveFile file1) {
                this.stage=primaryStage;
		this.booking=b;
		this.bus=bus;
                this.minibus=minbus;
                this.limo=limo;
		this.passenger=loginForm;
//		this.f3=f2;
//                this.fp=fp; 
                this.f=file1;
    }

public void preparescene() {
	
 Label Reservation =new Label("Reservation");
 Label Des =new Label("Destination:");
 Label Vehicle=new Label("Vehicle:");
 Label Stops=new Label("Number Of Stops:");
 Label Ticket =new Label("Ticket:");
 Button Book = new Button ("Book Ticket!");
 Label Empty =new Label ();
  Button Back=new Button("Back");
 //Label From=new Label("From:");
 Label To=new Label("Choose Trip:");
// TextField from =new TextField ();
 //TextField to =new TextField ();
 
    ChoiceBox<String> Dest=new ChoiceBox<>();
    Dest.getItems().addAll("Internal","External");
    Dest.setValue("Internal");
    ChoiceBox<String> Veh=new ChoiceBox<>();
    Veh.getItems().addAll("Bus","MiniBus","Limousine");
    Veh.setValue("Bus");
    ChoiceBox<String> Stop=new ChoiceBox<>();
    Stop.getItems().addAll("No-Stops","One-Stop","Two-Stops");
    Stop.setValue("No-Stops");
    ChoiceBox<String> tick=new ChoiceBox<>();
    tick.getItems().addAll("Round-Trip","One-Way");
    tick.setValue("Round-Trip");
    ChoiceBox<String> fromto=new ChoiceBox<>();
    fromto.getItems().addAll("Alexandria-cairo","Dahab-Luxor","Cairo-Sudan");
    fromto.setValue("Alexandria-cairo");
    
    
    GridPane root= new GridPane();
    root.add(Reservation, 0, 0);
    root.add(Des, 0, 2);
   // root.add(From, 0, 3);
 // root.add(from, 1, 3);
    root.add(To, 0, 3);
 // root.add(to, 3, 3);
    root.add(fromto,1, 3);
    root.add(Vehicle, 0, 4);
    root.add(Stops, 0, 5);
    root.add(Ticket, 0, 6);
    root.add(Book, 0, 9);
    root.add(Dest, 1, 2);
    root.add(Veh, 1, 4);
    root.add(Stop, 1 , 5);
    root.add(tick, 1, 6);
    root.add(Empty, 0, 13);
    root.add(Back, 3, 9);
    
    
    root.setHgap(12);
 	root.setVgap(12);
 	root.setAlignment(Pos. TOP_CENTER);
 	//from.setPrefWidth(10);
 	//to.setPrefWidth(120);
 	
 	 Book.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				 setOptionVeh(Veh.getValue());
				 setOptionDest(Dest.getValue());
                                 setOptionTick(tick.getValue());
				 setOptionStop (Stop.getValue());
		                // setOptionFrom(from.getText());
				// setOptionTo( to.getText());
                                 setOptionfromto (fromto.getValue());
				
                boolean z=getBooking().check(getOptionVeh());
			if(z==true) {
				System.out.println(getOptionVeh());
                                if(fromto.getValue().equals("Alexandria-cairo")){
                                    if(Veh.getValue().equals("MiniBus")){
                                          getBooking().settrip(getPassenger().getX(),getOptionVeh(), getOptionDest(),getOptionfromto(), getOptionStop(), getOptionTick());
					Empty.setText("Done!");
				    getBooking().setPrice(0);
					getBooking().displayarraylistcust();
                                     //   booking.addinArraylist2(passenger.x,optionVeh, optionDest,optionFrom,optionTo, optionStop, optionTick);
					getF().savetofile2();
                                    }
                                    else
                                        Empty.setText("Sorry you can not book this vehicle with this trip!");
                                }
                               else if(fromto.getValue().equals("Dahab-Luxor")){
                                     if(Veh.getValue().equals("Bus")){
                                                getBooking().settrip(getPassenger().getX(),getOptionVeh(), getOptionDest(),getOptionfromto(), getOptionStop(), getOptionTick());
					Empty.setText("Done!");
				    getBooking().setPrice(0);
					getBooking().displayarraylistcust();
                                     //   booking.addinArraylist2(passenger.x,optionVeh, optionDest,optionFrom,optionTo, optionStop, optionTick);
					getF().savetofile2();
                                    }
                                     else
                                         Empty.setText("Sorry you can not book this vehicle with this trip!");
                                     }
                              else  if(fromto.getValue().equals("Cairo-Sudan")){
                                  if(Veh.getValue().equals("Limousine")){
                                                  getBooking().settrip(getPassenger().getX(),getOptionVeh(), getOptionDest(),getOptionfromto(), getOptionStop(), getOptionTick());
					Empty.setText("Done!");
				    getBooking().setPrice(0);
					getBooking().displayarraylistcust();
                                     //   booking.addinArraylist2(passenger.x,optionVeh, optionDest,optionFrom,optionTo, optionStop, optionTick);
					getF().savetofile2();
                                  }
                                  else 
                                       Empty.setText("Sorry you can not book this vehicle with this trip!");
                              }
                                }
//			  booking.settrip(passenger.getX(),getOptionVeh(), getOptionDest(),getOptionfromto(), getOptionStop(), getOptionTick());
//					Empty.setText("Done!");
//				    booking.price=0;
//					booking.displayarraylistcust();
//                                     //   booking.addinArraylist2(passenger.x,optionVeh, optionDest,optionFrom,optionTo, optionStop, optionTick);
//					f2.savetofile2();
				
                        else{
					Empty.setText("Error!");
         }
			}
		});
       Back.setOnAction(new EventHandler<ActionEvent>() {
        //    private LoginForm login;
            
            @Override
            public void handle(ActionEvent event) {
//                try {
//                    fp.openInReading2(f3,booking);
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
//                }
                getStage().setScene(getCpick().getScene());
                
            }
        });
		    
 	
     root.setStyle("-fx-background-color:LightBlue ");
        setScene(new Scene(root,600,400));
}


public Scene getScene() {
	return scene;
}
public void setScene(Scene scene) {
	this.scene = scene;
}
public Stage getStage() {
	return stage;
}
public void setStage(Stage stage) {
	this.stage = stage;
}
public void setPassenger(custLogin passenger) {
	this.passenger = passenger;
}

    public personsss getPerson() {
        return person;
    }

    public void setPerson(personsss person) {
        this.person = person;
    }

    public String getOptionVeh() {
        return optionVeh;
    }

    public void setOptionVeh(String optionVeh) {
        this.optionVeh = optionVeh;
    }

    public String getOptionDest() {
        return optionDest;
    }

    public void setOptionDest(String optionDest) {
        this.optionDest = optionDest;
    }

    public String getOptionTick() {
        return optionTick;
    }

    public void setOptionTick(String optionTick) {
        this.optionTick = optionTick;
    }

    public String getOptionStop() {
        return optionStop;
    }

    public void setOptionStop(String optionStop) {
        this.optionStop = optionStop;
    }

//    public String getOptionFrom() {
//        return optionFrom;
//    }
//
//    public void setOptionFrom(String optionFrom) {
//        this.optionFrom = optionFrom;
//    }

    public String getOptionfromto() {
        return optionfromto;
    }

    public void setOptionfromto(String optionfromto) {
        this.optionfromto= optionfromto;
    }
public void setCpick(CustomerPick cpick) {
	this.cpick = cpick;
}
public CustomerPick getCpick() {
	return cpick;
}

    /**
     * @return the passenger
     */
    public custLogin getPassenger() {
        return passenger;
    }

    /**
     * @return the booking
     */
    public Arraylists getBooking() {
        return booking;
    }

    /**
     * @param booking the booking to set
     */
    public void setBooking(Arraylists booking) {
        this.booking = booking;
    }

    /**
     * @return the bus
     */
    public vehicle getBus() {
        return bus;
    }

    /**
     * @param bus the bus to set
     */
    public void setBus(vehicle bus) {
        this.bus = bus;
    }

    /**
     * @return the minibus
     */
    public vehicle getMinibus() {
        return minibus;
    }

    /**
     * @param minibus the minibus to set
     */
    public void setMinibus(vehicle minibus) {
        this.minibus = minibus;
    }

    /**
     * @return the limo
     */
    public vehicle getLimo() {
        return limo;
    }

    /**
     * @param limo the limo to set
     */
    public void setLimo(vehicle limo) {
        this.limo = limo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the f2
     */
    public SaveFile getF2() {
        return f2;
    }

    /**
     * @param f2 the f2 to set
     */
    public void setF2(SaveFile f2) {
        this.f2 = f2;
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
     * @return the f3
     */
    public File getF3() {
        return f3;
    }

    /**
     * @param f3 the f3 to set
     */
    public void setF3(File f3) {
        this.f3 = f3;
    }

    /**
     * @return the f
     */
    public SaveFile getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(SaveFile f) {
        this.f = f;
    }



}
