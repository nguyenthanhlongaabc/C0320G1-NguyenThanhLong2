package LopVaDoiTuongTrongJava.ThucHanh;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle :" + "(Chiều rộng : " + this.width + ",Chiều dài : " + this.height + ")";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhập vào chiều rộng ");
        double width = Integer.parseInt(input.nextLine());
        System.out.print(" Nhập vào chiều dài ");
        double height = Integer.parseInt(input.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.print(rectangle.display());
        System.out.println();
        System.out.print("Diện tích là : " + rectangle.getArea());
        System.out.println();
        System.out.print("Chu vi là : " + rectangle.getPerimeter());
    }
}

