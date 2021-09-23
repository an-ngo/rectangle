package point;

import java.util.Objects;

public class MovablePoint extends Point{
    float xSpeed;
    float ySpeed;
    final float z=1;
    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public String toString() {
        return "{" +
            "}";
    }
    public MovablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}
