package Inheritance;

public class Puppy extends Dog {
	
	public void play()
	{
		System.out.println("Playing");
	}
	public void weep()
	{
		System.out.println("Weeping");
	}

	public static void main(String[] args) 
	{
		Puppy obj = new Puppy();
		obj.eat();
		obj.bark();
		obj.play();
		obj.weep();
		obj.meow();
	}

}
