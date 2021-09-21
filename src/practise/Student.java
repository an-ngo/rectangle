package practise;

import java.util.Objects;

public class Student {
    private String name;
    private String classes;
    
    Student(){

    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student classes(String classes) {
        setClasses(classes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(classes, student.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classes);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", classes='" + getClasses() + "'" +
            "}";
    }
    
}
