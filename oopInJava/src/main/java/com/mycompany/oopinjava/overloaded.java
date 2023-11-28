
package com.mycompany.oopinjava;


public class overloaded {
    String bread;
    String sauce;
    String chesse;
    String toping;
    

     overloaded(String bread,String sauce,String chesse,String toping) {
       this.bread=bread;
       this.chesse=chesse;
       this.sauce=sauce;
       this.toping=toping;
    
    
     }
     overloaded(String bread,String sauce,String chesse) {
       this.bread=bread;
       this.chesse=chesse;
       this.sauce=sauce;
    
     }
     overloaded(String bread,String sauce) {
       this.bread=bread;
       this.sauce=sauce;
    
     }
     overloaded(String bread) {
       this.bread=bread;
     
    
     }
}
