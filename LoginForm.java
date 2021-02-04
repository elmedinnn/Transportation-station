/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import static java.sql.JDBCType.NULL;
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

public class LoginForm {
	
	private Stage stage;
	private Scene scene;
	private FirstPage pick;
        private Employee1 emp;
        private LoginForm login;
        private DriverProfile profile;
        private ManagerProfile managerPro;
        private Arraylists arr1;
        private Arraylists arrayofcust;
        private String ID;
    private String name;
    private CustomerPick cpick;
       
	public LoginForm (Stage stage , Employee1 emp,Arraylists arr1) {
		
		this.stage=stage;
                this.emp=emp;
                this.arr1=arr1;
              //  this.arrayofcust=arrayofcust;
                
	}
        public LoginForm (Stage stage ) {
		
		this.stage=stage;
               // this.emp=emp;
                
                
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
        //    private LoginForm login;
            int i=0;
            @Override
            public void handle(ActionEvent event) {
           if(  getEmp().getChecker().equals("manager")){
            
               if((Pass.getText().equals(String.valueOf(getArr1().getPersonlist().get(0).getId())))&&(Namee.getText().equals(String.valueOf(getArr1().getPersonlist().get(0).getName())))){
                        getStage().setScene(getManagerPro().getScene());
               }else{
               
               output.setText("wrong username or password");
               }
              
           }else if(getEmp().getChecker().equals("driver")) {
               for(i=1;i<getArr1().getPersonlist().size();i++){
               if((Pass.getText().equals(String.valueOf(getArr1().getPersonlist().get(i).getId())))&&(Namee.getText().equals(String.valueOf(getArr1().getPersonlist().get(i).getName())))){
                            setID(Pass.getText());
                            setName(Namee.getText());
                            getStage().setScene(getProfile().getScene());
                   break;
               }else{
               //to do label here//
                   output.setText("wrong username or password");
              
               }
              }
               
                             
            
           }else{
           System.out.println("errorr");
           }
            }
        });
    
    
}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Employee1 getEmp() {
        return emp;
    }

    public void setEmp(Employee1 emp) {
        this.emp = emp;
    }

    public LoginForm getLogin() {
        return login;
    }

    public void setLogin(LoginForm login) {
        this.login = login;
    }

    public DriverProfile getProfile() {
        return profile;
    }

    public void setProfile(DriverProfile profile) {
        this.profile = profile;
    }

    public void setManagerPro(ManagerProfile managerPro) {
        this.managerPro = managerPro;
    }

    void setCpick(CustomerPick cpick) {
        this.cpick=cpick;
    }

    /**
     * @return the pick
     */
    public FirstPage getPick() {
        return pick;
    }

    /**
     * @return the managerPro
     */
    public ManagerProfile getManagerPro() {
        return managerPro;
    }

    /**
     * @return the arr1
     */
    public Arraylists getArr1() {
        return arr1;
    }

    /**
     * @param arr1 the arr1 to set
     */
    public void setArr1(Arraylists arr1) {
        this.arr1 = arr1;
    }

    /**
     * @return the arrayofcust
     */
    public Arraylists getArrayofcust() {
        return arrayofcust;
    }

    /**
     * @param arrayofcust the arrayofcust to set
     */
    public void setArrayofcust(Arraylists arrayofcust) {
        this.arrayofcust = arrayofcust;
    }

    /**
     * @return the cpick
     */
    public CustomerPick getCpick() {
        return cpick;
    }

   
}
