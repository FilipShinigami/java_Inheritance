package java_Inheritance;



public class Automobile extends Vehicle{

	Automobile() {
		speed = 400;
		fuel_capacity = 500;
		//int brojNaVrati=4;
	}
	
public void Start() {
	int NumOfDoors=4;
	System.out.println("Automobile is Started");
	System.out.println("Automobile attributes are: "+speed+" speed, "+ fuel_capacity+" fuell capacitly "+NumOfDoors+" doors");
	}
}