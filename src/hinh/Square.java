package hinh;

public class Square extends Rectangle {
    double size;
    public Square(){
        this.length=1;
        this.width=1;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void setWidth(double w){
        this.width=w;
    }
    @Override
    public void setLength(double w){
        this.length=w;
    }

}
