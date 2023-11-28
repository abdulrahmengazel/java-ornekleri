/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account;

/**
 *
 * @author lenovo
 */
public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    
    private String email;
    
    private String telefon;
    
    
    
    
    
    public Account(String isim,String email,String telefon){
        
        /*
        this.isim=isim;
        this.email=email;
        this.telefon=telefon;
        
        this.bakiye=0.0;
        this.hesapNo="Bilgi Yok";
        */
        this("Bilgi Yok",0.0,isim,email,telefon);
    }
    
    public Account(){
       /* 
        this.hesapNo="Bilgi yok";
        this.bakiye=0.0;
        this.isim="Bilgi Yok";
        this.email="Bilgi Yok";
        this.telefon="Bilgi Yok";
        */
       this("Bilgi Yok",0.0,"Bilgi Yok","Bilgi Yok,","Bilgi Yok");
        
        //System.out.println("kendi yazdigimiz constructor");
        
    }
    
    public Account(String hesapNo ,double bakiye,String isim,String email,String telefon){
    
     this.hesapNo=hesapNo;
     this.bakiye=bakiye;
     this.email=email;
     this.isim=isim;
     this.telefon=telefon;
        
    }
    
    
    
    
    
    public void bilgielerigoster(){
        System.out.println("Hesab NO : "+hesapNo+" Bakiye : "+bakiye+" Email :"+email+" isim"+isim+"  telefon : "+telefon);
    }
    
    public void paraYtair(double miktar){
        bakiye+=miktar;
        System.out.println("yeni bakiye : "+bakiye);
        
    } 
    
    public void paracekme(double miktar){
        
        if(miktar>bakiye){
             System.out.println("yeterli bakiye yok , Bakiye : " +bakiye );
             
        }
        
        else  {
                 bakiye-=miktar;
                System.out.println("yeni Bakiye = "+bakiye);
                }
        
    }
    

    
    
    
    public String getHesapNo() {
        return hesapNo;
    }

    
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
    

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
    public double getBakiye() {
        return bakiye;
    }
    
    
    public String getIsim() {
        return isim;
    }

    
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getTelefon() {
        return telefon;
    }

    
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
    
    
}