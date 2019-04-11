public class Text {
    public void greet(){
        System.out.println("Hello Dear Customer!" + " Welcome to our shop!");
        System.out.println("If you want buy something, please type in the name of the category from the list :\n");
        System.out.println("=======================================");
        System.out.println("FOOD\tDRINK\tHOUSEHOLD\tELECTRONICS");
        System.out.println("=======================================\n");
        System.out.println("Type \"Basket\" to see you purchase list." );
        System.out.println("Type \"Exit\" finish you shopping.");
        System.out.println("To remove an Item from basket type \"-\", than press \"Enter\" and type the name of the Item.\n" );
    }
    public void menuList(){
        System.out.println("=======================================");
        System.out.println("FOOD\tDRINK\tHOUSEHOLD\tELECTRONICS");
        System.out.println("=======================================");
    }
    public void hint(){
        System.out.println("\n"+"For come back to main menu type \"M\" " );
        System.out.println("To add an Item type \"+\", than press \"Enter\" and type the name of the Item. " );
        System.out.println("Type \"Basket\" to see your purchase list. " );
        System.out.println("Type \"Exit\" finish you shopping.");
    }
    public void bye(){
        System.out.println("Bye! Thank you for shopping with us!");
        System.out.println("We'll be glad to see you again!");
    }
}
