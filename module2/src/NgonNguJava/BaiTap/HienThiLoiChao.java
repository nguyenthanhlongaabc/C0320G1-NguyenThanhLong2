package NgonNguJava.BaiTap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhập vào tên: ");
        String name = input.nextLine();
        System.out.println(" Hello " + name);
    }
}
