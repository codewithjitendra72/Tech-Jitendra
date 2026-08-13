class Demo1 {
    // Method Overloading
    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
}

class Parent {
    void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    // Method Overriding
    void show() {
        System.out.println("This is Child class method");
    }
}

public class Demo {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.add(10, 20);
        obj.add(10, 20, 30);

        Child c = new Child();
        c.show();
    }
}