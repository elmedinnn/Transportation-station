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
public class Driver extends Person{
    
     private String carType;
    private String job;
    public Driver(String name, String id,String carType,String job) {
        super(name, id, carType, job);
      //  this.carType=carType;
       // this.job=job;
    }

    /**
     * @return the carType
     */
    public String getCarType() {
        return carType;
    }

    /**
     * @param carType the carType to set
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public void display(){
        super.display();
        
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }
    
}
