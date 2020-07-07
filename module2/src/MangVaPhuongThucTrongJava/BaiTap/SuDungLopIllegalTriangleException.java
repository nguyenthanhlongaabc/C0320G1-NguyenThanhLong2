package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static final int NOT_AN_INTEGER = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = inputFromKeyboard("Enter length of side a: ", scanner);
        int b = inputFromKeyboard("Enter length of side b: ", scanner);
        int c = inputFromKeyboard("Enter length of side c: ", scanner);
        try {
            checkTriangle(a, b, c);
            System.out.printf("{ a: %d, b: %d, c: %d } is a triangle!", a, b, c);
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("{ a: %d, b: %d, c: %d } is not a triangle!", a, b, c);
        }
        System.out.println();
    }

    public static void checkTriangle(int a, int b, int c) throws IndexOutOfBoundsException {
        boolean aIsPositive = a > 0;
        boolean bIsPositive = b > 0;
        boolean cIsPositive = c > 0;
        boolean isTriangle = (aIsPositive && bIsPositive && cIsPositive && a < b + c && b < a + c && c < a + b);
        if (!isTriangle) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static int inputFromKeyboard(String message, Scanner scanner) {
        System.out.print(message);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Integer only!");
            System.exit(NOT_AN_INTEGER);
            return -1;
        }
    }
}
