package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Nhập b");
        int b = Integer.parseInt(input.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0){
            if (b==0){
                System.out.println("Không có ước chung lớn nhất");
            }else {
                System.out.println("Ước chung lớn nhất là : " + b);
            }
        }else {
            if (b!=0){
                if (a>b){
                    a = a - b;
                }else {
                    b = b - a;
                }
            }
            if (b==0){
                System.out.println("Giá trị lớn nhất là : " + a);
            }
        }
        System.out.println("Ước chung lớn nhất là : " + a);
    }
}
