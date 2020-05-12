package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr1 = new int[5];
        int[]arr2 = new int[3];
        for (int i = 0; i<arr1.length ; i++){
            System.out.print("Nhập giá trị cho phần tử thứ " + (i+1) + " của mảng 1 ");
            arr1[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < arr2.length; i++){
            System.out.print("Nhập giá trị cho phần tử thứ " + (i+1) + " của mảng 2 ");
            arr2[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print("Các phần tử của mảng 1 : ");
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Các phần tử của mảng 2 : ");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        int[]arr3 = new int[arr1.length + arr2.length];
        for (int i = 0 ; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0 ; i<arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.println();
        System.out.print("Các phần tử của mảng 3 : ");
        for (int i = 0; i < arr3.length ; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
