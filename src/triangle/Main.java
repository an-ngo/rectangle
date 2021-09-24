package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(1,2,3);
        Scanner s = new Scanner(System.in);
        t.setSide1(s.nextDouble());
        t.setSide2(s.nextDouble());
        t.setSide3(s.nextDouble());
        System.out.println(t.toString());
        System.out.println("Input 3 side of triangle");
    }
}
