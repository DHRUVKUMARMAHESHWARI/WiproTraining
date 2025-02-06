// 
import java.util.*;

public class palindrome{

public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int copy = a;
		int newnum = 0;

		while(a > 0)
		{
		int rem = a%10;
		newnum = newnum*10 + rem;
		a = a/ 10;
		}
		if(newnum == copy){
			System.out.println("Same");
		}
		else
			System.out.println("Not same");
		}
}