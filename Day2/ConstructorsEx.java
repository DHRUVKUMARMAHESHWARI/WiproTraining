import java.util.*;

class Student {
 	int a;
	int b;
    	
	Student(int a , int b){
	System.out.println("Multiplication of a and b  	" + (a*b));
	}
	Student(Student s )
  	{
	System.out.println("Copy constructor called " + s);
  	}
   }

public class ConstructorsEx {	
    public static void main(String args[]) {
		Student s1 = new Student(2,3);
		Student s2 = new Student(s1);
            }
}
