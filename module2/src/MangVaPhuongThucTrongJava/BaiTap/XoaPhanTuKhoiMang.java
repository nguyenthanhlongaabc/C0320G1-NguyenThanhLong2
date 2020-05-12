package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int number;
        System.out.print("Nhập vào số cần xóa");
        boolean check = false;
        int index = 0;
        do {
            number = Integer.parseInt(input.nextLine());
            for (int i = 0; i < arr.length; i++){
                if (number==arr[i]){
                    index = i;
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.print("Số bạn cần xóa không có trong mảng. Vui lòng nhập lại");
            }

        }while (!check);
        for (int i = index  ; i < arr.length -1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
        System.out.print("Mảng sau khi xóa là : ");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
