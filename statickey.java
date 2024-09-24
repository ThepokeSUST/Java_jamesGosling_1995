
class mobile{
          
    public  String brand;
    public  int prise;
    public static String name;
    //if you want to initialize static variable within class 
    //than we have static block
    //this static block will be called only onetime......
    //because the class will load only one time in JVM......
    /*
      static{
       name= "smartphone"
      }
     */

     public void display(){
        //in nonstatic method you can use static variable
         System.out.println(brand + " " + prise + " " + name);
     }
     public  static void display1(){
            
        System.out.println("in static method ");
        //this will provide error because in static method you can't use non static instance varibale......
        // System.out.println(brand);
        System.out.println(name);
     }
 }  

public class statickey {

   
    public static void main(String arg[]){
            
       // Class.forName("mobile");
       //for load the class before create objects......
        mobile.display1();
        mobile one= new mobile();
        one.brand= "apple";
        one.prise=34000;
        //this is not the proper way to access the static varibale....
        //one.name="smartphone";
        mobile.name= "smartphone"; //this is the proper way......

        mobile two= new mobile();
        two.brand="VIVO";
        two.prise=13000;
        
        one.display();
        two.display();

        mobile.display1();

    }
}
