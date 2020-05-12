package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Nhập vào số cần chèn");
        int number = Integer.parseInt(input.nextLine());
        System.out.print("Nhập vào vị trí cần chèn");
        int index;
        do {
            index = Integer.parseInt(input.nextLine());
            if (index < 0 || index > 9) {
                System.out.print("Chỉ số phải nằm trong khoảng từ 0-9. Vui lòng nhập lại");
            }
        } while (index < 0 || index > 9);
        int[] array1 = new int[array.length+1];
        for (int i = 0; i<index ; i++){
            array1[i] = array[i];
        }
        array1[index] = number;
        for (int i = index+1; i< array1.length; i++){
            array1[i]=array[i-1];
        }
        System.out.println("Các phần tử trong mảng sau khi thêm là : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}