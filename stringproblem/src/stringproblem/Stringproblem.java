
package stringproblem;


public class Stringproblem {

    
    public static void main(String[] args) {
         String name ="a b d u l r a h m a n";
         boolean result =name.equalsIgnoreCase("abdulrahman");
         int len = name.length();
         char chr = name.charAt(3);
         String res =name.toUpperCase();
         String tr = name.trim();
         String retur = name.replace("b", "a");
         
         System.out.println(result);
         System.out.println(len);
         System.out.println(chr);
         System.out.println(res);
         System.out.println(retur);
    }
    
}
