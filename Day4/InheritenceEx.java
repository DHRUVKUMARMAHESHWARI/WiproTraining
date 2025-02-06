import java.util.*;

public class InheritenceEx{
	public static void main(String[] args){
        book b=new book();
	b.setAuthor("j.k.row","jkrowling@example.com",'F');
	b.setName("Harry potter and ");
	b.setPrice(29.99);
	b.setQty(100);
	System.out.println("Book:");
	System.out.println("Name:"+b.getName());
	b.display();
	System.out.println("Price:"+b.getPrice());
	System.out.println("qtyInStock:"+b.getQty());
 	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
}}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
class author{

	String name,email;
	char gender;
	
	void setAuthor(String a,String b,char c){
 	name=a;
        email=b;
        gender=c;
	}
        void display(){
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);
	System.out.println("Gender:"+gender);
	}

}     

class book extends author {
	String name;
	double price;
	int qtyInStock;

       	void setName(String n){
	name=n;	}

        void setPrice(double n){
	price=n;	
	}
	void setQty(int a){
	qtyInStock=a;
	}
        String getName(){
	return name;
	}
        double getPrice(){
	return price;
	}
        int getQty(){
	return qtyInStock;
	}
}
