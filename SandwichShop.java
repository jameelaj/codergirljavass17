import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop
{
    
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      int goalForVeggies = 50;
      int goalForBurgers = 250;
      int goalForSubs = 100;
      int goalForSoup = 70;
      out.println("Checking sales goals.");
      out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
      out.println("How many veggie sandwiches were sold today?");
      int veggiesSold = keyboard.nextInt();
      if (veggiesSold >= goalForVeggies ) 
      {   
          out.println ("Made goal for veggie sandwiches.");
        }
      else
      {   
          out.println ("Fell short of goal for veggie sandwiches.");  
        }
      out.println("The sales goal for bugers is " + goalForBurgers);
      out.println("How many burgers were sold today?");
      int burgersSold = keyboard.nextInt();
      if (burgersSold >= goalForBurgers)
      {out.println ("Made goal for burgers.");
        }
        else
        {
            out.println("Fell short of goal for burgers.");
        }
      out.println("The sales goal for sub sandwiches is " + goalForSubs);
      out.println("How many sub sandwiches were sold today?");
      int subsSold = keyboard.nextInt();
      if (subsSold >= goalForSubs ) 
      {   
          out.println ("Made goal for sub sandwiches.");
        }
      else
      {   
          out.println ("Fell short of goal for sub sandwiches.");  
        }
      out.println("The sales goal for soup is " + goalForSoup);
      out.println("How many soups were sold today?");
      int soupSold = keyboard.nextInt();
      if (soupSold >= goalForSoup ) 
      {   
          out.println ("Made goal for soup.");
        }
      else
      {   
          out.println ("Fell short of goal for soup.");  
        }
         
      if (veggiesSold >= goalForVeggies && burgersSold >= goalForBurgers && subsSold >= goalForSubs  && soupSold>= goalForSoup)
      {
          out.println ("Made goal for everything!");
        }
        else
        {
        }
    }

}
 

