package inheritanceExample;

public class child2 extends parent {
	public void c2feature()
	{
		System.out.println("child2 feature");
	}
	public static void main(String args[])
	{
		child2 ch2=new child2();
		ch2.pfeature();
		ch2.c2feature();
	}
}
