package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MoneyOwed
{
    int money;
    String name;

    public MoneyOwed(int m, String n)
    {
        money = m;
        name = n;
    }
}

class Friend
{
    String name1, name2;
    int amount;

    public Friend(String n1, String n2, int a)
    {
        name1 = n1;
        name2 = n2;
        amount=a;
    }
}
public class SplitwiseDemo {

    public static void main(String args[])
    {

        Map<String, List<MoneyOwed>> map = new HashMap();

        Friend f1 = new Friend("M","N",20);
        Friend f2 = new Friend("L","M",70);
        Friend f3 = new Friend("N","L",40);
        Friend f4 = new Friend("N","K",100);

        List<Friend> friends = new ArrayList<>();
        friends.add(f1);
        friends.add(f2);
        friends.add(f3);
        friends.add(f4);

        for(Friend f : friends) {

            if (!map.containsKey(f.name1)) {
                MoneyOwed m1 = new MoneyOwed(f.amount, f.name2);
                List<MoneyOwed> moneyOwedList = new ArrayList<>();
                moneyOwedList.add(m1);
                map.put(f.name1, moneyOwedList);
            } else {

                List<MoneyOwed> list = map.get(f.name1);
                list.add(new MoneyOwed(f.amount, f.name2));
                map.put(f.name1, list);
            }
        }

        for(Friend f : friends) {

            if(!map.containsKey(f.name2))
            {
                MoneyOwed m1 = new MoneyOwed(-f.amount, f.name1);
                List<MoneyOwed> moneyOwedList = new ArrayList<>();
                moneyOwedList.add(m1);
                map.put(f.name2, moneyOwedList);
            }
            else
            {
                List<MoneyOwed> list = map.get(f.name2);
                list.add(new MoneyOwed(-f.amount, f.name1));
                map.put(f.name2, list);
            }

        }

        int val=0; String friendVal="";

        for(Map.Entry<String, List<MoneyOwed>> mapValue : map.entrySet())
        {

            List<MoneyOwed> list = mapValue.getValue();

            for(MoneyOwed m : list)
            {
                val += m.money;
                friendVal = m.name;

                if(m.money<0)
                {
                    System.out.println("amount to be taken back by " + mapValue.getKey() + " is " + m.money + " from " + friendVal);
                }
                if(m.money>0)
                {
                    System.out.println("amount owed by " + mapValue.getKey() + " is " + m.money + " to " + friendVal);
                }

            }

            System.out.println("Total amount owed by " + mapValue.getKey() + " is " + val);

            System.out.println();
            val=0;

        }

    }
}
