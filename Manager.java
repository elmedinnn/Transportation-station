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
public class Manager extends Person{
        private String job;
    public Manager(String name, String id,String carType,String job) {
        super(name, id, carType, job);
        
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
    public void display(){
        super.display();
        
    }
    
}
