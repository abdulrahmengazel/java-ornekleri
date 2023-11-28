
package foreachloop;

import java.util.ArrayList;


public class Foreachloop {

    
    public static void main(String[] args) {
       // String[] animals={"cat","dog","rat","bird"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("bird");
        animals.add("rat");
        
        for(String i:animals){
            System.out.println(i);
        }
    }
}
