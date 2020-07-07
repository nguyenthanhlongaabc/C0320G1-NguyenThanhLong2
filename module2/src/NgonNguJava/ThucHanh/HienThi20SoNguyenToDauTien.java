package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number = 2;
        while (count <= 20) {
            boolean check = false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(number + "Là số nguyên tố");
                count++;
            }
            number++;
        }
    }
}
