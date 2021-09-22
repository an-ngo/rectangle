package circleandcylinder;


public class Circle {
    double radius;
    String color;


    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle radius(double radius) {
        setRadius(radius);
        return this;
    }

    public Circle color(String color) {
        setColor(color);
        return this;
    }

    

    @Override
    public String toString() {
        return "{" +
            " radius='" + getRadius() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }
    

}
