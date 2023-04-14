package demo;

import java.util.Arrays;


class MyObj1
{
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    String s;
    int k;
}
public class SampleDemo {

    public static void main(String[] args) {

        String s = "1234", resultString = "";
        int k = 3, v=0;

        int n  =s.length(), flag=0;
        int c[] = new int[n];

        String s1 = "",s2="";

        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '0' && i != 0 && i != n - 1) {
                s1 = s.substring(0, i);

                s2 = s.substring(i);

                flag = 1;

                MyObj1 val1 = extracted(s1, k, v, s1.length(), c);

                if (val1.k == 0) {
                    System.out.println(s1 + val1.s);
                } else {
                    MyObj1 val2 = extracted(s1, k, v, n, c);
                    resultString = val1.s + val2.s;
                }

                s = resultString;

            }


        }

        if(flag==0)
        {
            MyObj1 res = extracted(s, k, v, n, c);
            System.out.println(res.s);
        }

    }

    private static MyObj1 extracted(String s, int k, int v, int n, int[] c) {
        for(int m = 0; m< k; m++)
        {
            for (int i = n - 1; i >= 0; i--) {
                c[v++] = s.charAt(i) - 48;
            }

            Arrays.sort(c);
            int val1 = c[v - 1];

            String result = "";

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == (char) (val1 + 48)) {
                    result = s.substring(0, i);
                }
            }

            s = result;
            k--;

        }

        MyObj1 myObj1 = new MyObj1();
        myObj1.setK(k);
        myObj1.setS(s);

        return myObj1;

    }
}
