package lab;

public class Surgeon extends Doctor //child class inherit parent class
{
	
	public void operator()//method
	{
		System.out.println("Surgeon is operating");
	}
	

	public static void main(String[] args) 
	{
		Surgeon sg = new Surgeon();
		sg.surgery();//method invoking from Doctor class
		sg.operator();
		
	}

}
