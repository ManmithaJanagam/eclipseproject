package inheritanceExample;
import java.util.*;
public class savingsAccount extends Bank{
	private String dateOfAccountOpening;
savingsAccount(String name,String dateOfAccountOpening,int maintainCost,int minimumCost)
{
	super(name,maintainCost,minimumCost);
	this.dateOfAccountOpening=dateOfAccountOpening;
}

public void getDetails()
{
	super.getDetails();
	System.out.println("dateOfAccountOpening:"+this.dateOfAccountOpening);
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name,maintaincost,minimubalance,dateofaccountopening");
	String name=sc.next();
	int maintainCost=sc.nextInt();
	int minimumbalance=sc.nextInt();
	String dateOfAccountOpening=sc.next();
	savingsAccount s1=new savingsAccount(name,dateOfAccountOpening,maintainCost,minimumbalance);
	s1.getDetails();
	
}

}
