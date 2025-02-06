import java.utils.*;

class Author 
{
String name;
String email;
char gender;

Author(String name , String email, char gender)
	{
	this.name =name;
	this.email=email;
	this.gender=gender; 
	}

}

class Book extends Author
{
	String name;
	double price;
	int qtyInStock;
	
Book(String name , double price ,int qtyInStock)
	{
	this.name = name;
	this.price = price;
	this.qtyInStock =qtyInStock; 
	}
	
function showData(String name , double price ,int qtyInStock)
{
System.out.println("Name = "  + name + " price "  + price + "`qtyInStock " + qtyInStock );
}

	

}


public class InheritanceEx
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	Book b1 = new Book();
	b1.showData("Harry potter" , 29.99,2);
	}
}