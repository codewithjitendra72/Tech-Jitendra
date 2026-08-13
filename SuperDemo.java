class Parent {
    Parent(String name) {
        System.out.println("Parent Constructor: " + name);
    }
}

class Child extends Parent {
    Child(String name) {
        super(name);   // Passing argument to parent constructor
        System.out.println("Child Constructor: " + name);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child c = new Child("Jitendra");
    }
}
