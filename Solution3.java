import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        //created list of books
        ArrayList<Book2> bookList1 = new ArrayList<Book2>();
        // taking user input by using Scanner class
        Scanner sc = new Scanner(System.in);
        // to add 10 books
        for (int i = 0; i < 1; i++) {
            //reading input from user
            String bookName = sc.nextLine();
            String author = sc.nextLine();
            long isbn = sc.nextLong();
            double price = sc.nextDouble();
            sc.nextLine();
            // creating book object using parameterized constructor
            Book2 book1 = new Book2(bookName,author,isbn,price);
            //adding bookmto list
            bookList1.add(book1);
        }
        //printing bookList using enhanced for loop
        System.out.println("books");
        for (Book2 book : bookList1) {
            System.out.println(book);

        }

        //sorting books by using Collections.sort() method
        //Collections.sort(bookList1);

        System.out.println("sorted book");
        for (Book2 book : bookList1) {
            System.out.println(book);

        }


    }
}
