
class Human{

    int age;

   public String name;
   //public: this varibale will be accessable 
   //within class ,subclass,within
    String home;
    private int pass;
    //this variable is only accessable within same class......
    //
    void setpass(int pass){
      this.pass=pass;
    }
    void display(int pass){
        if(this.pass==pass){
            System.out.println(name+" "+home);
        }
        else{
            System.out.println(name+" "+age+" "+home+" "+age);
        }
    }

}

public class encapsulation {
      public static void main(String arg[]){

      }
}
