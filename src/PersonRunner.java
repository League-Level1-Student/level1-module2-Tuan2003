
public class PersonRunner {
public static void main(String[] args) {
	Person person1 = new Person();
	Person person2 = new Person();
	Person person3 = new Person();
	person1.setName("Ramon");
	person1.setSuperpower("Teleportation");
	person1.getName();
	person1.getSuperpower();
	System.out.println(person1);
	
	person2.setName("Kenny");
	person2.setSuperpower("Telekenesis");
	person2.getName();
	person2.getSuperpower();
	System.out.println(person2);
	
	person3.setName("Dustin");
	person3.setSuperpower("Invisibility");
	person3.getName();
	person3.getSuperpower();
	System.out.println(person3);
}
}
