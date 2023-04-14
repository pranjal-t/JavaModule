package demo;

public class LargestSumDemo {

    public static void main(String[] args) {


        int arr[] = {5,4,-1,7,8};

        int currSum=0, result=0;

        for(int i=0;i<arr.length;i++)
        {
            currSum = currSum + arr[i];

            if(currSum<0)
                currSum =0;

            if(result<currSum)
            {
                result = currSum;
            }
        }

        System.out.println(result);
    }
}
