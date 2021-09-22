package circleandcylinder;

public class Cylinder extends Circle{
    double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder height(double height) {
        setHeight(height);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cylinder)) {
            return false;
        }
        Cylinder cylinder = (Cylinder) o;
        return height == cylinder.height;
    }

    @Override
    public String toString() {
        return "{" +
            " height='" + getHeight() + "'" +
            "}";
    }

    public double getTT(){
        return super.getRadius()*height;
    }
}
