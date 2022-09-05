package com.practice;
import java.util.Scanner;
public class Menu {
    public static void Menu()
    {
       char c=0;
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Do You Want to Place Order Y or N");
        c=sc.next().charAt(0);
        int sr[]=new int[]{1,2,3,4};
        String menu[]=new String[]{"Phoa","Idli","Wada Pav","Alu Paratha"};
        String qty[]=new String[]{"1 Plate","1 Plate","1 Plate","1 Plate"};
        int rate[]=new int[]{50,60,30,60};
        while(c=='y')
        {
            System.out.println("1 Snaks");
            System.out.println("2 Lunch");
            System.out.println("3 Dinner");
            System.out.println("4 Soft Drink/Tea");
            System.out.println("Enter the Item from below list");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("SrNo"+"\t+"+"Menu Item"+"\t\t"+"qty"+"\t\t"+"Rate");
                    for(int i=0;i<4;i++)
                    {
                        System.out.println(sr[i] + "\t\t" + menu[i] + "\t\t" + qty[i] + "\t\t" + rate[i]);
//
                    }
                    System.out.println("Enter the Item from the list :");
                    String item=sc.next();
                    switch (item)
                    {
                        case "Poha":
                            System.out.println("poha take");
                            System.out.println("Enter How many Plate of Poha You Want :");
                            int plt=sc.nextInt();
                            System.out.println("Order Placed and Total Price is "+(plt*50));
                            System.out.println("Do You Want to Place Order Y or N");
                            c=sc.next().charAt(0);
                            if(c=='n') {
                                break;
                            }
                            if (c=='y')
                            {
                                continue;
                            }

                        case "Idli":
                            System.out.println("Idli take");
                            System.out.println("Enter How many Plate of Idli You Want :");
                            int plt1=sc.nextInt();
                            System.out.println("Order Placed and Total Price is "+(plt1*60));
                            System.out.println("Do You Want to Place Order Y or N");
                            c=sc.next().charAt(0);
                            if(c=='n') {
                                break;
                            }
                            if (c=='y')
                            {
                                continue;
                            }
                        case "wadapav":
                            System.out.println("Wada Pav take");
                            System.out.println("Enter How many Plate of Wada PavYou Want :");
                            int plt2=sc.nextInt();
                            System.out.println("Order Placed and Total Price is "+(plt2*30));
                            System.out.println("Do You Want to Place Order Y or N");
                            c=sc.next().charAt(0);
                            if(c=='n') {
                                break;
                            }
                            if (c=='y')
                            {
                                continue;
                            }
                        case "aluparatha":
                            System.out.println("Alu Paratha take");
                            System.out.println("Enter How many Plate of Alu Paratha You Want :");
                            int plt3=sc.nextInt();
                            System.out.println("Order Placed and Total Price is "+(plt3*60));
                            System.out.println("Do You Want to Place Order Y or N");
                            c=sc.next().charAt(0);
                            if(c=='n') {
                                break;
                            }
                            if (c=='y')
                            {
                                continue;
                            }
                    }

                    break;





            }
        //  continue;
        }



    }
    public static void main(String[] args) {
        System.out.println("Canteen Menu Driven Program");
        System.out.println("============================");
        System.out.println("Welcome to Star Canteen");
        Menu();

    }
}

