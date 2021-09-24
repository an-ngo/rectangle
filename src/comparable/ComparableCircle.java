package comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    double radius;
    String color;
    boolean filled;
    public ComparableCircle(){
        
    }
    public ComparableCircle(double radius){
        this.radius=radius;
    }
    public ComparableCircle(double radius,String color,boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
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

    public boolean isFilled() {
        return this.filled;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    

    @Override
    public int compareTo(ComparableCircle o) {
        if( getRadius() > o.getRadius()) return 1;
        else if(getRadius()<o.getRadius()) return -1;
        else return 1;
    }


    @Override
    public String toString() {
        return "{" +
            " radius='" + getRadius() + "'" +
            ", color='" + getColor() + "'" +
            ", filled='" + isFilled() + "'" +
            "}";
    }
    
}
