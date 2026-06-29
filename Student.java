public class student {
    int id;
    String name;

    student() {
        this(100, "Rahul");
    }

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(this.id + "" + this.name);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}
