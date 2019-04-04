import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Text t = new Text();
        t.greet();
        ItemList i = new ItemList();
        List<Product>basket = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            String menu = sc.nextLine();

            if(menu.equalsIgnoreCase("Food")) {
                i.getFood().forEach(food -> System.out.println(food));
                t.hint();
            }else if(menu.equalsIgnoreCase("Drink")){
                i.getDrink().forEach(drink -> System.out.println(drink));
                t.hint();
            }else if(menu.equalsIgnoreCase("Household")){
                i.getHousehold().forEach(household -> System.out.println(household));
                t.hint();
            }else if(menu.equalsIgnoreCase("Electronics")) {
                i.getElectronics().forEach(electronics -> System.out.println(electronics));
                t.hint();
            }else if(menu.equals("M")){
                t.menuList();
            }else if (menu.equals("+")){
                String name = sc.nextLine();
                try {
                    Product p = i.getByName(name);
                    System.out.println(p);
                    basket.add(p);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }

            }else if(menu.equalsIgnoreCase("Basket")){
                for(Product n: basket){
                    System.out.println(n);
                }
            }else if(menu.equalsIgnoreCase("Exit")){
                for(Product n: basket){
                    System.out.println(n);
                }
                t.bye();
                break;
            }else{
                System.out.println("No such directory. Please try again");
            }
        }
        sc.close();
    }
}

