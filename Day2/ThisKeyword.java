class A{
void a()
	{
	System.out.println("Function a ");
	}
void b()
	{
	System.out.println("Function b ");
	this.a();
	}
}
public class ThisKeyword{
	public static void main(String args[])
	{
	A a = new A();
	}


}