import java.util.Random;

public class MyArr {

    private final Notebook[] arr;
    private final int size;

    public MyArr(int size) {
        this.size = size;
        this.arr = new Notebook[size];
    }

    public boolean find(String search){
        int i;
        for (i = 0; i < this.size; i++) {
            if(this.arr[i].getManufacturer().equals(search)) break;
        }
        if (i == this.size)
            return false;
        else
            return true;
    }

    public void display(){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i].getManufacturer() + " "
                    + arr[i].getPrice() + " " + arr[i].getRam());
        }
    }

    public static Notebook[] getArray(int length) {
        Notebook[] arr = new Notebook[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new Notebook();
//            System.out.println(arr[i].getManufacturer() + " "
//                    + arr[i].getPrice() + " " + arr[i].getRam());
        }
        return arr;
    }

//    private static void swap(Notebook[] a, int i, int change) {
//        int temp = a[i];
//        a[i] = a[change];
//        a[change] = temp;
//    }
}
