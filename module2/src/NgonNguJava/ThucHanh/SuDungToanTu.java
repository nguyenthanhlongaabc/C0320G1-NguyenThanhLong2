package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhập vào chiều rộng ");
        width = input.nextFloat();
        System.out.print(" Nhập vào chiều dài ");
        height = input.nextFloat();
        float area = width*height;
        System.out.println("Diện tích : " + area);
    }
}
