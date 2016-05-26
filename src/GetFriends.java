public class GetFriends {


	public static void main(String[] args){
    	Classmate ella = new Classmate();
    	Classmate kaiya = new Classmate();
    	Classmate katherine = new Classmate();//4. set descriptions for each Classmate
    	katherine.setDescription("Likes ");
    	ella.setDescription("Likes POTATOES a LOT");
    	kaiya.setDescription("Likes pink fluffy unicorns");
    	
    	System.out.println("Ella " + ella.getDescription());
    	System.out.println("Kaiya " + kaiya.getDescription());
    	System.out.println("Katherine " + katherine.getDescription());
	}

}

class Classmate{
    String description;
    
    public void setDescription(String description){
    	this.description = description;
    }
    
    public String getDescription(){
    	return description;
    }
    //1. create a setter that sets a description this person
    //2. create a getter that gets a description of this person

}
