//public class myException {
//
//
//    public static int divide(int x,int y)
//    {
//        if(y<=0)
//        {
//            throw new ArithmeticException();
//
//        }
//        return x/y;
//    }
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
////int v1=7,v2=3;
//
//         try {
//             System.out.println(divide(3, 0));
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Not divide by 0");
//         }
//
//        //e.printStackTrace();
//        //System.out.println(e+ "hello dont provide denominator as zero");
//    }
//
//
//
//
//}


public class Exception1 {

    int Add(int x[]) throws Exception
    {

        x = new int[4];
        int sum=0;
        for(int i=0;i<=4;i++)
        {
            x[i]=i;
            sum = sum + x[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int y[]=new int[5];
        Exception1 ex1=new Exception1();
        try {
            System.out.println(ex1.Add(y));


        }
        catch(Exception e)
        {

        }
    }

}