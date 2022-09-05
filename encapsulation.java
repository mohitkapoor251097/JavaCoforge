
class Account{
    int acno;
    private double balance=7000.45;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void display()
    {
        System.out.println(balance);
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Account  acob=new Account();
        //acob.display();
        acob.display();
        acob.setBalance(5000);
        System.out.println(acob.getBalance());
        acob.display();
    }
}
