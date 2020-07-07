package NgonNguJava.BaiTap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số tiền (USD)");
        float money = Float.parseFloat(input.nextLine());
        double rate = money*23000;
        System.out.println("Giá trị quy đổi là : " + rate);
    }
}
