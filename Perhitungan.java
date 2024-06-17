/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundryapplication;

/**
 *
 * @author WINDOWS10
 */
public class Perhitungan {
    public double jmlh,hrg,tb,sb,dp,berat;
     
    public void setBerat(double berat){
        this.berat=berat;
    }
    public double getBerat(){
        return berat;
    }  
        
    public void setHrg(double hrg){
        this.hrg=hrg;
    }
    public double getHrg(){
        return hrg;
    }
    
    public void setTb(double tb){
        this.tb=tb;
    }
    public double getTb(){
        tb=hrg*berat;
        return tb;
    }
    
     public void setDp(double dp){
        this.dp=dp;
    }
    public double getDp(){
        return dp;
    }
    
    
    public void setSb(double sb){
        this.sb=sb;
    }
    public double getSb(){
        sb=tb-dp;
        return sb;
    }
    
   
    
 }



