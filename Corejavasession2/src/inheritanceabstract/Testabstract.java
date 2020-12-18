package inheritanceabstract;

public class Testabstract {
public static void main(String args[])
{
	ICICI objicici=new ICICI();
	objicici.gettransactiondetails();
	System.out.println(objicici.getRateOfIntrest());
	SBI objsbi=new SBI();
	objsbi.gettransactiondetails();
	System.out.println(objsbi.getRateOfIntrest());
}
}
