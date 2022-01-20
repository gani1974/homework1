import java.util.Random;

public class Notebook {

    private final String manufacturer;
    private final int price;
    private final int ram;

    Random random = new Random();

    private static final String[] manufacturerName = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

    public Notebook () {
        this.manufacturer = manufacturerName[random.nextInt(manufacturerName.length)];
        this.price = 100 + (int)(Math.random() * 5000);
        this.ram = 1 + (int)(Math.random() * 1024);
    }

    public Notebook(String manufacturer, int price, int ram) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.ram = ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public void display(){
        System.out.printf("Manufacturer: %-10s Price: %-10s RAM: %-10s\n", this.getManufacturer(),
                this.getPrice(), this.getRam());
    }

}
