import static java.lang.System.out;
import java.util.Scanner;
public class MailMerge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String donorName= " ";
        float donationAmount;
        boolean keepGoing = true;

        out.println("---Thank You Letters---");
        while (keepGoing == true)
        {
            out.println("Please enter the donor's first and last name. Please enter \"quit\" to end the program.");
            donorName = keyboard.nextLine();

            if (donorName.equals ("quit")) 
            {
                keepGoing = false;
            } 
            else 
            {

                out.println("");
                out.println("Please enter donation amount without $ sign");
                donationAmount = keyboard.nextFloat();
                keyboard.nextLine();

                System.out.println("Dear " + donorName + ",");
                System.out.println("");
                System.out.println("Thank you for your donation! We rely on donors like you to keep our");
                System.out.println("organization effective, and you came through for us. Your donation of $" + donationAmount);
                System.out.println("will help our efforts to make a difference in the world.");
                System.out.println("");
                System.out.println("As you may know, we are a registered non-profit organization, so your");
                System.out.println("donation is tax deductible. You may use this letter as a receipt for tax purposes");
                System.out.println("");
                System.out.println("Thank you again for your support!");
                System.out.println("");
                System.out.println("Sincerely,");
                System.out.println("Paula Jones");
                System.out.println("YourCharity.org");

            }

        }
    }
}
