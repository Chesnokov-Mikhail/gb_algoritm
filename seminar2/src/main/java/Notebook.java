import java.util.Objects;

public class Notebook implements Comparable<Notebook> {

    public Notebook(double price, int ram, Brand brand) {
        this.price = price;
        this.ram = ram;
        if (brand == null) {

        }
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand=" + brand +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Double.compare(notebook.price, price) == 0 && ram == notebook.ram && brand == notebook.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, ram, brand);
    }

    @Override
    public int compareTo(Notebook o) {
        return Double.compare(this.price,o.price);
    }

    enum Brand {
        Lenuvo, Asos, MacNote, Eser, Xamiou
    }
    private double price;
    private int ram;
    private Brand brand;

}

