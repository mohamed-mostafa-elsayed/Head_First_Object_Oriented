public class Guitar {
    private String serialNUmber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNUmber, double price, GuitarSpec guitarSpec) {
        this.serialNUmber = serialNUmber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNUmber() {
        return serialNUmber;
    };

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    };

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
