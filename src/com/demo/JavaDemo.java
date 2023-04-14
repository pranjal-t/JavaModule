package com.demo;


class Node
{
    Node left, right, head,  next;
    int val;

    public Node(int val)
    {
        val = this.val;
    }
}
public class JavaDemo {


    public  static void main (String args[])
    {

        Node root = new Node(4);
    }

    public static boolean hasNext(Node root)
    {
        if(root==null)
            return false;

        return true;
    }

    public static int next(Node root)
    {
        return root.val;
    }

    static boolean checkVal;

    public static void demo(Node root)
    {

             checkVal =   hasNext(root);

        if(checkVal) {
            demo(root.left);

            int val1 = next(root);

            System.out.println(val1);

            demo(root.right);
        }

        else

            return;
    }


    public static int getMiddleElement(Node head)
    {

        Node ptr1 = head,ptr2 = head;

        Node current = head;

        int val=0;

        while(current!=null && current.next!=null)
        {

               if(ptr2==null)
                   return val;
               if(ptr2.next==null)
                   return ptr1.val;

               ptr1 = current.next;
               ptr2 = current.next.next;

               val = ptr1.val;

               current = current.next;

        }





        return 0;
    }

}


// 1->2 -> 3 -> 4


/*






 */
