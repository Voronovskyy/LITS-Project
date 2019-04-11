import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
   public void Run() {

        Text text = new Text();
        text.greet();

        ProductList productList = new ProductList();
        List<Product>basket = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String addProductToBasket ="You add this product to basket.";
        String emptyBasket = "Your basket is empty.";
        String wrongName = "Wrong name of product or command, please try again.";
        String categoryName = "Please type in the name of command, or name of the category from the list :";
        String TotalPrice = "Total price : ";
        String purchaseList = "Your purchase list :\n"+"=====================================";
        String addition = "=====================================";
        double totalPrice = 0;

        outerloop:

        while(true) {

            String menu = sc.nextLine();

            if(menu.equalsIgnoreCase("Food")) {
                productList.getFood().forEach(food -> System.out.println(food));
                text.hint();

                while (true){
                    String foodSectionScanner = sc.nextLine();
                    if (foodSectionScanner.equalsIgnoreCase("+")){
                        String name = sc.nextLine();
                        try {
                            Product addProduct = productList.getByNameFood(name);
                            System.out.println(addProductToBasket);
                            basket.add(addProduct);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                    else if (foodSectionScanner.equalsIgnoreCase("M")){
                        System.out.println(categoryName);
                        text.menuList();
                        break;
                    }
                    else if (foodSectionScanner.equalsIgnoreCase("Basket")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        } else {
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                            }
                        }
                    }else if (foodSectionScanner.equalsIgnoreCase("Exit")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        }
                        else {
                            System.out.println(purchaseList);
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                                totalPrice += basketList.getPrice();
                            }
                            System.out.println(addition);
                            System.out.println(TotalPrice+totalPrice+" UAH");
                            basket.clear();
                            text.bye();
                            break outerloop;
                        }
                    }
                    else {
                        System.out.println(wrongName);
                    }
                }

            }else if(menu.equalsIgnoreCase("Drink")){
                productList.getDrink().forEach(drink -> System.out.println(drink));
                text.hint();

                while (true){
                    String drinkSectionScanner = sc.nextLine();
                    if (drinkSectionScanner.equalsIgnoreCase("+")){
                        String name = sc.nextLine();
                        try {
                            Product addProduct = productList.getByNameDrink(name);
                            System.out.println(addProductToBasket);
                            basket.add(addProduct);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                    else if (drinkSectionScanner.equalsIgnoreCase("M")){
                        System.out.println(categoryName);
                        text.menuList();
                        break;
                    }
                    else if (drinkSectionScanner.equalsIgnoreCase("Basket")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        } else {
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                            }
                        }
                    }else if (drinkSectionScanner.equalsIgnoreCase("Exit")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        }
                        else {
                            System.out.println(purchaseList);
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                                totalPrice += basketList.getPrice();
                            }
                            System.out.println(addition);
                            System.out.println(TotalPrice+totalPrice+" UAH");
                            basket.clear();
                            text.bye();
                            break outerloop;
                        }
                    }
                    else {
                        System.out.println(wrongName);
                    }
                }

            }else if(menu.equalsIgnoreCase("Household")){
                productList.getHousehold().forEach(household -> System.out.println(household));
                text.hint();

                while (true){
                    String householdSectionScanner = sc.nextLine();
                    if (householdSectionScanner.equalsIgnoreCase("+")){
                        String name = sc.nextLine();
                        try {
                            Product addProduct = productList.getByNameHouseHold(name);
                            System.out.println(addProductToBasket);
                            basket.add(addProduct);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                    else if (householdSectionScanner.equalsIgnoreCase("M")){
                        System.out.println(categoryName);
                        text.menuList();
                        break;
                    }
                    else if (householdSectionScanner.equalsIgnoreCase("Basket")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        } else {
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                            }
                        }
                    }else if (householdSectionScanner.equalsIgnoreCase("Exit")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        }
                        else {
                            System.out.println(purchaseList);
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                                totalPrice += basketList.getPrice();
                            }
                            System.out.println(addition);
                            System.out.println(TotalPrice+totalPrice+" UAH");
                            basket.clear();
                            text.bye();
                            break outerloop;
                        }
                    }
                    else {
                        System.out.println(wrongName);
                    }
                }

            }else if(menu.equalsIgnoreCase("Electronics")) {
                productList.getElectronics().forEach(electronics -> System.out.println(electronics));
                text.hint();

                while (true){
                    String electronicSectionScanner = sc.nextLine();
                    if (electronicSectionScanner.equalsIgnoreCase("+")){
                        String name = sc.nextLine();
                        try {
                            Product addProduct = productList.getByNameElectronics(name);
                            System.out.println(addProductToBasket);
                            basket.add(addProduct);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                    else if (electronicSectionScanner.equalsIgnoreCase("M")){
                        System.out.println(categoryName);
                        text.menuList();
                        break;
                    }
                    else if (electronicSectionScanner.equalsIgnoreCase("Basket")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        } else {
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                            }
                        }
                    }else if (electronicSectionScanner.equalsIgnoreCase("Exit")){
                        if(basket.isEmpty()){
                            System.out.println(emptyBasket);
                        }
                        else {
                            System.out.println(purchaseList);
                            for (Product basketList : basket) {
                                System.out.println(basketList);
                                totalPrice += basketList.getPrice();
                            }
                            System.out.println(addition);
                            System.out.println(TotalPrice+totalPrice+" UAH");
                            basket.clear();
                            text.bye();
                            break outerloop;
                        }
                    }
                    else {
                        System.out.println(wrongName);
                    }
                }

            }else if(menu.equalsIgnoreCase("Basket")){
                if(basket.isEmpty()){
                    System.out.println(emptyBasket);
                } else {
                    for (Product basketList : basket) {
                        System.out.println(basketList);
                    }
                }
            }else if (menu.equals("-")){
                String name = sc.nextLine();
                try {
                    if (basket.isEmpty()){
                        System.out.println("Sorry your basket is empty and there is nothing to remove.");
                    }
                    else {
                        Product removeProductFromBasket = productList.getByNameAllSections(name);
                        System.out.println("You've removed " + name + " from the basket.");
                        basket.remove(removeProductFromBasket);
                        ((ArrayList<Product>) basket).trimToSize();
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }else if(menu.equalsIgnoreCase("Exit")){
                if(basket.isEmpty()){
                    System.out.println(emptyBasket);
                    text.bye();
                    break;
                } else {
                    System.out.println(purchaseList);
                    for (Product basketList : basket) {
                        System.out.println(basketList);
                        totalPrice += basketList.getPrice();
                    }
                    System.out.println(addition);
                    System.out.println(TotalPrice+totalPrice+" UAH");
                    basket.clear();
                    text.bye();
                    break;
                }
            }else{
                System.err.println("No such directory. Please try again");
            }
        }
        sc.close();
    }
}
