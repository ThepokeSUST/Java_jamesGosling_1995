

public class typecast {
      
      public static void main(String arg[]){
         //byte = 1 byte= 8 bit;
              //minbyte = -128;
              //maxbyte = 127;
          byte by=12;
          //if i wanna store by in int type variable.It will works. Because ,int type>>byte type...
          int a=by;  //This is implicit conversion
          System.out.println(a);
          
          //int = 4 byte = 32 bit
               //minint = -2147483648
               //maxint =  2147483647  
           int in=24;
           //if i wanna store in(variable) in byte type .It will throw error. Because int type>>byte type.
           //byte b=in; this will show (cannot convert from int to byte) ...
           //But i can store in float variable...Because float type == int type(in size)...
           float f=in;
           f=2147483647;
           System.out.println(f);
           
           //now if you store float in int ,it will throw error.
           //so you should explicitly do type cast...

           //int ii=f; this will not work...
           int ii= (int)f;
           System.out.println(ii);
           
           byte mul=30;
           //mul= mul*mul; this will throw error ,because mul*mul become int (this is called type promotion)...
           int intmul= mul*mul;
           System.out.println(intmul);
           
           
         
       
       
      }
}
