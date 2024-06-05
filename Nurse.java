package lab;

public class Nurse extends Doctor //child class inherit parent class
{
	public void treatment()
	{
		System.out.println("Nurse is Preparing Treatment");//display msg when called
		
	}

	public static void main(String[] args) 
	{
		Nurse ns = new Nurse();
		ns.surgery();//method from Doctor class
		ns.treatment();
	}

}
