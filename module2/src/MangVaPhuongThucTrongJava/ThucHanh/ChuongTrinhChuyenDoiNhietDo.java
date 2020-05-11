package MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("3.Exit");
            System.out.println("Enter you choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Input Fahrenheit");
                    fahrenheit = Double.parseDouble(input.nextLine());
                    System.out.println("Result: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Input Celsius");
                    celsius = Double.parseDouble(input.nextLine());
                    System.out.println("Result: " + celsiusToFahrenheit(celsius));
                    break;
                default:
                    System.out.println("Failed");
            }
        }while (choice != 0);

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
