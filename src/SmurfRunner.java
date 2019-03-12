public class SmurfRunner {
public static void main(String[] args) {
	Smurf handySmurf = new Smurf("Handy Smurf", "White");
	handySmurf.eat();
	handySmurf.getName();
	Smurf papaSmurf = new Smurf("Papa Smurf","Red");
	papaSmurf.eat();
	papaSmurf.getName();
	papaSmurf.isGirlOrBoy();
	Smurf smurfette = new Smurf("Smurfette", "White");
	smurfette.eat();
	smurfette.isGirlOrBoy();
}
}
