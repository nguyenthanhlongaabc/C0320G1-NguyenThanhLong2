package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tiền gửi");
        int money = Integer.parseInt(input.nextLine());
        System.out.print("Nhập lãi suất");
        float interestRate = Float.parseFloat(input.nextLine());
        System.out.print("Nhập số tháng gửi");
        int month = Integer.parseInt(input.nextLine());
        double tienLai;
        tienLai = money*(interestRate/100)/12*month;
        System.out.println("Số tiền lãi : " + tienLai);
    }

}
