class Parent {
    void display(int a) {
        System.out.println("display mathod with int a");
    }

    void display(double a) {
        System.out.println("display method with double");
    }
}

class Child extends Parent {
    void display(int a) {
        System.out.println("Childe class display");
    }
}

class test1 {
    public static void main(String[] args) {
        Parent P1 = new Child();
        P1.display(0.5);
        P1.display(5.5);
    }
}