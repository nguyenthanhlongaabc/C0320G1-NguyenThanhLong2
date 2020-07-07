package KeThua.BaiTap.LopCircleVaLopCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString(){
        return "Hình tròn có bán kính là " + getRadius() + " .Có màu sắc là : " + getColor()
                + " .Có diện tích là : " + getArea() + " .Có chu vi là : " + getPerimeter();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2,"Blue");
        System.out.println(circle);
    }
}
