package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhập vào số thành phần muốn thêm vào ");
        int element;
        int [] array;
        do {
            element = Integer.parseInt(input.nextLine());
            if (element>20){
                System.out.print("Mời nhập lại");
            }
        }while (element>20);
        array = new int[element];
        for (int i = 0 ; i < array.length ; i++){
            System.out.print("Nhập thành phần thứ " + (i+1) + " : ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        int max = array[0];
        int index = 0;
        for (int j = 1; j<array.length;j++){
           if (max<array[j]) {
                max = array[j];
                index = j;
            }
        }
        System.out.print("Phần tử lớn nhất trong mảng là: " + max + " Có vị trí là: " + index);
    }
}
