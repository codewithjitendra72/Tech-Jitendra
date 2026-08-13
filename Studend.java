class Studend {
    String name;
    int roll;
    int age;

    void display() {
        System.out.println("Name " + name);
        System.out.println("Roll " + roll);
        System.out.println("Age " + age);
    }

    public static void main(String[] ages) {
        Student s1 = new Student();

        s1.name = "Jitendra";
        s1.roll = 101;
        s1.age = 20;

        s1.display();
    }
}
