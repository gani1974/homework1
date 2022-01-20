import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Notebook notebook = new Notebook();

//        for (int i = 0; i < 10; i++) {
//            Notebook notebook = new Notebook();
//        }

        final int SIZE = 10000;
        Notebook[] arr = MyArr.getArray(SIZE);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i].display();
//        }

        SpeedTest.startTime();

//        BubbleSort.sortByPrice(arr); //283
//        BubbleSort.sortByRAM(arr); //280
//        BubbleSort.sortByManufacturer(arr); //1112

        SelectionSort.sortByPrice(arr); //107
//        SelectionSort.sortByRAM(arr); //106
//        SelectionSort.sortByManufacturer(arr); //2442

        SpeedTest.endTime();

//        for (int i = 0; i < arr.length; i++) {
//            arr[i].display();
//        }

    }
}
