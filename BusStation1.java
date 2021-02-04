/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import java.io.File;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author scs
 */
public class BusStation1 extends Application {
    //Scene scene;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
    
    
        File f1=new File("persons.txt");
        File f2=new File("trips.txt");
        File f3=new File("customer.txt");
        ReadFile fp=new ReadFile();
       
        vehicle vehicle=new vehicle();
	//vehicle minibus=new vehicle();
	//vehicle limo=new vehicle();
        
       // Arraylists array=new Arraylists();
      Arraylists arrayofcust=new Arraylists(vehicle/*, minibus, limo*/);
       
        fp.openInReading1(f1,arrayofcust);
        fp.openInReading2(f2,arrayofcust);
        fp.openInReading3(f3,arrayofcust);
        Arraylists array=new Arraylists(vehicle/*, minibus, limo*/);
         //vehicle v1=new vehicle(array);
        // vehicle.display(); 
        
        SaveFile file1=new SaveFile(arrayofcust);
      //  file1.savetofile(l);
        arrayofcust.displayArraylist();
//        array.displayArraylist1();
       // arrayofcust.a
        FirstPage pick1 =new FirstPage(primaryStage);
        Employee1 employee1 = new Employee1(primaryStage);
      //  LoginForm passenger= new LoginForm(primaryStage);
        //LoginForm manager = new LoginForm(primaryStage,employee1,array);
        LoginForm loginForm =new LoginForm(primaryStage,employee1,arrayofcust);
        custLogin passenger=new custLogin(primaryStage, arrayofcust);
        DriverProfile DRIVEprofile = new DriverProfile(primaryStage,loginForm,arrayofcust);
        ManagerProfile Managerprofile;
        Managerprofile = new ManagerProfile(primaryStage,arrayofcust,file1);
        CustomerPick cpick;
        cpick = new CustomerPick(primaryStage,arrayofcust,file1,passenger);
        Reservation reservation=new Reservation(primaryStage,arrayofcust,vehicle,vehicle,vehicle,passenger,file1);
        Arraylists res= new Arraylists(reservation,Managerprofile);
        viewcustomer views= new viewcustomer(primaryStage,arrayofcust);
        
        
        pick1.preparescene();
        cpick.preparescene();
        passenger.preparescene();
        employee1.preparescene();
        loginForm.preparescene();
        loginForm.preparescene();
        loginForm.preparescene();
        views.preparescene();
        reservation.preparescene();
        DRIVEprofile.preparescene();
        Managerprofile.preparescene();
        
        
        
        pick1.setEmployee1(employee1);
        pick1.setPassenger(passenger);
        passenger.setCpick(cpick);
        employee1.setLogin(loginForm);
        employee1.setLogin2(loginForm);
        loginForm.setProfile(DRIVEprofile);
        loginForm.setManagerPro(Managerprofile);
        loginForm.setCpick(cpick);
        cpick.setViews(views);
        views.setCpick(cpick);
        reservation.setCpick(cpick);
        cpick.setReservation(reservation);
        Managerprofile.setLogin(loginForm);
        
        
        
        primaryStage.setTitle("bus station");
        primaryStage.setScene(pick1.getScene());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
