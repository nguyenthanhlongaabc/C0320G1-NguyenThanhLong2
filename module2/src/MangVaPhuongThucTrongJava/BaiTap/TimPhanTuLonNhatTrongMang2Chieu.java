package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[5][5];
        System.out.print(" Random mảng 5x5 : ");
        for (int i = 0;i<array.length;i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = (int)(Math.random()*100);
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        array(array);
    }
    public static void array(int[][] arr ){
        int max = arr[0][0];
        int row = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < row ; i++){
            for (int j = 0; j < column; j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng là : " + max);

    }
}
