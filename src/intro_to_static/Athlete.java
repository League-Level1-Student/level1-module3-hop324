package intro_to_static;


public class Athlete {
	

	     static int nextBibNumber = 1;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	Athlete (String name, int speed){
	     this.name = name;
	     this.speed = speed;
	     bibNumber = nextBibNumber;
	     nextBibNumber++;
	}

	public static void main(String[] args) {
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
	Athlete a = new Athlete("James", 10);
	Athlete b = new Athlete ("Alex", 12);
	System.out.println(a.name + " #" + a.bibNumber + " " + a.raceLocation);
	System.out.println(b.name + " #" + b.bibNumber + " " + b.raceLocation);

	}
}

