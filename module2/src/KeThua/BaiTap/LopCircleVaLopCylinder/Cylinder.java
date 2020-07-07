package KeThua.BaiTap.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height, int radius , String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return super.getArea()*2 + super.getPerimeter()*height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString(){
        return "Hình trụ có chiều cao " + getHeight() + " . Có diện tích " + getArea() + " .Có bán kính : " + getRadius()
                + " .Có màu sắc : " + getColor() + " .Có thể tích : " + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,5,"black");
        System.out.println(cylinder);

    }
}
