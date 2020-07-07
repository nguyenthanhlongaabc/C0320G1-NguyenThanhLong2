package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiCacPhuongThucCuaArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E e) {
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(int index, E element){
       if (size == elements.length){
           ensureCapa();
       }
       if (index < 0 || index > size){
           System.out.println("The index is not valid");
       }else {
           Object[] reMain = Arrays.copyOfRange(elements,index,size);
           elements[index] = element;
           for (int i = 0; i < reMain.length; i++){
               elements[index+1+i] = reMain[i];
           }
           size++;
       }
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            Object deletedElement = elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size] = null;
            size--;
            return (E) deletedElement;
        }
    }

    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int index = 0; index < this.size; index++) {
            elements[index] = null;
        }
        size = 0;
    }


    public void disPlay(){
        for (int i = 0; i<size; i++){
            System.out.println(elements[i]);
        }
    }


}
