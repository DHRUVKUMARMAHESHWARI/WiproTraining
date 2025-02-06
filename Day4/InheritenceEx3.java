
class Fruit {
    String name, taste, size;

    public void eat() {
        System.out.println("Eating a " + size + " " + name + " which tastes " + taste + ".");
    }
}


class Apple extends Fruit {
    public Apple() {
        name = "apple";
        taste = "sweet and crunchy";
        size = "medium";
    }
}

class Orange extends Fruit {
    public Orange() {
        name = "orange";
        taste = "citrusy and juicy";
        size = "large";
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        
        apple.eat();
        orange.eat();
    }
}
