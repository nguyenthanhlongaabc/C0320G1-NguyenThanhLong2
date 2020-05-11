package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhập vào một số ");
        int number = Integer.parseInt(input.nextLine());
        boolean check = false;
        if (number<2){
            System.out.println("Không phải số nguyên tố");
        }
        for (int i = 2; i < Math.sqrt(number);i++){
            if (number%i == 0 ){
                check = true;
                System.out.println("Không phải số nguyên tố");
                break;
            }
        }
        if (!check){
            System.out.println("Số nguyên tố");
        }

    }
}
