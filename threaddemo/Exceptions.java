package threaddemo;

import static threaddemo.MyException.name;

class MyException extends Exception
{
    public static void name(String name) throws Exception {
        if(name.length()<2)
        {
            throw new Exception("Name is less than 2");
        }
        else
        {
            System.out.println("Name is valid");
        }

    }
}
public class Exceptions extends  Exception{
    static int age;
    public Exceptions(int age)
    {
        super(String.valueOf(age));
    }
    public static boolean ageval(int age) throws  Exception {
        if (age < 18) {
            throw new Exception("Age is Invalid");
        } else {
            System.out.println(" age is valid");
        }
        return false;
    }
    public static void main(String[] args) throws  Exception{
        name("Mohit");
        ageval(19);
        ageval(15);


    }
}
