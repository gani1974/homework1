import java.util.Arrays;

//Условия для сортировки:
//        1) по цене. От 500 до 2000 долларов с шагом в 50
//        если цена равная, то
//        2) по кол-ву оперативной памяти (от 4 до 24 с шагом 4)
//        если памяти тоже равное количество, то 3) по производителю:
//        Lenuvo > Asos > MacNote > Eser > Xamiou

public class SelectionSort {
    public static void sortByPrice(Notebook[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            int max = arr.length-1;

            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j].getPrice() < arr[min].getPrice()) {
                    min = j;
                }
                if(arr[j].getPrice() > arr[max].getPrice()){
                    max = j;
                }
            }

            Notebook temp = null;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            Notebook temp1 = arr[arr.length-1];
            arr[arr.length-1] = arr[max];
            arr[max] = temp1;
        }
    }

    public static void sortByRAM(Notebook[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            int max = arr.length-1;

            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j].getRam() < arr[min].getRam()) {
                    min = j;
                }
                if(arr[j].getRam() > arr[max].getRam()){
                    max = j;
                }
            }

            Notebook temp = null;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            Notebook temp1 = arr[arr.length-1];
            arr[arr.length-1] = arr[max];
            arr[max] = temp1;
        }
    }

    public static void sortByManufacturer(Notebook[] arr) {
        String[] manufacturerName = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            int max = arr.length-1;

            for (int j = min + 1; j < arr.length; j++) {
                if (Arrays.asList(manufacturerName).indexOf(arr[j].getManufacturer()) <
                        Arrays.asList(manufacturerName).indexOf(arr[min].getManufacturer())) {
                    min = j;
                }
                if(Arrays.asList(manufacturerName).indexOf(arr[j].getManufacturer()) >
                        Arrays.asList(manufacturerName).indexOf(arr[max].getManufacturer())){
                    max = j;
                }
            }

            Notebook temp = null;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            Notebook temp1 = arr[arr.length-1];
            arr[arr.length-1] = arr[max];
            arr[max] = temp1;
        }
    }


}
