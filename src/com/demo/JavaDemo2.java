package com.demo;


class NodeVal
{
    int data;
    NodeVal next;
    public NodeVal(int data, NodeVal next)
    {
        this.data = data;
        this.next = next;
    }
}
public class JavaDemo2 {

    public static void main(String[] args) {

        NodeVal L1 = new NodeVal(1,null);
        L1.next = new NodeVal(4, null);
        L1.next.next = new NodeVal(5,null);

        NodeVal L2 = new NodeVal(2,null);
        L2.next = new NodeVal(3, null);
        L2.next.next = new NodeVal(10,null);

        NodeVal result = merge(L1,L2);

        while(result!=null)
        {
            System.out.println(result.data);
            result = result.next;
        }
    }

    public static NodeVal merge(NodeVal L1, NodeVal L2)
    {
        NodeVal result = new NodeVal(0,null);

        NodeVal current = result;
        while(L1!=null && L2!=null)
        {
            if(L1.data<L2.data)
            {
                result.next = L1;
                L1 = L1.next;
            }
            else
            {
                result.next = L2;
                L2 = L2.next;
            }

            result = result.next;
        }

        if(L1!=null)
        {
            result.next = L1;
            L1 = L1.next;

            result = result.next;

        }

        if(L2!=null)
        {
            result.next = L2;
            L2 = L2.next;

            result = result.next;

        }


        return current.next;
    }
}
