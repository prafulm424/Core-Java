package interface1;

public class Vechicle implements Car,Bike
{

	public static void main(String[] args) 
	{
		Vechicle v = new Vechicle();
		v.ride();
		v.drive();
		v.parking();
		
	
	}

	@Override
	public void ride() 
	{
		System.out.println("I am riding");
		
	}

	@Override
	public void drive() 
	{
		System.out.println("Driving");
		
	}

	@Override
	public void parking() 
	{
		System.out.println("Parking");
		
	}

}
