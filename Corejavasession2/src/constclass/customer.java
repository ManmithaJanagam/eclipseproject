package constclass;
import java.util.*;
public class customer {
int customerId;
String name;
String contactNumber;
String emailId;
int gradePoints;
int purchaseAmount;
customer(int id,String name,String contactnum,String emailid,int purchase)
{
	this.customerId=id;
	this.name=name;
	this.contactNumber=contactnum;
	this.emailId=emailid;
	this.purchaseAmount=purchase;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the customer details id,name,contactnumber,emailid,purchaseamount");
	int cusid=sc.nextInt();
	String name=sc.next();
	String contactNumber=sc.next();
	String emailId=sc.next();
	int purchaseAmount=sc.nextInt();
	customer c=new customer(cusid,name,contactNumber,emailId,purchaseAmount);
	c.calculateGradePoints();
}
public void calculateGradePoints()
{
	if(this.purchaseAmount>10000)
	{
		this.gradePoints=10;
	}
	else if(this.purchaseAmount>5000)
	{
		this.gradePoints=5;
	}
}
public void getDetails()
{
	System.out.println("customer ID:"+this.customerId);
	System.out.println("customer name:"+this.name);
	System.out.println("customer contactnumber:"+this.contactNumber);
	System.out.println("cutomer emailid:"+this.emailId);
	System.out.println("customer gradePoints:"+this.gradePoints);
	System.out.println("customer PurchaseAmount:"+this.purchaseAmount);
	System.out.println("Customer details printed");
	System.out.println("Finished printing");
	System.out.println("welcome");
}
}
