/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author scs
 */
public class ReadFile {
    private File fp;
    private Arraylists arr;
    private Arraylists arr1;
    private Arraylists arr2;
    private String line;
    private Driver driver;
    private Person p;
    
    public void openInReading1(File f,Arraylists array) throws FileNotFoundException{
        this.setArr(array);
        //
        Scanner s = new Scanner(f);
            //
            while(s.hasNext()){
                String word,word1,word2,word3;
                word=s.next();
                word1=s.next();
                word2=s.next();
                word3=s.next();
                
                
                getArr().addinArraylist(word,word1,word2,word3);
                
            } 
            s.close();
    
    }
        public void openInReading2(File f,Arraylists array) throws FileNotFoundException{
            this.setArr1(array);
        Scanner s = new Scanner(f) ;
            while(s.hasNext()){
                String word,word1,word2,word3,word4,word7,/*word8,*/word9;
                int word5;
                float word6;
                word=s.next();
                word1=s.next();
                word2=s.next();
//                word7=s.next();
//                word8=s.next();
                word7=s.next();
                word3=s.next();
                word4=s.next();
                word5=s.nextInt();
                word6=s.nextFloat();
                word9=s.next();
                
                
                getArr1().addinArraylist2(word,word1,word2,word7,/*word8,*/word3,word4,word5,word6,word9);
                
            }
        s.close();
    }
       public void openInReading3(File f,Arraylists array) throws FileNotFoundException{
           this.setArr2(array);
        Scanner s = new Scanner(f);
            while(s.hasNext()){
                String word,word1;
                word=s.next();
                word1=s.next();
//                s.nextLine();
                
                getArr2().addinArraylist3(word, word1);
                
            }  
            s.close();
    }

    

    public void setArr(Arraylists arr) {
        this.arr = arr;
    }

    public Arraylists getArr1() {
        return getArr();
    }

    public void setArr1(Arraylists arr1) {
        this.setArr(arr1);
    }

    /**
     * @return the fp
     */
    public File getFp() {
        return fp;
    }

    /**
     * @param fp the fp to set
     */
    public void setFp(File fp) {
        this.fp = fp;
    }

    /**
     * @return the arr
     */
    public Arraylists getArr() {
        return arr;
    }

    /**
     * @return the arr2
     */
    public Arraylists getArr2() {
        return arr2;
    }

    /**
     * @param arr2 the arr2 to set
     */
    public void setArr2(Arraylists arr2) {
        this.arr2 = arr2;
    }

    /**
     * @return the line
     */
    public String getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(String line) {
        this.line = line;
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
     * @return the p
     */
    public Person getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Person p) {
        this.p = p;
    }

    
   
   
  

  
  
   
     
    }
   
    

