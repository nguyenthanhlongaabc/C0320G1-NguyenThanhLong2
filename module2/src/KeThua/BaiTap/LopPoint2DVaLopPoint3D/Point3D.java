package KeThua.BaiTap.LopPoint2DVaLopPoint3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D (){
    }

    public Point3D (float z, float x, float y){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] xyz = new float[3];
        xyz[0] = getX();
        xyz[1] = getY();
        xyz[2] = z;
        return xyz;
    }

    @Override
    public String toString(){
        return "X : " + getX() + ", Y: " + getY() + ", Z: " + getZ();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,4,6);
        point3D.setXYZ(3,5,7);
        System.out.println(point3D);
    }
}
