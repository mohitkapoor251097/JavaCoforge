import java.util.Scanner;

class MyFirstException extends Exception
{
    MyFirstException(String message)
    {
        System.out.println(message);
    }
}
public class Excepti {
    public static void main(String[] args) {
       long a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        a=sc.nextInt();
        System.out.println("Enter Number 2:");
        b=sc.nextInt();
        long sum = a + b;
       if(sum<150)
       {
           try {
               throw new MyFirstException("Custom Exception");
           }
           catch(Exception e)
           {
              // System.out.println(e.printStackTrace());
           }
       }
       else {
           System.out.println("The Sum is "+sum);
       }
    }
}
