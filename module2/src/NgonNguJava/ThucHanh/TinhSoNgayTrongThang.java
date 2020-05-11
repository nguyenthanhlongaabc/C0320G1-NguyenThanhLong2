package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tháng");
        int month = Integer.parseInt(input.nextLine());
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng này có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 30 ngày");
                break;
            default:{
                System.out.println("Nhập sai");
            }
        }
    }
}
