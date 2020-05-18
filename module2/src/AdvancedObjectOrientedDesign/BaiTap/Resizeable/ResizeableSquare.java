package AdvancedObjectOrientedDesign.BaiTap.Resizeable;

import KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Square;

public class ResizeableSquare extends Square implements Resizeable {
    public ResizeableSquare(double size){
        super(size);
    }

    @Override
    public void resize(double percent){
        System.out.println("Before resize : " + this);
        System.out.println("Resize with percent = " + percent + "%");
        setSize(getSize()*percent/100);
        System.out.println("After resize : " + this);
    }
}
