package lab;

public class CheckingAccount implements BankAccount //implement Bank Account interface
{

	public static void main(String[] args) 
	{
		CheckingAccount ck = new CheckingAccount();//object 
		ck.deposit();
		ck.withdraw();

	}

	@Override
	public void deposit() // method from interface
	{
		System.out.println("Cash is Deposited");
		
	}

	@Override
	public void withdraw() //method from interface
	{
		System.out.println("Cash is Withdraw");
		
	}

}
