import java.util.Scanner;

public class myCollection
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Item[] myArray = new Item[5];
        String userInput, bookName, bookAuthor, periodicalName;
        long bookISBN;
        int periodicalIssue;
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Please enter B for Book or P for Periodical");
            userInput = scan.next();
            scan.nextLine();
            if (userInput.equals("B"))
            {
                System.out.println("Please enter the name of the Book");
                bookName = scan.nextLine();
                System.out.println("Please enter the author of the Book");
                bookAuthor = scan.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                bookISBN = scan.nextLong();
                scan.nextLine();
                Book myBook = new Book(bookName, bookISBN, bookAuthor);
                myArray[i] = myBook;
            }
            if (userInput.equals("P"))
            {
                System.out.println("Please enter the name of Periodical");
                periodicalName = scan.nextLine();
                System.out.println("Please enter the issue number");
                periodicalIssue = scan.nextInt();
                scan.nextLine();
                Periodical myPeriodical = new Periodical(periodicalIssue, periodicalName);
                myArray[i] = myPeriodical;
            }
        }
        System.out.println("Your Items:");
        for (Item i:myArray)
        {
            System.out.println(i.getListing());
            System.out.println();
        }
    }
}
