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
public class Person {
     private String name;
    private String id;
    private String carType;
     private String job;

    public Person(String name, String id, String carType,String job) {
        this.name = name;
        this.id = id;
        this.carType=carType;
        this.job=job;
    }

    
    public void display(){
    
        System.out.println("name="+getName());
        System.out.println("id="+getId());
        System.out.println("car type="+getCarType());
        System.out.println("job="+getJob());
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
