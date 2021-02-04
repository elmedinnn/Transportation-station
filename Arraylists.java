/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

/**
 *
 * @author scs
 */
import java.util.ArrayList;


public class Arraylists implements admin,customer{
	private trip trip;
	private vehicle vehicle;
//	vehicle minibus;
//	vehicle limo; 
    private ArrayList<trip> triplist;
    private float price;
    private String buss;
    private personsss person;
    private ArrayList<personsss>customerlist;
    private LoginForm passenger;
    private String name;
      private ArrayList<Person>personlist;
     private ArrayList<trip>tripslist;
     private Driver driver1;
     private Manager manager1;
     private SaveFile f;
     private String driverId;
     private Reservation res;
     private ManagerProfile driverID;
     private String cartype;
     private int sbus;
     private int smini;

    public Arraylists(Reservation reservation,ManagerProfile driverId) {
      this.res=reservation;
      this.driverID=driverId;
    }
	
	
 public Arraylists(vehicle vehicle/*,vehicle minibus,vehicle limo*/) {
    ArrayList<trip> triplist = new ArrayList<trip>();
    ArrayList<personsss>customerlist=new ArrayList<personsss>(); 
    ArrayList<Person>personlist = null;
      personlist=new ArrayList<Person>(); 
      this.personlist=personlist;
      this.triplist=triplist;
      this.customerlist=customerlist;
      this.vehicle=vehicle;
//	this.minibus=minibus;
//	this.limo=limo;
	
	 }
 
  

	public ArrayList<trip> getTriplist() {
		return triplist;
	}
	
	 public void addinArraylist3(String name,String id){
	      
	        getCustomerlist().add(new personsss(name,id));
	     
	    }
	 public void addinArraylist2(String x,String vehicle,String destination,String fromto,String stops,String typeofticket,int seat,float price,String driverId) {
		
             System.out.println(x+vehicle+ destination+fromto+stops+typeofticket+seat+price);
		 setCartype(vehicle);
		   if(getCartype().equals("Bus")) { 
			   setSbus(getSbus() + 1);
			   System.out.println("\nhena ya marioumaa\n"+getSbus());
    	    	 
		    }
    	     if(getCartype().equals("MiniBus")) { 
    	    	 setSmini(getSmini() + 1);
    	    	 System.out.println("\nhena ya 5araa\n"+getSmini()); 		
    	     }
    	    
			   
    	    	 getTriplist().add(new trip( x,vehicle, destination,fromto, stops,typeofticket,seat,price,driverId));
    	 
	 }
	  
	    public void displayArraylistcustomers(){
	  
         int i;
	        for(i=0;i<getCustomerlist().size();i++){
	            getCustomerlist().get(i).display();
	        }
	    
	    }
         public void addinArraylist(String name,String id,String cartype,String job){
      
        getPersonlist().add(new Driver(name,id, cartype,job));
    
       
    }
     public void displayarraylistcust(){
          int i;
        for(i=0;i<getCustomerlist().size();i++){
            getCustomerlist().get(i).display();
        }
     }
    
    public void displayArraylist(){
        int i;
        for(i=0;i<getPersonlist().size();i++){
            getPersonlist().get(i).display();
        }
    }
	
public void settrip(String x,String vehicles,String destination,String fromto,String stops,String typeofticket) {
// System.out.print(x);
 //System.out.print(vehicles);
	
	 if(vehicles=="Bus") {	
		 //vehicle.vehiclenew(vehicles);
             System.out.println("\thena ya bhema"+getSbus());
                  if(getSbus()<=30) {
	        setSbus(getSbus() + 1);
		 }
                  System.out.println("\t da ");
		 setPrice(price( vehicles,destination,stops,typeofticket));
                     //  ++sbus;
			//   System.out.println("\nhena ya marioumaa\n"+sbus);
//                 for(int i=0;i<personlist.size();i++){
//                     if(personlist.get(i).carType.equals(vehicles)){
//                    driverId = String.valueOf(personlist.get(i).id);
//                     }
//                 }
                 System.out.print(getVehicle().getCartype());
		 
	    getTriplist().add(new trip (x,vehicles,destination,fromto,stops,typeofticket, getSbus(), getPrice(),"no-assigned-drivers"));
			}
	 else if(vehicles=="MiniBus") {
		// vehicle.vehiclenew(vehicles);
             if(getSmini()<=20) {
		    setSmini(getSmini() + 1);
		 }
              //    ++smini;
    	    	// System.out.println("\nhena ya 5araa\n"+getSmini());
    	    	 	
		 setPrice(price( vehicles,destination,stops,typeofticket));
//                  for(int i=0;i<triplist.size();i++){
//                     if(getTriplist().get(i).From.equals(From)&&getTriplist().get(i).To.equals(To)){
//                        smini = getTriplist().get(i).seat;
//                         
//                     }else{
//                     triplist.add(new trip (x,vehicles,destination,From,To,stops,typeofticket,getSmini(),price,"no-assigned-drivers"));
//                 }
                      getTriplist().add(new trip (x,vehicles,destination,fromto,stops,typeofticket, getSmini(), getPrice(),"no-assigned-drivers"));
                  //}
		
	 }
	 else {
		// vehicle.vehiclenew(vehicles);
		 setPrice(price( vehicles,destination,stops,typeofticket));
                 for(int i=0;i<getPersonlist().size();i++){
                     if(getPersonlist().get(i).getCarType().equals("limo")){
                    setDriverId(String.valueOf(getPersonlist().get(i).getId()));
                     }
                }
		 getTriplist().add(new trip (x,vehicles,destination,fromto,stops,typeofticket,1, getPrice(),"no-assigned-drivers"));
	 }
		 
	 
}


public float price(String vehicle,String destination,String stops,String typeofticket) {
	
	if(vehicle=="Bus") {
		setPrice(getPrice() + 30);	
	}
	else if(vehicle=="MiniBus") {
		setPrice(getPrice() + 20);
	}
	else if(vehicle=="Limousine") {
		setPrice(getPrice() + 50);
	}

	if(destination=="External") {
		setPrice(getPrice() + 100);
	}
	else if(destination=="Internal") {
		setPrice(getPrice() + 50);	
	}
	if(stops=="No-Stops") {
		setPrice(getPrice() + 50);
	}
	else if(stops=="One-Stop") {
		setPrice(getPrice() + 30);
	}
	else if(stops=="Two-Stops") {
		setPrice(getPrice() + 20);
	}
	if(typeofticket=="Round-Trip") {
		setPrice(getPrice() + 30);
	}
	else if(typeofticket=="One-Way") {
		setPrice(getPrice() + 50);
	}
	return getPrice();
	
}


public void displayArraylist1(){
    int i;
    for(i=0;i<getTriplist().size();i++){
        getTriplist().get(i).display();     
    }
} 
public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    
       
public boolean check(String cartype) {
   System.out.println(getVehicle().getSeatbus());
 if(cartype=="Bus") {
	 int x;
      x =   getVehicle().getSeatbus();
   
	 if(x<30) 
		 return true;
	 else 
		 return false;
}
 
else if(cartype=="MiniBus") {
		int x=getVehicle().getSeatmini();
		if(x<20)
			return true;
	}	
else if(cartype=="Limousine") {
    
		return true;	

   
}
 return false;

}


public float getPrice() {
	return price;
}

//    public int getSbus() {
//        return sbus;
//    }

//    public void setSbus() {
//        ++sbus;
//    }

 

//    public void setSmini() {
//        ++smini;
//    }
//      public int getSmini() {
//        return smini;
//    }

    public int getSbus() {
        return sbus;
    }

    public void setSbus(int sbus) {
        this.sbus = sbus;
    }

    public int getSmini() {
        return smini;
    }

    public void setSmini(int smini) {
        this.smini = smini;
    }

    /**
     * @return the trip
     */
    public trip getTrip() {
        return trip;
    }

    /**
     * @param trip the trip to set
     */
    public void setTrip(trip trip) {
        this.trip = trip;
    }

    /**
     * @return the vehicle
     */
    public vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @param triplist the triplist to set
     */
    public void setTriplist(ArrayList<trip> triplist) {
        this.triplist = triplist;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the buss
     */
    public String getBuss() {
        return buss;
    }

    /**
     * @param buss the buss to set
     */
    public void setBuss(String buss) {
        this.buss = buss;
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
     * @return the customerlist
     */
    public ArrayList<personsss> getCustomerlist() {
        return customerlist;
    }

    /**
     * @param customerlist the customerlist to set
     */
    public void setCustomerlist(ArrayList<personsss> customerlist) {
        this.customerlist = customerlist;
    }

    /**
     * @return the passenger
     */
    public LoginForm getPassenger() {
        return passenger;
    }

    /**
     * @param passenger the passenger to set
     */
    public void setPassenger(LoginForm passenger) {
        this.passenger = passenger;
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
     * @param personlist the personlist to set
     */
    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }

    /**
     * @return the tripslist
     */
    public ArrayList<trip> getTripslist() {
        return tripslist;
    }

    /**
     * @param tripslist the tripslist to set
     */
    public void setTripslist(ArrayList<trip> tripslist) {
        this.tripslist = tripslist;
    }

    /**
     * @return the driver1
     */
    public Driver getDriver1() {
        return driver1;
    }

    /**
     * @param driver1 the driver1 to set
     */
    public void setDriver1(Driver driver1) {
        this.driver1 = driver1;
    }

    /**
     * @return the manager1
     */
    public Manager getManager1() {
        return manager1;
    }

    /**
     * @param manager1 the manager1 to set
     */
    public void setManager1(Manager manager1) {
        this.manager1 = manager1;
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

    /**
     * @return the driverId
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * @param driverId the driverId to set
     */
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    /**
     * @return the res
     */
    public Reservation getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(Reservation res) {
        this.res = res;
    }

    /**
     * @return the driverID
     */
    public ManagerProfile getDriverID() {
        return driverID;
    }

    /**
     * @param driverID the driverID to set
     */
    public void setDriverID(ManagerProfile driverID) {
        this.driverID = driverID;
    }

    /**
     * @return the cartype
     */
    public String getCartype() {
        return cartype;
    }

    /**
     * @param cartype the cartype to set
     */
    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

   


    


}   
    

