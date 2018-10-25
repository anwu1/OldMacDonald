
class Chick implements Animal {     
     private String myType;     
     private String mySound;      

     public Chick(String type, String sound, String sound1)     {         
       
         myType = type;         
         if (Math.random()<.5){
           mySound=sound;
         }
         else {
           mySound=sound1;
         }
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
