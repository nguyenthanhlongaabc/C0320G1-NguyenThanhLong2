package AdvancedObjectOrientedDesign.BaiTap.Colorable;

import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Circle;
import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Rectangle;
import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Shape;
import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,10);
        shapes[2] = new Square(6);
        shapes[3] = new ColorableSquare(8);
        shapes[4] = new ColorableSquare(12);
        for (Shape shape: shapes) {
            if (shape instanceof ColorableSquare){
                ColorableSquare colorableSquare = (ColorableSquare)shape;
                System.out.println("Area colorableSquare :" + colorableSquare.getArea());
                colorableSquare.howToColor();
            }else if (shape instanceof Square){
                Square square = (Square)shape;
                System.out.println("Area square : " + square.getArea());
            }else if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle)shape;
                System.out.println("Area retangle : " + rectangle.getArea());
            }else if (shape instanceof Circle){
                Circle circle = (Circle)shape;
                System.out.println("Area circle : " + circle.getArea());
            }
        }
    }
}
