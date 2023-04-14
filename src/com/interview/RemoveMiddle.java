package com.interview;

class Node
{
    int data;
    Node next;

    public Node(int x)
    {
        data = x;
        next=null;
    }
}
public class RemoveMiddle {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node val = deleteMiddle(head);

        while(val!=null)
        {
            System.out.println(val.data);
            val = val.next;
        }
    }

    private static Node deleteMiddle(Node head) {

        Node ptr1 = head, ptr2  = head,prev=head;

        while(ptr1!=null && ptr2!=null && ptr1.next!=null)
        {
            ptr1 = ptr1.next.next;
            prev=ptr2;
            ptr2 = ptr2.next;
        }

        prev.next=ptr2.next;


        return head;
    }
}
