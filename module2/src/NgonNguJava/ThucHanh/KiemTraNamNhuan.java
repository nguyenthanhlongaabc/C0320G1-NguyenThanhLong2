package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào năm");
        int year = Integer.parseInt(input.nextLine());
        if (year%4==0){
            if (year%100!=0){
                System.out.println("Là năm nhuận");
            }else {
                if (year%400!=0){
                    System.out.println("Không là năm nhuận");
                }else {
                    System.out.println("Là năm nhuận");
                }
            }
        }

    }
}
