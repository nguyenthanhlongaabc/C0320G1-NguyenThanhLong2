package LopVaDoiTuongTrongJava.BaiTap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private double radius;
    private String color;
    private boolean on;
    public Fan(){
        this.speed = SLOW;
        this.radius = 5;
        this.color = "blue";
        this.on = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void display() {
        if (getOn()){
            System.out.print(" Màu sắc : " + getColor() + " Speed : " + getSpeed() + " Bán kính : " + getRadius() + " .Fan is on");
        }else {
            System.out.print(" Màu sắc : " + getColor() + " Speed : " + getSpeed() + " Bán kính : " + getRadius() + " .Fan is off");
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(2);
        fan1.display();
        System.out.println();
        fan2.setOn(true);
        fan2.setSpeed(3);
        fan2.setRadius(10);
        fan2.setColor("yellow");
        fan2.display();




    }
}
