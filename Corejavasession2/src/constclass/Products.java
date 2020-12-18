package constclass;
import java.util.*;
public class Products {
	int productId;
	String name;
	int price;
	int stockAvailable;
	Products(int productId,String name,int price,int stockAvailable)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.stockAvailable=stockAvailable;
	}
	Products(int productId,String name,int price)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.stockAvailable=10;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product details id,name,price,stockavailable");
		int id=sc.nextInt();
		String name=sc.next();
		int price=sc.nextInt();
		int stockavailable=sc.nextInt();
		Products p1=new Products(id,name,price,stockavailable);
		System.out.println("Enter the product details id,name,price,stockavailable");
		 id=sc.nextInt();
		 name=sc.next();
		price=sc.nextInt();
		Products p2=new Products(id,name,price);
		p1.stocknotify();
		p2.stocknotify();
		p1.calculateProductCommission();
		p2.calculateProductCommission();
		p1.checkProductAvailability();
		p2.checkProductAvailability();
		System.out.println("Product "+p1.name+" details:");
		System.out.println("Product id:"+p1.productId+" Product name:"+p1.name+" Price:"+p1.price+" stockAvailable:"+p1.stockAvailable);
		System.out.println("Product "+p2.name+" details:");
		System.out.println("Product id:"+p2.productId+" Product name:"+p2.name+" Price:"+p2.price+" stockAvailable:"+p2.stockAvailable);
	}
	public void stocknotify()
	{
		if(this.stockAvailable<10)
		{
			System.out.println("StockAvailable is less than 10");
		}
		else
		{
			System.out.println("Enough StockAvailable");
		}
	}
	public void calculateProductCommission()
	{
		double commission=this.price*0.1;
		System.out.println("Commission for "+this.name+" is"+commission);
	}
	public void checkProductAvailability()
	{
		if(this.name.equalsIgnoreCase("laptop")||this.name.equalsIgnoreCase("pendrive")||this.name.equalsIgnoreCase("mouse"))
		{
			System.out.println(this.name+" is available");
		}
		else
		{
			System.out.println(this.name+" is not available");
		}
	}
	
}
