package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class UngDungDemSoHocVienThiDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" vào số lượng sinh viên không quá 30 ");
        int size;
        do {
            size = Integer.parseInt(input.nextLine());
            if (size > 30){
                System.out.print(" Số lượng sinh viên không được quá 30.Vui lòng nhập lại ");
            }
        }while (size>30);
        int[] array = new int[size];
        for (int i = 0 ; i<array.length; i++){
            System.out.print("Nhập điểm của sinh viên thứ " + (i+1) + ": ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>5&&array[i]<=10){
                count++;
            }
        }
        System.out.print("Số lượng sinh viên đỗ là : " + count);
    }
}
