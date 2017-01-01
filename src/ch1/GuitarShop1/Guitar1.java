package ch1.GuitarShop1;

/**
 * Created by private on 30/12/2016.
 */
public class Guitar1 {
    private GuitarSpec1 guitarSpec1;
    private String serialNumber;
    private double price;

    public Guitar1(String serialNumber, double price, GuitarSpec1 guitarSpec1) {
        this.guitarSpec1 = guitarSpec1;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public GuitarSpec1 getGuitarSpec1() {
        return guitarSpec1;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
