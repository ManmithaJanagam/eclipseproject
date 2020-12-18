package inheritanceExample;

public class Bank {
private String name;
private int maintainCost;
private int minimumbalance;
 Bank(String name,int maintainCost,int minimumCost)
{
	this.name=name;
	this.maintainCost=maintainCost;
	this.minimumbalance=minimumCost;
}
 public void getDetails()
 {
	 System.out.println("name "+this.name);
	 System.out.println("maintaincost "+this.maintainCost);
	 System.out.println("minimumblance "+this.minimumbalance);
 }
}
