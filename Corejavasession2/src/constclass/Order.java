package constclass;
import java.util.*;
public class Order {
	int orderid;
	String orderdate;
	int price;
	int quantity;
	Order(int id,String date,int price,int quantity)
	{
		this.orderid=id;
		this.orderdate=date;
		this.price=price;
		this.quantity=quantity;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int orderid=sc.nextInt();
	String orderdate=sc.next();
	int price=sc.nextInt();
	int quantity=sc.nextInt();
	Order o1=new Order(orderid,orderdate,price,quantity);
	o1.calculateTotalprice();
	o1.nooforders();
}
public void calculateTotalprice()
{
	int totalprice=this.price*this.quantity;
	System.out.println("totalprice is "+totalprice);
}
public void nooforders()
{
	System.out.println(this.quantity);
}

}
