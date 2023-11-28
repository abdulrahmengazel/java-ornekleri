package codepro;

import java.util.Scanner;

public class CODEPRO {
    public static void main(String[] args) {
    
        Scanner myscanner = new Scanner (System.in);
        System.out.println("what is your name ?");
        String name = myscanner.nextLine();
        
        System.out.println("how old are you ");
        int old = myscanner.nextInt();
        myscanner.nextLine();
        System.out.println("what is your favorite food ? ");
        String food =myscanner.nextLine();
                
        System.out.println("hello  "+name);
        System.out.println("your old is "+old);
        
    }
 
        
}
