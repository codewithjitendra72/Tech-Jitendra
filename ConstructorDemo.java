class ConstructorDemo {
    int x;

    ConstructorDemo() {
        x = 10;
    }

    ConstructorDemo(int a) {
        x = a;
    }

    ConstructorDemo(ConstructorDemo obj) {
        x = obj.x;
    }

    void display() {
        System.out.println("value= " + x);
    }

    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo(50);
        ConstructorDemo obj3 = new ConstructorDemo(obj2);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
