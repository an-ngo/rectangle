

public class Rectangle {
    int height;
    int width;
    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int getArea(){
        return this.height*this.width;
    }
    public int getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle: Area = "+this.getArea()+" Perimeter = "+this.getPerimeter();
    }
}
