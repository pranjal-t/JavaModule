package oa.ms.interview;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MyObj implements  Comparable<MyObj>
{
    int key;
    String value;

    MyObj(int key, String value)
    {
        this.key = key;
        this.value = value;

    }

    @Override
    public int compareTo(MyObj o) {
        if(this.key>o.key)
            return 1;
        else if (this.key<o.key)
            return -1;
        else return 0;
    }
}

public class RearrangementDemo {


    //Priority
    public static void main(String[] args) {

        String arr[] = {"A","A","A","O","B"};

        regarrementLogic(arr);

        System.out.println();
    }

    private static void regarrementLogic(String[] arr) {

        int  l =arr.length;

       // int val[] = new int[10];
        //int flag[] = new int[10];

        String rearrange[] = new String[arr.length];

        Map<String, Integer> map = new HashMap<>(); // Count of Strings

        Map<String, Integer> map2 = new HashMap<>(); // Check if string is already added
        for(int i=0;i<l;i++)
        {
            if(!map.containsKey(arr[i]))
            map.put(arr[i],1);
            else
            {
                int val1 = map.get(arr[i]);
                map.put(arr[i],val1+1);
            }

            map2.put(arr[i],0);
        }

        PriorityQueue<MyObj> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<l;i++)
        {

           // String c = arr[i];

            if(map.get(arr[i])>0)
            {
                if(map2.get(arr[i]) != 1)
                {
                    priorityQueue.add(new MyObj(map.get(arr[i]), arr[i]));
                }
                map2.put(arr[i],1);
            }
        }

//        for(Map.Entry<String, Integer> mapVal : map.entrySet())
//        {
//            System.out.println(mapVal.getKey() + " " + mapVal.getValue());
//        }

        int k=0;
        MyObj prevString = new MyObj(-1, "");
        while(!priorityQueue.isEmpty())
        {
            MyObj myObj = priorityQueue.poll();
            rearrange[k++] = myObj.value;

           if(map!=null && prevString!=null && map.containsKey(prevString.key) &&  map.get(prevString.key)>0)
                priorityQueue.add(prevString);

            myObj.key = myObj.key -1;
            prevString.value = myObj.value;
            prevString.key = myObj.key;
        }

        if(rearrange.length!= arr.length)
        {
            System.out.println("Rearranement not possible ");
        }
        else
        {
            for(int i=0;i<rearrange.length;i++)
            {
                System.out.println(rearrange[i]);
            }
        }


    }
}
