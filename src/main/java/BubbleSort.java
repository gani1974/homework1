import java.util.Arrays;

//Условия для сортировки:
//        1) по цене. От 500 до 2000 долларов с шагом в 50
//        если цена равная, то
//        2) по кол-ву оперативной памяти (от 4 до 24 с шагом 4)
//        если памяти тоже равное количество, то 3) по производителю:
//        Lenuvo > Asos > MacNote > Eser > Xamiou

public class BubbleSort {
    public static void sortByPrice(Notebook[] arr) {

        int limit = arr.length;
        boolean isChange;

        do {
            limit--;
            isChange  = false;

            for (int i = 0; i < limit; i++) {
                if (arr[i].getPrice() > arr[i + 1].getPrice()) {
                    Notebook temp = null;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    isChange = true;
                }
            }
        } while (isChange);
    }

    public static void sortByRAM(Notebook[] arr) {

        int limit = arr.length;
        boolean isChange;

        do {
            limit--;
            isChange  = false;

            for (int i = 0; i < limit; i++) {
                if (arr[i].getRam() > arr[i + 1].getRam()) {
                    Notebook temp = null;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    isChange = true;
                }
            }
        } while (isChange);
    }

    public static void sortByManufacturer(Notebook[] arr) {

        int limit = arr.length;
        boolean isChange;

        String[] manufacturerName = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

        do {
            limit--;
            isChange  = false;

            for (int i = 0; i < limit; i++) {
                if (Arrays.asList(manufacturerName).indexOf(arr[i].getManufacturer()) > Arrays.asList(manufacturerName).indexOf(arr[i+1].getManufacturer())) {
                    Notebook temp = null;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    isChange = true;
                }
            }

//            System.out.println(limit + " " + Arrays.toString(arr));
        } while (isChange);
    }
}
