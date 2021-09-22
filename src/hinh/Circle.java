package hinh;


public class Circle extends Shape {
    double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*Math.PI*radius;
    }
    public double getParameter(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "{" +
            "A Rectangle with width = "+this.radius +"Which is subclass of "+super.toString()+
            "}";
    }

}
