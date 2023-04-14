package com.dedication.linkedlist;

public class FindMiddle {

    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(6);
       // head.next.next.next.next = new Node(7);


        int val = findMiddle(head);
        System.out.println(val);

        System.out.println(" ");

        Node newHead = deleteMiddle(head);

        while(newHead!=null)
        {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

    private static Node deleteMiddle(Node head) {
        Node p1 = head, p2=head, temp=null;

        while(p1!=null && p2!=null && p2.next!=null)
        {
            temp = p1;
            p1 = p1.next;
            p2=p2.next.next;

        }

        temp.next = p1.next;

        return head;

    }

    private static int findMiddle(Node head) {

        Node p1 = head, p2=head, temp=null;

        while(p1!=null && p2!=null && p2.next!=null)
        {
             temp = p1;
             p1 = p1.next;
             p2=p2.next.next;

        }

        if(p2==null)
            return temp.val;


        return p1.val;
    }
}
