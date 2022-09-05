////class parent{
////    protected int id;
////    public void parentdisplay()
////    {
////        id=89;
////        System.out.println("parent method "+id);
////    }
////    public void childdisplay()
////    {
////        id=8900;
////        System.out.println("parent method "+id);
////    }
////}
////class child extends  parent
////{
////
////    public void childdisplay()
////    {
////        id=78;
////        System.out.println(" child method "+id);
////    }
////}
////public class inheritance {
////    public static void main(String[] args) {
////        child c=new child();
////        c.parentdisplay();
////        c.childdisplay();
////        parent b=new child();
////        b.parentdisplay();
////        b.childdisplay();
////
////    }
////}
//class parent
//{
//    protected int a,b,c,d;
//    void pdisply(int c,int d)
//    {
//        System.out.println(c+d);
//    }
//}
//class child extends parent{
//    void display(int a,int b,int c,int d)
//    {
//        super.pdisply(c,d);
//        int sum=a+b;
//        System.out.println(sum);
//    }
//}
//public class inheritance{
//    public static void main(String[] args) {
//        child c=new child();
//        c.display(5,7,8,9);
//    }
//}

class Add{
   public void sum()
    {
        System.out.println("hello");
    }
}
class Sub extends Add
{
    public  void sub(int a,int b)
    {
        System.out.println("sub "+(a-b));
    }
}
// class div extends Sub
//{
//    public  void div(int a,int b)
//    {
//         super.sub(a,b);
//        System.out.println(a/b);
//    }
//}
//
//public class inheritance{
//   public static void main(String[] args) {
//      div d=new div();
//      d.div(8,4);
//
//
//
//    }
//}
//

//interface m
//{
//    public abstract void k();
//}
abstract class car1
{
    abstract void model();
    abstract void  engine();
    void display()
    {
        System.out.println("display");
    }
}
class design extends car1
{
    @Override
    void model() {
        System.out.println("model");
    }

    @Override
    void engine() {
        System.out.println("engine");
    }
}
public class inheritance {
    public static void main(String[] args) {
      design d=new design();
      d.model();
      d.engine();
      d.display();
    }
}