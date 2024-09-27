class A{
    void show(){
          
        System.out.println("this is A");
    }


    
}

class B extends A{
    //overloading
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
           System.out.println(a+b+c);
    }
    void show(){
        System.out.println("this is B");
    }
}

public class methoOverRiding {
       
    public static void  main(String arg[]){
       B n= new B();
       n.add(2, 3);
       n.add(1, 2, 3);
       n.show();
       A m= new A();
       m.show();
    }
}
