public class updatedSwitch {

    public static void main(String arg[]){
         
        String str="monday";
        String res="";

         switch(str){
               
            case "saturday","firday"->
                   System.out.println("11 am");
                 //  System.out.println("alarm");
            case "sunday","monday","tuesday"->
                  System.out.println("8 am");
                  //System.out.println(alarm);
            //case "wednesday","thursday":
            default->
                  System.out.println("7 am");

         }
         //as expression
         str="thursday";
         switch(str){
               
            case "saturday","firday"-> res="11 am";
                  
            case "sunday","monday","tuesday"-> res="8 am";
    
            default-> res="7 am";
         }

         System.out.println(res);

         //return 
         str="saturday";
         
         res=switch(str){
               
            case "saturday","firday"-> "11 am";
                  
            case "sunday","monday","tuesday"-> "8 am";
           //or case value : yield "8 am";
            default-> "7 am";
         };

         System.out.println(res);
        
    }
}
