import java.util.Objects;

public class Product {

    private String name;

    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product person = (Product) o;
        return getPrice() == person.getPrice() &&
                getName().equals(person.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    public String toString() {
        return this.name + "   " + this.price ;
    }
}

