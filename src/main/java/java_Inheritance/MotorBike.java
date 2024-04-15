package java_Inheritance;

public class MotorBike extends Vehicle{

	MotorBike(){
		speed = 300;
		fuel_capacity = 250;
		
	}
	public void InitiateCascade( ) {
		String engineTYPE="New engine";
		System.out.println("Motorbike initiated cascade");
		System.out.println("Motorbike has attributes: "+speed+" speed, "+fuel_capacity+" fuel capacity "+engineTYPE+" New engine");

	}
}