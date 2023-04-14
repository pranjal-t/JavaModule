package example;

/*
Find the index of the key from the circular sorted array like below.
Input: [8,9,1,2,3,4]
Key: 2
Output: 3
*/

/*Q: Move all the 1s in the beginning of the array. Order of other numbers is not required.
Input: [1,0,2,1,0,2]
Output: [1,1,0,2,0,2]
*/

public class ExampleDemo {

    public static void main(String args[]) {

        int a[] = {1,2,1,0,2,1,0,2,1};

        int n = a.length;

        int start=0, end=n-1;

        while(start<=end)
        {
            if(a[start]!=1 && a[end]==1)
            {
                int temp  =a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            else if(a[start]==1)
            {
                start++;
            }
            else
                end--;

        }

        for(int i=0;i<n;i++)
            System.out.println(a[i]);

//        int a[] = {8,9,1,2,3,4};
//
//        int n = a.length;
//
//        int x=2;
//
//        int start=0, end=n-1;
//
//        while(start<=end)
//        {
//            int mid = start + (end-start)/2;
//
//           // System.out.println(start+ " " + end);
//
//                if(a[mid]==x)
//                {
//                    System.out.println(mid);
//                    break;
//                }
//                else if(a[mid]>x)
//                {
//                    if(a[mid+1]<a[mid] && a[mid+1]<x)
//                        start=mid+1;
//                    else
//                    end = mid-1;
//                }
//                else
//                {
//                    if(a[mid-1]>a[mid] && a[mid-1]>x)
//                    {
//                        end=mid-1;
//                    }
//                    else
//                    start = mid+1;
//                }
//            }

        }
}
