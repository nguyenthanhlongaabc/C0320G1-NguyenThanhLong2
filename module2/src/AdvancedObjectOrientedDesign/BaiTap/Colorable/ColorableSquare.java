package AdvancedObjectOrientedDesign.BaiTap.Colorable;

import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Square;

public class ColorableSquare extends Square implements Colorable {

    public ColorableSquare(){
    }

    public ColorableSquare(double size){
        super(size);
    }

    @Override
    public void howToColor(){
        System.out.println("How to color: Color all four sides!");
    }

    @Override
    public String toString(){
        return "A ColorableSquare with side = " + getSize() + ", which is a subclass of " + super.toString()
                + ", implements interface Colorable";
    }

}
