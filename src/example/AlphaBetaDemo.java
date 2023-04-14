package example;

public class AlphaBetaDemo {

    public static void main(String[] args) {

        int a[] = {1,2,2,3,4,4,4,4,5,10};


        int n  = a.length, count=1, alpha=0, beta=0, flag1=0, flag2=0,pos=0;

        for(int i=0;i<n;i++)
        {
            if(i+1<n && a[i]==a[i+1])
            {
                count++;
                if(flag1==0)
                {
                    pos=i;
                    flag1=1;
                }
            }

            else if(i+1<n && a[i]!=a[i+1])
            {

                if(i==n-2)
                    if(a[i+1]==i)
                        alpha++;
                flag2=1;
                if(a[i]==count)
                    alpha++;
                if(a[i]==count && a[i]==pos+1)
                    beta++;
                flag1=0;
                count=1;
            }
        }

        if(flag2==0 && count==n)
        {
            alpha++;
            if(a[0]==1)
                beta++;

        }

        System.out.println(alpha + " " + beta);
    }
}
