package com.example.interview;

public class CoordinateDemo {



    public static void main(String[] args) {

        int source_x = 2, source_y = 10;
        int dest_x = 26, dest_y = 12;
        if (isReachable(source_x, source_y, dest_x,
                dest_y))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean isReachable(int source_x, int source_y, int dest_x, int dest_y) {

        if(source_x>dest_x || source_y>dest_y)
            return false;

        if(source_x == dest_x && source_y == dest_y)
            return true;


        return (isReachable(source_x+source_y,source_y,dest_x,dest_y)||
                isReachable(source_x,source_x+source_y,dest_x,dest_y));
    }
}
