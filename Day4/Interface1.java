
interface I1 {
    void show();
}


class C1 implements I1 {
    private String name;
    

    public C1(String name) {
        this.name = name;
    }
    
    public void show() {
        System.out.println(name);
    }
}


public class Interface1 {
    public static void main(String[] args) {
        C1 obj = new C1("Dhruv");	
        obj.show(); 
    }
}