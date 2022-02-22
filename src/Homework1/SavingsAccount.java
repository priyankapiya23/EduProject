package Homework1;

public class SavingsAccount extends BankAccount{
	private double rate;
	public SavingsAccount(String accNumber, String accName, double rate)
	{
	  super(accNumber,accName);
	  this.rate=rate;
	}
	public double addInterest(){
		//i=p*r*t;
		return rate;
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount s1= new SavingsAccount("123","567",2.9);
		s1.getaccNumber();
	}

}
