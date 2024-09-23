public class multiDImensionalArray {
      
    public static void main(String arg[]){
          
       int arr[][] = new int[4][3];
        
       for(int i=0;i<4;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
           // arr[i][j]= (int) Math.random()*10000;
        }
        System.out.println();
       }

       //for random value
       for(int i=0;i<4;i++){
        for(int j=0;j<3;j++) 
          arr[i][j]= (int)(Math.random()*100);
       }
   System.out.println();
     
   //print using enhanced for loop
   //int ele[] should work
     for(int[] ele: arr){
          for(int eleele: ele){
            System.out.print(eleele+" ");
          }
          System.out.println();
     }
  System.out.println();
     //jagged array
     int brr[][]= new int[4][];
     brr[0] = new int[3];
     brr[1] = new int[2];
     brr[2]= new int[1];
     brr[3]= new int[8];
   
     for(int i=0;i<brr.length;i++){
           for(int j=0;j<brr[i].length;j++){
            System.out.print( brr[i][j] +" ");
           }
           System.out.println();
     }
    }
}
