package AdvancedObjectOrientedDesign.BaiTap.Resizeable;

import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Circle;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius){
        super(radius);
    }

    @Override
    public double getArea(){
       return super.getArea();
    }

    @Override
    public void resize(double percent){
        System.out.println("Before resize : " + this + ". Area : " + getArea());
        System.out.println("Resize with percent = " + percent + "%");
        setRadius(getRadius() * percent / 100);
        System.out.println("After resize: " + this + ". Area : " + getArea());
    }
}
