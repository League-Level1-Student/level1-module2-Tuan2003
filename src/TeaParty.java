public class TeaParty {
private String name;
private boolean isWoman;
private boolean isKnighted;
private String greeting;
       public String welcome(String name, boolean isWoman, boolean isKnighted)
       {
    	this.name = name;
    	this.isWoman = isWoman;
    	this.isKnighted = isKnighted;
    	if(this.isWoman == true && this.isKnighted == true) {
    		greeting = "Lady ";
    	}else if(this.isWoman == true && this.isKnighted == false){
    		greeting = "Ms. ";
    	}
    	
    	else if(this.isWoman == false && this.isKnighted == true) {
    		greeting = "Sir ";
    	}else {
    		greeting = "Mr. ";
    	}
    	
    	return "Hello " + greeting + name;
       }

}