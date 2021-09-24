package triangle;

public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "{" +
            " side1='" + getSide1() + "'" +
            ", side2='" + getSide2() + "'" +
            ", side3='" + getSide3() + "'" +
            "}";
    }
    public double getArea(){
        return side1*side2*side3;//coi nhu la dien tich;
    }
    public double getPerimeter() {
        return side1+side2+side3;
    }
}
