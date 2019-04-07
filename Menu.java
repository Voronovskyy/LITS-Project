import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Text text = new Text();
        text.greet();
        ItemList itemList = new ItemList();
        List<Product>basket = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {
            String menu = sc.nextLine();

            if(menu.equalsIgnoreCase("Food")) {
                text.header();
                itemList.getFood().forEach(food -> System.out.println(food));
                text.footer();
                text.hint();
            }else if(menu.equalsIgnoreCase("Drink")){
                text.header();
                itemList.getDrink().forEach(drink -> System.out.println(drink));
                text.footer();
                text.hint();
            }else if(menu.equalsIgnoreCase("Household")){
                text.header();
                itemList.getHousehold().forEach(household -> System.out.println(household));
                text.footer();
                text.hint();
            }else if(menu.equalsIgnoreCase("Electronics")) {
                text.header();
                itemList.getElectronics().forEach(electronics -> System.out.println(electronics));
                text.footer();
                text.hint();
            }else if(menu.equals("M")){
                text.menuList();
            }else if (menu.equals("+")){
                String name = sc.nextLine();
                try {
                    Product addProduct = itemList.getByName(name);

                    System.out.println("You're adding " + name + " to the basket.");

                    basket.add(addProduct);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }else if (menu.equals("-")){
                String name = sc.nextLine();
                try {
                    Product removeProduct = itemList.getByName(name);
                    System.out.println(removeProduct);
                    basket.remove(removeProduct);
                    ((ArrayList<Product>) basket).trimToSize();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            else if(menu.equalsIgnoreCase("Basket")){
                text.header();
                for(Product basketList: basket){
                    System.out.println(basketList);
                  }
                text.footer();
            }else if(menu.equalsIgnoreCase("Exit")){
//                for(Product basketList: basket){
//                    System.out.println(basketList);
//                }
                basket.clear();
                text.bye();
                break;
            }else{
                System.err.println("No such directory. Please try again");
            }
        }
        sc.close();
    }
}

