package KeThua.BaiTap;

import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle (){
    }

    public Triangle (double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle (double side1,double side2,double side3,String color,boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        return (Math.sqrt(( this.side1 + this.side2 + this.side3)*(this.side1 + this.side2
                - this.side3)*(this.side2 + this.side3 - this.side1)*(this.side3 + this.side1 - this.side2)))/4;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString(){
        if ((this.side1 + this.side2)>this.side3 && (this.side1 + this.side3)>this.side2 &&
                (this.side2 + this.side3) > this.side1 ){
            return "Triangle with Side1 =" + getSide1() + ", Size2 = " + getSide2() + ", Size3 = "
                    + getSide3() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter()
                    + ".Triangle extends " + super.toString();
        }else {
            return "These are not 3 sides of a triangle";
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,5,7,"orange",true);
        System.out.println(triangle);
    }

}
