package Homework1;
import java.util.Scanner;
public class BankAccount {
	Scanner s=new Scanner(System.in);
	private String accName;
	private String  accNumber;
	private double balance;
	 
	public BankAccount(String accNumber, String accName)
	{
		this.accNumber= accNumber;
		this.accName=accName;
	}
	public String getaccName()
	{
		return accName;
	}
	public String getaccNumber()
	{
		return accNumber;
	}
	public double getbalance()
	{
		System.out.println("enter balance");
	    balance=s.nextDouble();
     	return balance;
     	
	}
	public double deposite(double amount)
	{       
		    balance = balance +amount;
			return  amount;	
	}
	public double withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("insuffecient balane");
		}
		else
		{
			balance=balance-amount;
		}
		return balance;
		
	}


}
