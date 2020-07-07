package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]array;
        int size;
        System.out.print("Nhập vào kích thước mảng");
        size = Integer.parseInt(input.nextLine());
        array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.print("Nhập vào phần tử thứ " + (i+1) );
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + minValue(array));

    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 1 ; i<arr.length; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
