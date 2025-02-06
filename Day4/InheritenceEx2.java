 class Animal {
    protected String name;
    
    public Animal() {
        this.name = "Generic Animal";
    }
    
    public String eat() {
        return name + " is eating...";
    }
    
    public String sleep() {
        return name + " is sleeping...";
    }
}
class Bird extends Animal {
    public Bird() {
        super();
        this.name = "Bird";
    }
    

    public String eat() {
        return name + " is pecking at food...";
    }
    

    public String sleep() {
        return name + " is roosting...";
    }
    
    public String fly() {
        return name + " is flying!";
    }
}


public class InheritenceEx2 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        
        System.out.println("o methods:");
        System.out.println(bird.eat());
        System.out.println(bird.sleep());
        
        System.out.println("\nTesting new method:");
        System.out.println(bird.fly());}
}
