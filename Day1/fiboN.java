// 0 1 1 2 3 5
import java.util.*;

public class fiboN{

public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int prev = 0;
		int curr = 1;
System.out.println(prev);
System.out.println(curr);
		for(int i = 2; i<=5;i++){
		int next = prev + curr;
		System.out.println(next);
		prev = curr;
 		curr = next;			
		}	
		}
}