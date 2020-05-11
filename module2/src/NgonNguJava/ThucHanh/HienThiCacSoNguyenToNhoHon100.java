package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 2;
        while (number<=100) {
            boolean check = false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(number + " Là số nguyên tố ");
            }
            number++;
        }
    }
}
