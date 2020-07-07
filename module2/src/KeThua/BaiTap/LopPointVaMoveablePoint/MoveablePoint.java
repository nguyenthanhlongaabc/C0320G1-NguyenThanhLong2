package KeThua.BaiTap.LopPointVaMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] xySpeed = new float[2];
        xySpeed[0] = xSpeed;
        xySpeed[1] = ySpeed;
        return xySpeed;
    }

    @Override
    public String toString(){
        return "X = " + getX() + " .Y " + getY() + " .Speed (xSpeed = "
                + getxSpeed() + " .ySpeed " + getySpeed() + ")";
    }

    public MoveablePoint move(){
        super.setX(super.getX() + getxSpeed());
        super.setY(super.getY() + getySpeed());
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2,4);
        System.out.println(moveablePoint);
        System.out.println();
        System.out.println(moveablePoint.move());
    }
}
