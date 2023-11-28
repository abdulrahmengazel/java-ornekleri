
package logical;
import java.util.Scanner;


public class Logical {

    
    public static void main(String[] args) {
      // &&= (and) both condition must be true
      // ||= (or) either condition must be true
      // !=(Not) reverses boolean value of condition
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("you are  playing a game  press Q to quit or press c to continue the game ");
        String response=scanner.next();
        
        if(response.equals("q")|| response.equals("Q")){
            
            System.out.println("you quit the game");
        }
        else if(!response.equals("c")&&!response.equals("C")){
            System.out.println("you restart the game");
        }
        else{
            System.out.println("you are still playing the game ");
        }
    }
}
  