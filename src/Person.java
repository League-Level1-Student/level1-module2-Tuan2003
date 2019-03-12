
public class Person {
String name;
String superpower;
public String getName() {
	return name;
	
}
public String getSuperpower() {
	return superpower;
}
public void setName(String personName) {
	name = personName;
}
public void setSuperpower(String personSuperpower) {
	superpower = personSuperpower;
}

public String toString() {

	return name + " has mad " + superpower + " skills";
}
}
