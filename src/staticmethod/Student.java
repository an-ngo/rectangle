package staticmethod;



public class Student {
    private int rollNo;
    private String name;
    private static String college = "BIT";

    Student(int r,String n){
        rollNo=r;
        name=n;
    }
    static void change(){
        college="code gym";
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }
}
