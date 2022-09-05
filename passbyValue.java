class Product
{
    double price;
    public  Product()
    {

    }
    public Product(double pr)
    {
        this.price=pr;
    }
    public void setPrice(double price)
    {
        System.out.println("price is:" + price);
    }

}
public class passbyValue {
    public static void changePrice(Product price)
    {
        price=new Product(555.45);
        System.out.println(price.price);
    }
//    public static void modifiedPrice(Product pr)
//    {
//        pr.setPrice(1000.33);
//        System.out.println(pr.price);
//    }
    public static void main(String[] args) {
        Product probj=new Product();
       // double p;
        probj.setPrice(400.78);
        passbyValue.changePrice(probj);
    }
}

