/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

public class trip{
    private String destination;
  private String stops;
  private String typeofticket;
  private String cartype;
 // String From;
  //String To;
  private String fromto;
  private int seat;
 private String name;
 private LoginForm passenger;
 private String driverId;
 private float price;
  
  
 public trip( String name,String cartype, String destination,String fromto, String stops,String typeofticket,int seat,float price,String driverID) {
	 this.cartype=cartype;
	 this.destination=destination;
	// this.From=From;
	 //this.To=To;
         this.fromto=fromto;
	 this.stops=stops;
	 this.typeofticket=typeofticket;
	 this.seat=seat;
	 this.name=name;
	 this.price=price;
         this.driverId=driverID;

 }
 

public String getDestination() {
	return destination;
}


public String getStops() {
	return stops;
}


public String getTypeofticket() {
	return typeofticket;
}

 

public void setDestination(String destination) {
	this.destination = destination;
}


public void setStops(String stops) {
	this.stops = stops;
}


public void setTypeofticket(String typeofticket) {
	this.typeofticket = typeofticket;
}

//	public String getFrom() {
//	return From;
//}
//
//
//public void setFrom(String from) {
//	From = from;
//}
//
//
//public String getTo() {
//	return To;
//}
//
//
//public void setTo(String to) {
//	To = to;
//}

    public String getFromto() {
        return fromto;
    }

    public void setFromto(String fromto) {
        this.fromto = fromto;
    }



	public void display(){
	    
	    System.out.println("Name:"+getName()+"   Cartype="+getCartype()+"   dest:"+getDestination()+"   FromTo:"+getFromto()+"   stops:"+getStops()+   "  typeof ticket:"+getTypeofticket()+"    seats:"+getSeat()+"   price:"+getPrice()+" ID:"+getDriverId() );
	  
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

    /**
     * @return the seat
     */
    public int getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(int seat) {
        this.seat = seat;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
	

}
