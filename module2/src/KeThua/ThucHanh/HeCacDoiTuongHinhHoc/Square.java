package KeThua.ThucHanh.HeCacDoiTuongHinhHoc;

public class Square extends Rectangle {
    public Square (){
    }

    public Square (double size){
        super(size,size);
    }

    public Square (double size, String color, boolean filled){
        super(size,size,color,filled);
    }

    public double getSize(){
        return getWidth();
    }

    public void setSize(double size){
        setWidth(size);
        setLength(size);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }


}
