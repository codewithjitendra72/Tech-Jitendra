class Test {
    String name;
    int id;

    Test(String s, int i) {
        name = s;
        id = i;
    }

    Test(Test t) {
        name = t.name;
        id = t.id;
    }

    void show() {
        // System.out.println("name" + t.name +"Id" t.id);
        System.out.println("name: " + name + " Id: " + id);
    }

    public static void main(String[] args) {
        Test t1 = new Test("Jitendra", 101);
        Test t2 = new Test(t1);
        t1.show();
        t2.show();
    }
}
