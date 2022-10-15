package Cars;

class Car {
	// Nitelikler
	
	String type;
	String model;
	String color;
	int speed;
	int speedLimit;
	
	// Constructor (Kurucu) Metotlar
	
	Car(String model, int speed, String color){
		this.type = "Sedan";
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.speedLimit = 180;
	}
	
	Car(){
		System.out.println("The method without parameter.");
		this.speedLimit = 180;
	}
	
	// Davranışlar
	
	void increaseSpeed(int increment) {
		if((this.speed + increment) < this.speedLimit) {
			this.speed += increment;
		}
	}
	
	void decreaseSpeed(int decrement) {
		if(this.speed > 0) {
			this.speed -= decrement;
		}
	}
	
	void printSpeed() {
		System.out.println(this.model + "'s speed is : " + this.speed);
	}
	
	void printInfo() {
		System.out.println("Type \t: " + this.type);
		System.out.println("Model \t: " + this.model);
		System.out.println("Color \t: " + this.color);
		System.out.println("Speed \t: " + this.speed);
	}
	
}
