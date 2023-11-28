
package arraylist;

import java.util.ArrayList;


public class Arraylist {

  
    public static void main(String[] args) {
        /*
        ArrayList<String> food =new ArrayList <String>();
        food.add("pizza");
        food.add("burger");
        food.add("hotdog");
        
        
        food.set(0,"sushi");
        food.remove(2);
        food.clear();
        
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
            
        }
*/
        //2d arraylist 
        
        ArrayList<ArrayList<String>> groceryyList = new ArrayList();
        
        ArrayList<String> bakeryList = new ArrayList();
        
        bakeryList.add("simit");
        bakeryList.add("acma");
        bakeryList.add("borek");
        
        
        System.out.println(bakeryList.get(1));
        
        
        ArrayList<String> drinksList = new ArrayList();
        
        drinksList.add("coca cola");
        drinksList.add("pepsi");
        drinksList.add("7up");
        
        System.out.println(drinksList.get(0)); 
        
        
        groceryyList.add(bakeryList);
        groceryyList.add(drinksList);
        System.out.println(groceryyList);
        System.out.println(groceryyList.get(0));
        
    }
    
}
