package demo;

import java.util.Arrays;

public class MinDemo {

    public static void main(String[] args) {


        int arr[] = {-2,1,31,-12,0};

        int target=1, result = Integer.MAX_VALUE;

        int n =arr.length, val1=0,val2=0,val3=0;

        Arrays.sort(arr);

        if(n<3)
            System.out.println("Not possible");

        else {


            int p1 = 0, p2 = 2, sum = 0, currMin = 0;

            for (int i = 0; i < n; i++) {
                int c1 = p1, c2 = p2;

               // System.out.println(p1 + " " + p2);
                while (c1 < n && c1 <= c2) {
                    sum = sum + arr[c1];
                    c1++;
                }

                currMin = Math.abs(sum-target);

                sum=0;

                if (p1 + 2 < n && currMin < result) {
                    result = currMin;
                    val1 = arr[p1];
                    val2 = arr[p1 + 1];
                    val3 = arr[p1 + 2];
                }

                p1 = p1+1;
                p2 = p2+1;

            }
            System.out.println(val1 + " " + val2 + " " + val3);
        }
    }
}
