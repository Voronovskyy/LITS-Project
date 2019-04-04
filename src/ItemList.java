import java.util.ArrayList;
import java.util.List;



public class ItemList {
    private List<Product> food;
    private List<Product> drink;
    private List<Product> household;
    private List<Product> electronics;

    public ItemList() {
        List<Product> food = new ArrayList<>();
        food.add(new Product("Bread", 10.50));
        food.add(new Product("Chicken", 49.80));
        food.add(new Product("Egg", 2.50));
        food.add(new Product("Sausage", 39.40));
        food.add(new Product("Cheese", 90.99));
        food.add(new Product("Butter", 25.25));
        food.add(new Product("Apple", 3.50));
        food.add(new Product("Banana", 12.50));
        food.add(new Product("Chocolate", 30.25));
        food.add(new Product("Carrot", 4.50));
        this.food = food;

        List<Product> drink = new ArrayList<>();
        drink.add(new Product("Jameson", 249.99));
        drink.add(new Product("Ballantine's", 333.99));
        drink.add(new Product("Ricard", 355.25));
        drink.add(new Product("Absolut", 199.59));
        drink.add(new Product("Bacardi", 244.59));
        drink.add(new Product("Smirnoff", 199.99));
        drink.add(new Product("Jack Daniel’s", 499.99));
        drink.add(new Product("Hennessy", 549.85));
        drink.add(new Product("Johnnie Walker", 650.50));
        drink.add(new Product("Moutai", 210.50));
        this.drink = drink;

        List<Product> household = new ArrayList<>();
        household.add(new Product("Domestos", 47.50));
        household.add(new Product("Galla", 19.99));
        household.add(new Product("Vanish", 57.45));
        household.add(new Product("Tide", 119.30));
        household.add(new Product("Fairy", 25.25));
        household.add(new Product("Calgon", 58.90));
        household.add(new Product("Pronto", 39.99));
        household.add(new Product("Ariel", 75.50));
        household.add(new Product("Bref", 46.70));
        household.add(new Product("Persil", 77.30));
        this.household = household;

        List<Product> electronics = new ArrayList<>();
        electronics.add(new Product("Heaphones", 250.99));
        electronics.add(new Product("Washing Mashine", 8599));
        electronics.add(new Product("Iron", 950));
        electronics.add(new Product("Mixer", 1500.50));
        electronics.add(new Product("Fridge", 12900));
        electronics.add(new Product("Freeze", 7800));
        electronics.add(new Product("Microwave Oven", 3300));
        electronics.add(new Product("Smartphone", 5900));
        electronics.add(new Product("Laptop", 23000));
        electronics.add(new Product("Hair Dryer", 900));
        this.electronics = electronics;
    }

    public List<Product> getFood() {
        return food;
    }  // displays list of food

    public void setFood(List<Product> food) {
        this.food = food;
    }

    public List<Product> getDrink() {
        return drink;
    }  // displays list of drink

    public void setDrink(List<Product> drink) {
        this.drink = drink;
    }

    public List<Product> getHousehold() {
        return household;
    }  // displays list of household products

    public void setHousehold(List<Product> household) {
        this.household = household;
    }

    public List<Product> getElectronics() {
        return electronics;
    }  // displays list of electronics

    public void setElectronics(List<Product> electronics) {
        this.electronics = electronics;
    }

    public Product getByName(String name) throws Exception {
        Product result = null;
        for (Product product : this.food) {
            if (name.equals(product.getName())) {
                result = product;
            }
        }  // iterates through the food list and gets product by name
        for (Product product : this.drink) {
            if (name.equals(product.getName())) {
                result = product;
            }
        }  // iterates through the drink list and gets product by name
        for (Product product : this.household) {
            if (name.equals(product.getName())) {
                result = product;
            }
        }  // iterates through the household list and gets product by name
        for (Product product : this.electronics) {
            if (name.equals(product.getName())) {
                result = product;
            }
        }  // iterates through the electronics list and gets product by name
        if (result == null) {

            throw new Exception("Product not found!!! Please, try again");
        } else {
            return result;


        }
    }
}


