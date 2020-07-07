package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] student = {"Long","Nam","An"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(input_name)){
                System.out.println("Học sinh cần tìm là " + input_name + " ở vị trí số : " + (i+1));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("Không có " + input_name + " trong danh sách ");
    }
}
