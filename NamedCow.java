class NamedCow extends Cow
{
    private String myName;          
     public NamedCow(String type, String name, String sound)    {
          myType = type;     
              myName= name;
         mySound = sound; 
   
     }     
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     public String getName(){return myName;} 

}
