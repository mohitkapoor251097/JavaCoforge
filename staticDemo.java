class demo
{
    int x;
    static int y;
    public demo()
    {
       x++;
        System.out.println(x);
      y++;
       System.out.println(y);
    }
}
public class staticDemo {
    public static void main(String[] args) {
        demo d=new demo();
        demo d1=new demo();
        demo d2=new demo();
        demo d3=new demo();
    }
}
//https://github.com/dameeta/JavaRepo/tree/main
