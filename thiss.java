 
 class A{
    A(){
        super();
        System.out.println("default A");
    }
    A(int a){
        super();
      System.out.println("int A");
    }
 }

 class B extends A{
      
    B(){
      
     System.out.println("default B");
    }
    B(int b){
        this();
        System.out.println("ïnt B");
    }
 }

public class thiss {
      
    public static void main(String arg[]){
               
        B n= new B(4);
    }
}
