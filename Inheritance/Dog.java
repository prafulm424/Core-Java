package Inheritance;

public class Dog extends Animal {
	
	public void bark()
	{
		System.out.println("Barking");
	}
	public void meow()
	{
		System.out.println("Meoww");
	}

	public static void main(String[] args) 
	{
		Dog obj = new Dog();
		obj.eat();
		obj.bark();
		// TODO Auto-generated method stub

	}

}
