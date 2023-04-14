package com.interview;

public class SortModule {

    public static void main(String[] args) {

        int n[] = {3,0,1,2,5,4};

        int l =n.length,count=0;

        for(int i=0;i<l;i++) {

            if(count==l)
                break;
            if(n[i]!=i)
            {
                int temp = n[i];
                n[i] = i;
                i = temp;
                i--;
            }
            else
                count++;
        }

        for(int i=0;i<l;i++)
        {
            System.out.println(n[i]);
        }
    }
}
