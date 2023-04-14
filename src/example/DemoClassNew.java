package example;


public class DemoClassNew {


    private static boolean buildStatus(int n) {
        if(n >= 15) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int n1=60;

        int start = 1, end = n1, mid=0;

        while(start < end)
        {
            mid  = (start+end)/2;

            boolean val = buildStatus(mid);

            if(val)
            {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        System.out.println(start);
    }
}



