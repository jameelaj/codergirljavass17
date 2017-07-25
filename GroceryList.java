
/**
 * Write a description of class GroceryList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import static java.lang.System.out;
import java.util.Scanner;


public class GroceryList
{
   public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String item1, item2, item3;
        int quantityItem1, quantityItem2, quantityItem3;
        double priceItem1, priceItem2, priceItem3;
        double totalCost;
        
        
        out.println("List three items on your grocery list.");
        out.print("Item 1? ");
        item1 = keyboard.nextLine();
        out.print("\nItem 2? ");
        item2 = keyboard.nextLine();        
        out.print("\nItem 3? ");
        item3 = keyboard.nextLine();
        
        out.println("\nEnter the quantity of each item.");
        out.print("How many " + item1 +"? ");
        quantityItem1 = keyboard.nextInt();
        out.print("\nHow many " + item2 + "? ");
        quantityItem2 = keyboard.nextInt();
        out.print("\nHow many " + item3 + "? ");
        quantityItem3 = keyboard.nextInt();
        
        out.println("\nEnter the price of each item.");
        out.print("How much does one " + item1 + " cost? ");
        priceItem1 = keyboard.nextDouble();
        out.print("\nHow much does one " + item2 + " cost? ");
        priceItem2 = keyboard.nextDouble();
        out.print("\nHow much does one " + item3 + " cost? ");
        priceItem3 = keyboard.nextDouble();
        
        out.println("\nTotal grocery bill.");
        totalCost = quantityItem1 * priceItem1 + quantityItem2 * priceItem2 + quantityItem3 * priceItem3;
        out.printf("Your total cost is %.2f", totalCost );
        
        
    }
    
 
}


