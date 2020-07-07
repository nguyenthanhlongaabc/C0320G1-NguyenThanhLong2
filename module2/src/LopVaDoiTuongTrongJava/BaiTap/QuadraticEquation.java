package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhập vào a: ");
        double a = Double.parseDouble(input.nextLine());
        System.out.print(" Nhập vào b: ");
        double b = Double.parseDouble(input.nextLine());
        System.out.print(" Nhập vào c: ");
        double c = Double.parseDouble(input.nextLine());
        QuadraticEquation delta = new QuadraticEquation(a, b, c);
        double d = delta.getDiscriminant();
        if (d > 0) {
            double root1 = delta.getRoot1();
            double root2 = delta.getRoot2();
            System.out.print(" Phương trình có 2 nghiệm x1: " + root1 + " và nghiệm x2 : " + root2);
            System.out.println();
        } else if (delta.getDiscriminant() == 0) {
            System.out.print("Phương trình có nghiệm kép x1 = x2 = " + delta.getRoot1());
            System.out.println();
        } else {
            System.out.print("Phương trình vô nghiệm");
        }

    }
}
