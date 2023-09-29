class Vehicle{
    static String make;
    static String model;
    int year;
    static String color;

    Vehicle(){

    }
    Vehicle(String make,String model,int year,String color){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;

    }
     Vehicle(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
        color="unknown";

    }

}
class Car extends Vehicle{
	int numDoors;
	boolean automatic;
	public Car() {
		super();
		
	}
    public Car(String make,String model,int year,String color, int numDoors,boolean automatic) {
    	super(make, model, year, color);
    	this.numDoors=numDoors;
    	this.automatic=automatic;
    }
    
    public Car(String make,String model,int year) {
    	super(make, model, year);
    }
    
    public String toString() {
    	return "Model of car is :"+model+" Making is done by :"+make+
    			"\nlaunch in year :"+year+" and color of car is : "+color+
    			"\nNumber of Doors of  car are :"+numDoors+
    			"\nAutomatic type is :"+automatic;
    }
}
class Truck extends Vehicle{
	double payloadCapacity;
	double towingCapacity;
	public Truck() {
		super();
	}
	public Truck(String make,String model,int year,String color,double payloadCapacity,double towingCapacity) {
		super(make, model, year, color);
		this.payloadCapacity=payloadCapacity;
		this.towingCapacity=towingCapacity;
	}
	public Truck(String make,String model,int year){
		super(make, model, year);
		
	}
	public String toString() {
    	return "Model of truck is :"+model+" Making is done by :"+make+
    			"\nlaunch in year :"+year+" and color of truck is : "+color+
    			"\nPayload capacity of  truck is :"+payloadCapacity+" ton"+
    			"\nTowing capacity is :"+towingCapacity+" ton";
    }
	
}
public class Assignment2 {
	public static void main(String[] args) {
		Car car=new Car();
		System.out.println(car.toString());
		
		Car c1=new Car("TATA", "NANO", 2000,"YELLOW", 4, false);
		System.out.println(c1.toString());
		Car c2=new Car("TATA", "NEXON", 2010);
		System.out.println(c2.toString());
		
		Truck truck=new Truck();
		System.out.println(truck.toString());
		
		Truck t1=new Truck("BALERO", "PICKUP", 1998);
		System.out.println(t1.toString());
		
		Truck truck2=new Truck("TATA", "PRIMA", 2004, "RED", 10.2, 4.3);
		System.out.println(truck2.toString());
		
		
		
	}
}

