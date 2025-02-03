import java.util.*;
public class lastDigit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int copya= a%10 ;
		int copyb = b%10;
		if(copya == copyb)
			{
				System.out.println("same");
			}
		else
			{
				System.out.println("not same");
			}
	}	
}
