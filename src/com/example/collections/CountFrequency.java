package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static void main(String args[])
    {
        int arr[]={3,4,2,1,3,4,5,5};

        Map<Integer, Integer> map = new HashMap();

        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }
            else
            {
                int val = map.get(arr[i]);
                map.put(arr[i], val+1);
            }
        }

        for(Map.Entry<Integer, Integer> mapValue : map.entrySet())
        {
            System.out.println(mapValue.getKey() + " " + mapValue.getValue());
        }

    }
}
