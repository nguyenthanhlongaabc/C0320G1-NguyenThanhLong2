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
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < index ; i++){
            newArray[i] = array[i];
        }
        newArray[index] = number;
        for (int i = index+1; i < array.length ; i++){
            newArray[i] = array[i-1];
        }
        System.out.println("Các phần tử trong mảng sau khi thêm là : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}