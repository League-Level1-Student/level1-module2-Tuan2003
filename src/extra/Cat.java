package extra;

public class Cat {
private String name;
private int lives;

Cat(String name,int lives){
this.lives = lives;
setName(name);
System.out.println("This cat's name is " + name + " he has " + lives + " lives.");
}

public String setName(String name) {
this.name = name;
if(name.equalsIgnoreCase("tuan")) {
	return "Cool";
	
}else {
	return "Lame";
	
}

}

}
