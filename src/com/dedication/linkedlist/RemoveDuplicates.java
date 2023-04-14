package com.dedication.linkedlist;


class Node
{
    Node next;
    int val;
    Node(int x)
    {
        val = x;
        next=null;
    }
}
public class RemoveDuplicates {

    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(4);

        removeDuplicate(head);

        while(head!=null)
        {
            System.out.println(head.val);
            head=head.next;

        }
        System.out.println();
    }

    private static void removeDuplicate(Node head) {

        Node cur = head;

        while(cur!=null)
        {
            Node temp = cur.next;

            while(temp!=null && temp.val== cur.val)
            {
                temp = temp.next;
            }

            cur.next = temp;
            cur = cur.next;

        }
    }
}
