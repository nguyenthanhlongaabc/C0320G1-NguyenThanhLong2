package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào chiều cao");
        float height = Float.parseFloat(input.nextLine());
        System.out.print("Nhập vào cân nặng");
        float weight = Float.parseFloat(input.nextLine());
        float bmi = weight/(height*height);
        if (bmi>=30.0){
            System.out.println("Obese");
        }else if (bmi>=25.0){
            System.out.println("Overweight");
        }else if (bmi>=18.5){
            System.out.println("Normal");
        }else {
            System.out.println("Underweight");
        }

    }
}
