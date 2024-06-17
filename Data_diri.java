/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundryapplication;

/**
 *
 * @author WINDOWS10
 */
public class Data_diri {
    Perhitungan hitung = new Perhitungan();
    Seleksi pilihan = new Seleksi();
    public String name,pembayaran,alamat,tt,ts,nohp; 
    
    
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public void setPembayaran(String pembayaran){
        this.pembayaran=pembayaran;
    }
    public String getPembayaran(){
        return pembayaran;
    }
            
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    
    public void setNohp(String nohp){
        this.nohp=nohp;
    }
    public String getNohp(){
        return nohp;
    }
    
    public void setTt(String tt){
        this.tt=tt;
    }
    public String getTt(){
        return tt;
    }
    
    public void setTs(String ts){
        this.ts=ts;
    }
    public String getTs(){
        return ts;
    }
}   
  