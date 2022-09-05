import java.util.Scanner;
class Book
{
    int x;
    int mfgid;
    String barcode;
    int noofpages;
    String title;
    String author;
    double price;



    public void Addbook_to_library()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("do you want to add the books to library? yes  or no");
        String choice=sc.next();
        if(choice.equals("yes")) {
            System.out.println("Enter the book details, mfgid,barcode,noofpages,title,author,price");
            System.out.println("Enter the mfid");
            mfgid = sc.nextInt();
            System.out.println("Enter the barcode");
            barcode = sc.next();
            System.out.println("Enter the noofpages");
            noofpages = sc.nextInt();
            System.out.println("Enter the title");
            title=sc.next();
            System.out.println("Enter the author");
            author=sc.next();
            System.out.println("Enter the price");
            price=sc.nextDouble();
            System.out.println("The Book details are ");
            System.out.println(mfgid);
            System.out.println(barcode);
            System.out.println(noofpages);
            System.out.println(title);
            System.out.println(author);
            System.out.println(price);
        }

        else{
            System.out.println("no books to add");
        }

    }
    public void listlibrarybook()
    {
        System.out.println(mfgid);
        System.out.println(barcode);
        System.out.println(noofpages);
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public void show(int x)
    {
        System.out.println(x);
    }
    public void addBook_to_Sale()
    {


    }
}

public class Book1
{
    public static void main(String[] args) {
        Book bobj=new Book();
        bobj.Addbook_to_library();
        bobj.listlibrarybook();
        bobj.show(89);
        System.out.println(bobj.x);
    }
}




//import javax.print.attribute.standard.NumberOfInterveningJobs;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Book {
//    int mfgid;
//    String barcode;
//    int noofpages;
//    String title;
//    String author;
//    double price;
//    public void Addbook_to_library()
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your choce yes or no");
//        String ch=sc.nextLine();
//        if(ch.equals("yes")) {
//            System.out.println("Enter mfid");
//            mfgid = sc.nextInt();
//
//            System.out.println("Enter barcode");
//            barcode = sc.nextLine();
//            sc.next();
//            System.out.println("Enter titl");
//            title = sc.nextLine();
//            sc.next();
//            System.out.println("Enter author");
//            author = sc.nextLine();
//            sc.next();
//            System.out.println("Enter price");
//            price = sc.nextDouble();
//        }
//        else {
//            System.out.println("No");
//        }
//
//
//
//
//
//
//    }
//    public void listlibrarybook() {
//
//    }
//
//    public void addBokk_toSale()
//    {
//        System.out.println(mfgid);
//    }
//
//    public static void main(String[] args) {
//        Book b=new Book();
//        b.Addbook_to_library();
//        b.addBokk_toSale();
//    }
//}
