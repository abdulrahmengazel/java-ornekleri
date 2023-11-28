
public class OveLloadedMothed {
    
    public static void main(String[] args) {
        
        add(1, 10);
        add(0, 0, 0);
        add(0, 0, 0, 0);
        add(0.1, 0.2);
        add(0.1, 0.2, 0.3);
        add(0.1, 0.2, 0.3, 0.4);
    }
    static  int add(int a,int b){
        System.out.println("this is over loaded method 1");
        return a+b;
        
    }
     static  int add(int a,int b,int c){
         System.out.println("this is over loaded method 2");
        return a+b;
        
    }
      static  int add(int a,int b,int c,int d){
        System.out.println("this is over loaded method 3");
        return a+b;
    
    
}
   static  double add(double a,double b){
        System.out.println("this is over loaded method 4");
        return a+b;
        
    }
     static  double add(double a,double b,double c){
         System.out.println("this is over loaded method 5");
        return a+b;
        
    }
      static  double add(double a,double b,double c,double d){
        System.out.println("this is over loaded method 6");
        return a+b;    
    }
}
