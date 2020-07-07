package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = "aaabbddcdef";
        System.out.print("Nhập vào một kí tự");
        String str2 = input.nextLine();

        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            String a = String.valueOf(str1.charAt(i));
            if (str2.equals(a)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của " + str2 + " là " + count);
    }
}
