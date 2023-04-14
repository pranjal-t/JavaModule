package sample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyObj implements Comparable<MyObj>
{

    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public MyObj(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(MyObj o) {
        return this.getA() - o.getA();
    }
}
public class MergeIntervals {

    public static void main(String[] args) {

        int a[][] = {{2,6},{8,10},{15,18},{1,3}};

        int start = 0, end=0;

        List<MyObj> list = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                start = a[i][0];
                end = a[i][1];
            }

            MyObj myObj = new MyObj(start, end);
            list.add(myObj);
        }

        Collections.sort(list);

        List<MyObj> result = new ArrayList<>();
        MyObj prev = list.get(0);

        list.remove(0);
        for(MyObj val : list)
        {

            if(prev.getB()>=val.getA())
            {
                result.add(new MyObj(prev.getA(),val.getB()));
            }
            else
            {
                result.add(new MyObj(val.getA(),val.getB()));
                prev = val;
            }
        }

        for(MyObj val1 : result)
        {
            System.out.println(val1.getA() + " " + val1.getB());
        }
    }
}
