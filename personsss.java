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

public class personsss {

	  private String name;
	    private String id;
	   

	    public personsss(String name, String id) {
	        this.name = name;
	        this.id = id;
	       
	    }
	    public void display(){
	        
	        System.out.println("name="+getName());
	        System.out.println("id="+getId());
	        
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
   
}