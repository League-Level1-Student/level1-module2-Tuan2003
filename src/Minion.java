
public class Minion {
	
private String name; 
private int eyes; 
private String color; 
private String master;

Minion(String name, int eyes, String color, String master){
	this.name = name;
	this.eyes = eyes;
	this.master = master;
	this.color = color;
}

public String getMaster() {
	
	return master;
}

public void setMaster(String master) {
	this.master = master;
}

public String getName() {
	return name;
}

public String getColor() {
	return color;
}
public int getEyes() {
	return eyes;
}

}
