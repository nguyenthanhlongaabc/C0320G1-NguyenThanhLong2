package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class SuDungLopArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr = new int[100];
        arr = random(arr);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kì : ");
        try {
            int x = input.nextInt();
            System.out.println("Giá trị của của phần tử có chỉ số " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException array){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
    public static int[] random(int[]arr){
        arr = new int[100];
        System.out.print(" Các giá trị trong mảng: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr ;
    }
}
