package com.mycompany.oopinjava;
import java.util.Random;


public class DiceRoller {
 //Random random;
 //int number;
 
    DiceRoller() {
       Random random=new Random();
       int number=0;
        roll(random,number);
        //or
       // roll();
  }
    void roll(Random random,int number){ 
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
}
