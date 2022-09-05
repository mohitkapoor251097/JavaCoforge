//class parent1
//{
//  int a=67;
//}
//class child1 extends  parent1
//{
//     public  int sum() {
//        int b = 89;
//        int c=a+b;
//        return  c;
//      //  System.out.println(c);
//    }
//}
public class inheritanceDEmo extends child1 {
    public static void main(String[] args) {
      child1 c=new child1();
        System.out.println(c.sum());
       inheritanceDEmo i=new inheritanceDEmo();
       System.out.println(i.sum());

    }
}
