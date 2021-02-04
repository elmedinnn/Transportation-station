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



public class vehicle {
	
	private String cartype;
	private int seatmini;
	private int seatbus;
        private Arraylists seat;
        private int i;
	
	
public vehicle(Arraylists arr) {
	
       this.seat=arr;
}
public vehicle () {
	
}
 public void vehiclenew(String cartype) {
	
	 if(cartype=="Bus") { 
		 if(getSeatbus()<=30) {
	        setSeatbus(getSeatbus() + 1);
		 }
	 }
	 else if(cartype=="MiniBus") {
		if(getSeatmini()<=20) {
		    setSeatmini(getSeatmini() + 1);
		 }
	 }	
	 else 
             this.setCartype(cartype);
 }
 
public String getCartype() {
	return cartype;
}

public int getSeatmini() {
	return seatmini;
}

public int getSeatbus() {
	return seatbus;
}

public void setCartype(String cartype) {
	this.cartype = cartype;
}


public void setSeatmini(int seatmini) {
	this.seatmini = seatmini;
}

public void setSeatbus(int seatbus) {
	this.seatbus=seatbus;
}

public void display(){
   // for()
    System.out.println("\tseats="+getSeat().getTriplist().get(0).getSeat());
  
}

    /**
     * @return the seat
     */
    public Arraylists getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(Arraylists seat) {
        this.seat = seat;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

}

