
package methodinjava;


public class Methodinjava {

    
    public static void main(String[] args) {
        String name = "abdulrahman";
        int age =25;
        
        hello(name,age);
        int x=10,y=20;
        int sum= sum(x, y);
        System.out.println(sum);
    }
 static void  hello(String title,int age){
     System.out.println("hello\t"+title+"\t you are "+age);
 }
 static int sum (int x,int y){
     int sum = x + y ;
     return sum;
 }
    
}
