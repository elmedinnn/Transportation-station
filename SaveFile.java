/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author scs
 */
public class SaveFile {
  
    private FileWriter fp1;
    private Arraylists array;
    private Arraylists array2;
    private Driver driver;
    private int i=0;
    
    public SaveFile(Arraylists array){
    this.array2=array;
    
    }
      public void OpenFileInWritingMode(Arraylists array){
          
    try{
        BufferedWriter write=new BufferedWriter(new FileWriter("persons.txt",true));
        for(setI(0);getI()<array.getPersonlist().size();setI(getI() + 1))
        {
        write.write(array.getPersonlist().get(getI()).getName() + "\t");
        write.write(array.getPersonlist().get(getI()).getId() + "\t");
        write.write(array.getPersonlist().get(getI()).getCarType()+ "\t");
        write.write(array.getPersonlist().get(getI()).getJob()+ "\t");
        write.newLine();
       
        
        
        }
        write.close();
    
    }catch(Exception e){
    
        System.out.println("error");
    }
    } public void savetofile(){
         // this.array=array;
    try{
        BufferedWriter write=new BufferedWriter(new FileWriter("persons.txt"));
        for(setI(0);getI()<getArray().getPersonlist().size();setI(getI() + 1))
        {
        write.write(getArray().getPersonlist().get(getI()).getName() + "\t");
        write.write(getArray().getPersonlist().get(getI()).getId() + "\t");
        write.write(getArray().getPersonlist().get(getI()).getCarType()+ "\t");
        write.write(getArray().getPersonlist().get(getI()).getJob()+ "\t");
        write.newLine();
       
        
        
        }
        write.close();
    
    }catch(Exception e){
    
        System.out.println("error");
    }
    }
       public void OpenFileInWritingMode2(Arraylists array) throws IOException{
           this.setArray2(array);
    try{
        BufferedWriter write=new BufferedWriter(new FileWriter("trips.txt",true));
     //   for(i=0;i<array.getPersonlist().size();i++)
      //  {
      
	       
      //  }
      //  i=0;
        write.close();
    
    }catch(FileNotFoundException ex){
    
        System.out.println("error");
    }
    }
      public void savetofile2(){
	          
	    try{
	        BufferedWriter write=new BufferedWriter(new FileWriter("trips.txt"));
//                System.out.println(array2.triplist.get(0).name);
	        for(setI(0);getI()<getArray2().getTriplist().size();setI(getI() + 1))
	        {
	        write.write(getArray2().getTriplist().get(getI()).getName() + "\t");
	        write.write(getArray2().getTriplist().get(getI()).getCartype() + "\t");
	        write.write(getArray2().getTriplist().get(getI()).getDestination() + "\t");
	        write.write(getArray2().getTriplist().get(getI()).getFromto() + "\t");
	        //write.write(array2.triplist.get(i).To + "\t");
	        write.write(getArray2().getTriplist().get(getI()).getStops() + "\t");
	        write.write(getArray2().getTriplist().get(getI()).getTypeofticket() + "\t");
	        write.write(getArray2().getTriplist().get(getI()).getSeat() + "\t");
	        write.write(getArray2().getTriplist().get(getI()).getPrice() + "\t");
                write.write(getArray2().getTriplist().get(getI()).getDriverId() + "\t");
	        write.newLine();
	        
	        
	        }
	        write.close();
	    
	    }catch(IOException e){
	    
	        System.out.println("error");
	    }
      }
        public void savetofile3(Arraylists array){
	         // this.array2=array;
	    try{
	        BufferedWriter write=new BufferedWriter(new FileWriter("customer.txt"));
                 System.out.print(getArray2().getTriplist().get(getI()).getName());
	        for(setI(0);getI()<getArray2().getCustomerlist().size();setI(getI() + 1))
	        {
                   
	        write.write(getArray2().getCustomerlist().get(getI()).getName() + "\t");
	        write.write(getArray2().getCustomerlist().get(getI()).getId()+ "\t");
	        
	        write.newLine();
	        
	        
	        }
	        write.close();
	    
	    }catch(Exception e){
	    
	        System.out.println("error");
	    }
	    }
    
 

    public Arraylists getArray() {
        return getArray2();
    }

    public void setArray(Arraylists array) {
        this.setArray2(array);
    }

    /**
     * @return the fp1
     */
    public FileWriter getFp1() {
        return fp1;
    }

    /**
     * @param fp1 the fp1 to set
     */
    public void setFp1(FileWriter fp1) {
        this.fp1 = fp1;
    }

    /**
     * @return the array2
     */
    public Arraylists getArray2() {
        return array2;
    }

    /**
     * @param array2 the array2 to set
     */
    public void setArray2(Arraylists array2) {
        this.array2 = array2;
    }

    /**
     * @return the driver
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
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
