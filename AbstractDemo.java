abstract class demo {
    abstract void draw();   // abstract method

    void message() {
        System.out.println("This is a Shape class");
    }
}

class Circle extends demo {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.message();
        c.draw();
    }
}