package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the right triangle - botton-left");
        System.out.println("3. Draw the right triangle - top-left ");
        System.out.println("4. Draw the isosceles triangle ");
        System.out.println("Enter your choice: ");
        while (true){
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i=1;i<=3;i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the right triangle - botton-left");
                    for (int i = 1; i<=5 ; i++){
                        for (int j=1 ; j<=i ;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the right triangle - top-left");
                    for (int i = 5; i>=1 ; i--){
                        for (int j = 1 ; j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Draw the isosceles triangle");
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
