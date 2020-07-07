package AdvancedObjectOrientedDesign.BaiTap.Resizeable;

import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Rectangle;

public class ResizeableRectangle extends Rectangle implements Resizeable {
    public ResizeableRectangle(double width, double length){
        super(width, length);
    }

    @Override
    public double getArea(){
        return super.getArea();
    }

    @Override
    public void resize(double percent){
        System.out.println("Before resize : " + this + ". Area : " + getArea());
        System.out.println("Resize with percent = " + percent + "%");
        setWidth(getWidth()*percent/100);
        setLength(getLength()*percent/100);
        System.out.println("After resize : " + this + ". Area : " + getArea());
    }

}
