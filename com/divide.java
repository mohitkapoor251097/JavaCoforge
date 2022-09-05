package com;

public class divide {
    public static void main(String[] args) {
    int n=6;
       // int arr[]=new int[3];
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
             // arr[i]=i;
                //System.out.println(i);
                sum+=i;
            }

           // System.out.println(arr);
        }
        System.out.println(sum);
    }
}
