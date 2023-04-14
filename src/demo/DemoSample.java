package demo;

import java.util.HashMap;
import java.util.Map;

public class DemoSample {

    public static void main(String[] args) {


        String s = "III";

        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char ch = s.charAt(n-1);
        int sum = map.get(ch);

       // System.out.println(sum);
        for(int i=n-2;i>=0;i--)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);

            if(map.get(ch1)>=map.get(ch2))
            {
                sum  = sum + map.get(ch1);
                //System.out.println("1 " + sum);
            }
            else
            {
                sum = sum - map.get(ch1);
               // System.out.println("2 " + sum);
            }
        }

        System.out.println(sum);


    }
}
