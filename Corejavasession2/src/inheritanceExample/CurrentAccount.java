package inheritanceExample;

import java.util.Scanner;

public class CurrentAccount extends Bank{
	private String dateOfAccountOpening;
	private int interestRate;
	CurrentAccount(String name,String dateOfAccountOpening,int maintainCost,int minimumCost,int rateofint)
	{
		super(name,maintainCost,minimumCost);
		this.dateOfAccountOpening=dateOfAccountOpening;
		this.interestRate=rateofint;
		
	}
	public void getDetails()
	{
		super.getDetails();
		System.out.println("dateOfAccountOpening:"+this.dateOfAccountOpening);
		System.out.println("rate of interest:"+this.interestRate);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,maintaincost,minimubalance,dateofaccountopening,interestRate");
		String name=sc.next();
		int maintainCost=sc.nextInt();
		int minimumbalance=sc.nextInt();
		String dateOfAccountOpening=sc.next();
		int interestRate=sc.nextInt();
		CurrentAccount c1=new CurrentAccount(name,dateOfAccountOpening,maintainCost,minimumbalance,interestRate);
		c1.getDetails();
		
	}

}
