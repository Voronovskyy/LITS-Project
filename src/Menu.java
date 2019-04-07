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
                itemList.getFood().forEach(food -> System.out.println(food));
                text.hint();
            }else if(menu.equalsIgnoreCase("Drink")){
                itemList.getDrink().forEach(drink -> System.out.println(drink));
                text.hint();
            }else if(menu.equalsIgnoreCase("Household")){
                itemList.getHousehold().forEach(household -> System.out.println(household));
                text.hint();
            }else if(menu.equalsIgnoreCase("Electronics")) {
                itemList.getElectronics().forEach(electronics -> System.out.println(electronics));
                text.hint();
            }else if(menu.equals("M")){
                text.menuList();
            }else if (menu.equals("+")){
                String name = sc.nextLine();
                try {
                    Product addProduct = itemList.getByName(name);
                    System.out.println(addProduct);
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
                for(Product basketList: basket){
                    System.out.println(basketList);
                }
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

