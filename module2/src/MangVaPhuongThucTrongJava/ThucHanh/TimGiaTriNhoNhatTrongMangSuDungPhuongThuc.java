package MangVaPhuongThucTrongJava.ThucHanh;

public class TimGiaTriNhoNhatTrongMangSuDungPhuongThuc {
    public static void main(String[] args) {
        int[] array = {4,2,6,8,1,9};
        int index = min(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là : " + array[index]);
    }
    public static int min(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length ; i++){
            if (min>array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
