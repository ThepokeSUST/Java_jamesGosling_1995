

public class string{
      
    public static void main(String arg[]){
       
      //..........................................IMMUTABLE..........................................................  
        //String class are immutable......
        // its mean string are constant......
        String name= new String("Dipok");
        System.out.println(name.length());
        System.out.println(name);
        System.out.println(name+ " Nath");
        System.out.println(name.charAt(2));
        
        //this means construct another object then point it by name reference......
        name= name.concat(" Nath");
        System.out.println(name);

        String s1="dipu";
        String s2="dipu";
        //s1 and s2 are pointing the same object......
        System.out.println(s1==s2);

      //..................................MUTABLE............................................. 
      StringBuffer sb= new StringBuffer();
      System.out.println(sb.capacity());
      StringBuffer sbb= new StringBuffer("dipok");
      System.out.println(sbb.capacity());
      System.out.println(sbb.length());  
      sbb.append(" Nath");
      System.out.println(sbb);
      String str;
      //str=sbb; this is wrong
      //str=(String) sbb;  this is also wrong
      str= sbb.toString();
      System.out.println(str);

      sbb.deleteCharAt(5);
      System.out.println(sbb);
      System.out.println(sbb.length());
      sbb.delete(2, 5);
      System.out.println(sbb);

      sbb.insert(2,"pok ");
      System.out.println(sbb);

    }
}