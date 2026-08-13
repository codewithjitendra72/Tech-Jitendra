public class Course {

    String CourseName;
    int totalStudents;

    Course(String name) {
        CourseName = name;
        totalStudents = 0;
    }

    void enrollStudent(String studentName) {
        totalStudents++;
        System.out.println(studentName + " enrolled in " + CourseName);
    }

    void unenrollStudent() {
        if (totalStudents > 0) {
            totalStudents--;
            System.out.println("A student unenrolled from " + CourseName);
        }
    }

    void display() {
        System.out.println("Course Name: " + CourseName);
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java Programming");

        c1.enrollStudent("Rahul");
        c1.enrollStudent("Aman");

        c1.unenrollStudent();

        c1.display();
    }
}