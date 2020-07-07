package AdvancedObjectOrientedDesign.ThucHanh.Comparable_Circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircle = new ComparableCircle[4];
        comparableCircle[0] = new ComparableCircle(3.5);
        comparableCircle[1] = new ComparableCircle();
        comparableCircle[2] = new ComparableCircle(6.3);
        comparableCircle[3] = new ComparableCircle(1.2,"red",true);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparableCircle) {
            System.out.println(circle);
        }

        Arrays.sort(comparableCircle);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableCircle) {
            System.out.println(circle);
        }
    }
}
