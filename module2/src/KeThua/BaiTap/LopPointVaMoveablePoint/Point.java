package KeThua.BaiTap.LopPointVaMoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point (){
    }

    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] XY = new float[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }

    @Override
    public String toString(){
        return "X = " + getX() + " . Y = " + getY();
    }

    public static void main(String[] args) {
        Point point = new Point(2,4);
        System.out.println(point);
    }
}
