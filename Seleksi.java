/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundryapplication;

import java.sql.Date;

/**
 *
 * @author WINDOWS10
 */
public class Seleksi extends Perhitungan {
    public int cb,chekbox;
    public int service,rd1,rd2,nb,tglSelesai;
    public String hasil,harga;
    public Date tglTerima;
    
    public int getService(){
        return service;
    }
    public void setService(int service){
        this.service = service;
    }
    public int getCb(){
       return cb;
    }
    public void setCb(int cb){
        switch (cb) {
            case 0 -> this.hrg = 4000;
            case 1 -> this.hrg = 2500;
            case 2 -> this.hrg = 2000;
        }
        this.cb = cb;
    }
      
    public void setSeleksiService()
    {
     if(service == 0){
         
     }
    } 
    public void setSeleksiBarang(){
          
      }  
    public void setseleksichekbox( int chekbox){
       this.chekbox=chekbox; 
    }
    public int getseleksichekbox(){
        return 0;
    }
    
    public void setNb(int nb){
        
        this.nb=nb;
    }
    public int getNb(){
        return nb;
    }
    
    public void setProses(String harga ){
        this.harga=harga;
    }
    public String getProses(){
        if(getService() == 2){//Express
            hrg = 0;
            if(getNb() == 1){//Pakaian
                setCb(getCb());
                this.tglSelesai = 1;
            }else if (getNb() == 2){//Selimut
                this.harga=Double.toString(hrg=12000);
                this.tglSelesai = 3;
            }else if (getNb()== 3){//bed cover
                this.harga=Double.toString(hrg=15000);
                this.tglSelesai = 3;
            }
            this.harga=Double.toString(hrg * 2);
//            this.tb=getBerat()*hrg;
        }else if(getService() == 1){//Reguler
            if(getNb() == 1){//Pakaian
                if(getCb()== 0){//cs
                    this.tglSelesai = 3;
                }else if(getCb()== 1){//cuci
                    this.tglSelesai = 2;
                }else{//setrika
                    this.tglSelesai = 1;
                }
                setCb(getCb());
                this.harga=Double.toString(hrg);
//                this.tb=getBerat()*hrg;
            }else if (getNb() == 2){//Selimut
                this.harga=Double.toString(hrg=12000);
                this.tglSelesai = 5;
//                this.tb=getBerat()*hrg;
            }else if (getNb()== 3){//bed cover
                this.harga=Double.toString(hrg=15000);
                this.tglSelesai = 5;
//                this.tb=getBerat()*hrg;
            }else{
                this.harga=Double.toString(hrg=0);
            }
        }else{
            if(getCb()== 0){//cs
                this.tglSelesai = 10;
            }else if(getCb()== 1){//cuci
                this.tglSelesai = 5;
            }else{//setrika
                this.tglSelesai = 4;
            }
            setCb(getCb());
            this.harga=Double.toString(hrg);
//            this.tb=getBerat()*hrg;
        }
        return (getBerat() > 0)? Double.toString(hrg * berat ): harga;
    }
    public void setTt(Date tt){
        this.tglTerima=tt;
    }
    public String getTt(){
        return tglTerima.toString();
    }
    public int getTs(){
        return tglSelesai;
    }
}
