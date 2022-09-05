import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
//        int x[]=new int[]{1,2,4,6};
//        System.out.println(x[0]);
//        System.out.println("Length is "+ x.length);
////        for(int i:x)
////        {
////            System.out.println(i);
////
////        }
//        for(int i=0;i<x.length;i++)
//        {
//            System.out.print(x[i]+"\t");
//           // System.out.print(",");
//        }


//        String name[]=new String[]{"Delhi","Panipat","Karnal","Ambala"};
//        for(String city:name)
//        {
//            System.out.print(city+"\t");
//        }
//        System.out.print("\n"+"Total City :"+name.length);
//    }
//}

//        int id[]=new int[]{1,2,3,5,6};
//        String name[] =new String[]{"abc","cde","ggg","jkj","kyu"};
//        double eng[]=new double[]{67,89,78,67,80};
//        double hindi[]=new double[]{67,89,78,67,80};
//        double phy[]=new double[]{67,89,78,67,80};
//        double chem[]=new double[]{67,89,78,67,80};
//        double bio[]=new double[]{67,89,78,67,80};
//        double maths[]=new double[]{67,89,78,67,80};
//        double total[];
//        System.out.println("Roll No" + "\t\t" + "Name" + "\t\t" + "Eng" + "\t\t" +"Hindi" +"\t\t" + "\t\t" +"Phy" +"\t\t" + "Chem" + "\t\t" + "Bio" + "\t\t" + "Maths"+"\t\t" + "Total"+"\t\t"+"AVG");
//        System.out.println("============================================================================================================================================");
//
//        for(int i=0;i<=4;i++)
//        {
//
//            System.out.println(id[i] + "\t\t" + name[i] + "\t\t" + eng[i] + "\t\t" + hindi[i] +"\t\t" +phy[i] +"\t\t" + chem[i] + "\t\t" + bio[i] + "\t\t" +maths[i]+"\t\t" +
//                    (eng[i]+hindi[i] +phy[i]+chem[i]+bio[i]+maths[i]) + ((eng[i]+hindi[i] +phy[i]+chem[i]+bio[i]+maths[i])/6));
//        }


























        System.out.println("Enter No of Student Records.....");
        Scanner sc=new Scanner(System.in);
        int rec=sc.nextInt();
        int roll[]=new int[rec];
        String name[]=new String[rec];
        double eng[]=new double[rec];
        double hin[]=new double[rec];
        double phy[]=new double[rec];
        double che[]=new double[rec];
        double bio[]=new double[rec];
        double math[]=new double[rec];
        double total[];



        for(int i=0;i<rec;i++) {
            try {
                System.out.println("Enter Roll No :");
                roll[i] = sc.nextInt();
                System.out.println("Enter Name :");
                name[i] = sc.next();
                System.out.println("Enter English Marks:");
                eng[i] = sc.nextDouble();
                System.out.println("Enter Hindi Marks:");
                hin[i] = sc.nextDouble();
                System.out.println("Enter Physics Marks:");
                phy[i] = sc.nextDouble();
                System.out.println("Enter ChemisytryMarks:");
                che[i] = sc.nextDouble();
                System.out.println("Enter Bio Marks:");
                bio[i] = sc.nextDouble();
                System.out.println("Enter math Marks:");
                math[i] = sc.nextDouble();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please Enter Valid Input");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("Roll No" + "\t\t" + "Name" + "\t\t" + "Eng" + "\t\t" +"Hindi" +"\t\t" + "\t\t" +"Phy" +"\t\t" + "Chem" + "\t\t" + "Bio" + "\t\t" + "Maths"+"\t\t" + "Total"+"\t\t"+"AVG");
        System.out.println("============================================================================================================================================");
        System.out.println("Enter Roll No for Search");
//    int rollno1=sc.nextInt();
//    sc.next();
//        for(int i=0;i<rec;i++) {
//            if (rollno1==roll[i]) {
//                System.out.println(roll[i] + "\t\t" + name[i] + "\t\t" + eng[i] + "\t\t" + hin[i] + "\t\t" + phy[i] + "\t\t" + che[i] + "\t\t" + bio[i] + "\t\t" + math[i] + "\t\t" +
//                        (eng[i] + hin[i] + phy[i] + che[i] + bio[i] + math[i]) + "\t" + ((eng[i] + hin[i] + phy[i] + che[i] + bio[i] + math[i]) / 6));
//            }
//        }
        for(int i=0;i<rec;i++)
        {

            System.out.println(roll[i] + "\t\t" + name[i] + "\t\t" + eng[i] + "\t\t" + hin[i] +"\t\t" +phy[i] +"\t\t" + che[i] + "\t\t" + bio[i] + "\t\t" +math[i]+"\t\t" +
                    (eng[i]+hin[i] +phy[i]+che[i]+bio[i]+math[i]) + "\t"+((eng[i]+hin[i] +phy[i]+che[i]+bio[i]+math[i])/6));
        }






    }
}
