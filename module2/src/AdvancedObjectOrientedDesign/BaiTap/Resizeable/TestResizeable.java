package AdvancedObjectOrientedDesign.BaiTap.Resizeable;

import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
        Random random = new Random();
        ResizeableCircle resizeableCircle = new ResizeableCircle(10.0);
        resizeableCircle.resize(getRandomFrom1To99(random));

        ResizeableRectangle resizeableRectangle = new ResizeableRectangle(10,20) ;
        resizeableRectangle.resize(getRandomFrom1To99(random));

        ResizeableSquare resizeableSquare = new ResizeableSquare(10);
        resizeableSquare.resize(getRandomFrom1To99(random));

    }

    public static int getRandomFrom1To99(Random random) {
        return random.nextInt(99) + 1;
    }
}
