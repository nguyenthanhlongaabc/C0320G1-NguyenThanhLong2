package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giải Phương trình bậc 1 : ax + b = 0");
        System.out.print("Nhập vào a");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Nhập vào b");
        int b = Integer.parseInt(input.nextLine());
        if (a != 0){
            float x = -b/a;
            System.out.println("Phương trình có nghiệm : " + x);
        }else {
            if (b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
