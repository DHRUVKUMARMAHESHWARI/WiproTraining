import java.util.*;

class Student {
    String name;
    int age;
    float cgpa;
    
    public void getData(String name, int age, float cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    
    public void showData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("CGPA: " + this.cgpa);
    }
}

public class StudentData {	
    public static void main(String args[]) {
		
        Student[] students = new Student[5];
 
        students[0] = new Student();
        students[0].getData("Dhruv", 20, 8.5f);
        
        students[1] = new Student();
        students[1].getData("Atharv", 21, 7.9f);
        
        students[2] = new Student();
        students[2].getData("Gajju", 22, 8.2f);
        
        students[3] = new Student();
        students[3].getData("deep", 20, 9.1f);
        
        students[4] = new Student();
        students[4].getData("Dev", 23, 7.5f);

        for (int i = 0; i < students.length; i++) {
            students[i].showData();
            System.out.println();
        }
    }
}
