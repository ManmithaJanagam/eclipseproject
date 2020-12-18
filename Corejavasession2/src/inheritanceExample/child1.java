package inheritanceExample;

public class child1 extends parent{
	public void cfeature()
	{
		System.out.println("child1 feature");
	}
	public static void main(String args[])
	{
		child1 ch1=new child1();
		ch1.pfeature();
		ch1.cfeature();
		System.out.println(ch1.a);
	}
}
