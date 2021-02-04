package busstation;

	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.stage.Stage;
	import javafx.scene.layout.GridPane;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
    import javafx.geometry.Pos;
	
	public class GUI extends Application  {
		
		public static void main(String[] args)
		{
			launch(args);
		}
		

		@Override
		public void start(Stage primaryStage) throws Exception {			
			primaryStage.setTitle("Bus Station");
			Pick pick =new Pick(primaryStage);
			//Employee employee =new Employee(primaryStage);
			Passenger passenger =new Passenger (primaryStage);
			pick.setPassenger(passenger);
			//Pick.setEmployee(employee);
			pick.preparescene();
            passenger.preparescene();
           // employee.preparescene();
			primaryStage.setScene(pick.getScene());
			primaryStage.show();
			
		}

}
