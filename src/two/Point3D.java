package two;

public class Point3D extends Point2D{
    float z;

    public Point3D() {
    }

    public Point3D(float x, float y) {
        super( x, y);
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" +
            " z='" + getZ() + "'" +
            "}";
    }
}
