package busstation1;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scs
 */
public interface admin {



public void addinArraylist(String name,String id,String cartype,String job);

public void addinArraylist2(String x,String vehicle,String destination,String fromto,String stops,String typeofticket,int seat,float price,String driverId);

public void settrip(String x,String vehicles,String destination,String fromto,String stops,String typeofticket);
}

