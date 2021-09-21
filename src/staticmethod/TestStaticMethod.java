package staticmethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Peter");
        Student s2 = new Student(222, "Mercury");

        s1.display();
        s2.display();
    }
}
