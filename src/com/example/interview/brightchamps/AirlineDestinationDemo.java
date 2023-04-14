package com.example.interview.brightchamps;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AirlineDestinationDemo {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("DEL");
        l1.add("MUM");

        List<String> l2 = new ArrayList<>();
        l2.add("MUM");
        l2.add("KOL");

        List<String> l3 = new ArrayList<>();
        l3.add("KOL");
        l3.add("CHN");

        List<String> l5 = new ArrayList<>();
        l5.add("KOL");
        l5.add("BLR");



        List<List<String>> list = new ArrayList<>();
        //list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l5);
        //list.add(l6);

        Stack<String> s = new Stack<>();

        String val1 = "", val2 = l1.get(0);


        s.push(l1.get(0));
        s.push(l1.get(1));

        val1 = l1.get(0);
        for(List<String> l : list)
        {

            if(!s.isEmpty() && s.peek().equals(l.get(0)))
            {
                s.pop();
                s.push(l.get(1));
            }

            val2 = l.get(1);


        }

        System.out.println(s);


        int count=0;

        while(!s.isEmpty())
        {
            if(s.pop().equals(val2) || s.pop().equals(val1))
                count++;
        }


        if(count==2)
            System.out.println(true);
        else
            System.out.println(false);



    }
}
