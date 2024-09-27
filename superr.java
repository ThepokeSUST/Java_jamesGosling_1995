
class A{

    A(){
        super();
        System.out.println("in A default");
    }

    A(int a,int b){
        super();
       System.out.println("in A int a int b");
    }
}
class B extends A 
{
     
    B(){
        super(3,4);
        System.out.println("in B default");
    }
    B(int a,int b){
        super(3,4);
        System.out.println("int B int a int b");
    }

}

public class superr {
    
    public static void main(String arg[]){
         
        B a= new B();
    }
}
