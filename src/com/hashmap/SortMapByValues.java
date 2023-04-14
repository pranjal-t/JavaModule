package com.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValues {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Steven", 23);
        map.put("Shaun", 35);
        map.put("Mitchell",21);
        map.put("Kevin",1);
        map.put("Alan",45);

        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(Map.Entry<String,Integer> val : list)
        {
            map.put(val.getKey(),val.getValue());
            //System.out.println(val.getKey() + " " + val.getValue());
        }

        Map<String, Integer> val = map.entrySet().stream().sorted((i,j)->j.getValue().compareTo(i.getValue())).collect(
                Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (d,f)->d, LinkedHashMap::new));

        Random r = new Random();



        int count=10;
        while(count>0)
        {
            int sample = Math.abs(r.nextInt());
            System.out.println(sample%10);
            count--;
        }







    }
}
