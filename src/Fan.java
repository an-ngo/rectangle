public class Fan {
    int slow = 1, medium = 2, fast = 3;
    private int speed =1;    
    private boolean ON = false;
    private double radius=5;
    private String color = "Blue";

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isON() {
        return this.ON;
    }

    public boolean getON() {
        return this.ON;
    }

    public void setON(boolean ON) {
        this.ON = ON;
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

    public Fan(){

    }
    public String toString(){
        if(ON){
            return ("speed="+speed+"\ncolor="+color+"\nradius="+radius+"\nfan is on");
        }
        else{
            return ("color="+color+"\nradius="+radius+"\nfan is off");

        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setON(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setON(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
