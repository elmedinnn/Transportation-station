/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scs
 */
public class OpenColseFile {
    private Formatter x;
     public void openfile(){
     
        try {
            x=new Formatter("persons.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenColseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
     
     public void closefile(){
     
        x.close();
     
     }
     private Formatter y;
     public void openfile2(){
       //  File f=new File("");
        try {
            y=new Formatter("trips.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OpenColseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
     
     public void closefile2(){
     
        y.close();
     
     }
}
