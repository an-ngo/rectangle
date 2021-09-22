package hinh;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(){
        width=1;
        length=1;
    }
    public Rectangle(double w,double h){
        this.width=w;
        this.length=h;
    }
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*width;    
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "{" +
            "A Rectangle with width="+width+" and length="+
            length+", which is a subclass of "+super.toString()+
            "}";
    }

}
