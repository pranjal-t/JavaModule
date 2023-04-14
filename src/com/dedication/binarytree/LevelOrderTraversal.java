package com.dedication.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Tree
{
    int x;

    Tree left, right;

    Tree(int val)
    {
         x = val;
         left=right=null;
    }
}
public class LevelOrderTraversal {

    public static void main(String[] args) {

        Tree root = new Tree(4);
        root.left = new Tree(5);
        root.right = new Tree(6);
        root.left.left = new Tree(7);
        root.left.right = new Tree(8);
        root.right.left = new Tree(9);
        root.right.right = new Tree(10);

        printLevelOrder(root);

    }

    private static void printLevelOrder(Tree root) {

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while(queue!=null)
        {
            Tree temp = queue.poll();
            if(temp==null)
                break;
            System.out.println(temp.x + " ");

            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }
    }
}

// Space complexity - O(n), time complexity - O(n)