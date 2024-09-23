 
 class calculator{
      
    public int addTwo(int num1,int num2){
        return num1+num2;
    }
    public int addThree(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public double addTwo(double num1,double num2){
        return num1+num2;
    }
    public double addThree(double num1,double num2,double num3){
        return num1+num2+num3;
    }
 }

public class methodOverloading {
       

    public static void main(String arg[]){
            
      int num1=7;
      int num2=4;
      double num3=323.2;
      double num4=567;
      calculator cal= new calculator();
      System.out.println(cal.addTwo(num1, num2));
      System.out.println(cal.addTwo(num3, num4));
    }
}
