import java.util.Scanner;

public class inputuser {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {

        System.out.println("Enter Number 1:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter Number 1:");
        int b=sc.nextInt();
        System.out.println("Enter Choose 1[add] 2[sub]");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("The Sum of " +a+ " and " +b + add(a,b));
                break;
            case 2:
               // System.out.println(sub(a,b));
                System.out.println("The Sum of " +a+" and "+b + sub(a,b));
                break;
            default:
                System.out.println("Option Not Exist");
        }

    }
}




