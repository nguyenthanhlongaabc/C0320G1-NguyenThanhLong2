package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TinhTongCuaMotCotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[5][5];
        System.out.print("Random mảng 5x5");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void sumColumn(int[]array){
        int sum = 0;

    }
}
