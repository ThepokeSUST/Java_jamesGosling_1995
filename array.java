

public class array{
   
    public static void main(String srg[]){
          
        //int arr[8]; this is wrong

        int arr[]= {1,2,3,4,5}; //this is possible only when you know the elements...
        for(int i=0;i<5;i++) System.out.println(arr[i]);
        
        //now if you don't know the elements
        // in this case you must allocate dynamially

        int brr[]= new int[10]; //automatically initialize with zero......
        for(int i=0;i<10;i++) System.out.print(brr[i]+" "); 
         

        //int *crr= new int[10];
        //this will work on cpp but in java there is no such a token

    }
    
}