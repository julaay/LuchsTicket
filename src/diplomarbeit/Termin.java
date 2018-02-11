/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diplomarbeit;

import java.sql.Time;
import java.util.Date;


/**
 *
 * @author July
 */
public class Termin {
    
    
   String grund=""; 
   Date date; 
   Time time; 
   Date einschreibungsdate;
   String vorname; 
   String nachname; 

    public Termin(Date date, Time time, Date einschreibungsdate, String vorname, String nachname) {
        this.date = date;
        this.time = time;
        this.einschreibungsdate = einschreibungsdate;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
   
   
   

  

    public Date getEinschreibungsdate() {
        return einschreibungsdate;
    }

    public void setEinschreibungsdate(Date einschreibungsdate) {
        this.einschreibungsdate = einschreibungsdate;
    }
   
   

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
   
   
   
   
   
    public Termin(String grund) {
        this.grund=grund; 
    }

    public String getGrund() {
        return grund;
    }

    public void setGrund(String grund) {
        this.grund = grund;
    }

    @Override
    public String toString() {
        return "Termin{" + "grund=" + grund + ", date=" + date + ", time=" + time + ", einschreibungsdate=" + einschreibungsdate + ", vorname=" + vorname + ", nachname=" + nachname + '}';
    }
    
    
   
 
    
}
