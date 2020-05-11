package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print(" Nhập vào kích thước mảng ");
        do {
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.print(" Kích thước không được quá 20. Mời nhập lại ");
            }
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print(" Nhập phần tử thứ " + (i + 1));
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print(" Số phần tử trong mảng là : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println();
        System.out.print(" Mảng sau khi đảo ngược là : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
