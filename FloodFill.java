package Recurrsion;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
       int a[][]={{1,1,1,1,1,1,1},
                 {1,1,0,1,0,1,0},
                 {1,2,2,2,2,0,1},
               {1,1,1,1,1,1,1},
               {1,0,1,2,1,2,2}};
       floodfill(a,2,1,6,2);
       print(a);

    }
    static void floodfill(int a[][], int r, int c, int toFill, int prevFill){
        int rows= a.length;
        int cols= a[0].length;
        if (r<0||r>=rows||c<0||c>=cols)
        {
            return ;
        }
        if (a[r][c]!=prevFill)
        {
            return ;
        }
        a[r][c]=toFill;
        //Calling the recursive function.
        floodfill(a,r-1,c,toFill,prevFill);
        floodfill(a,r,c-1,toFill,prevFill);
        floodfill(a,r+1,c,toFill,prevFill);
        floodfill(a,r,c+1,toFill,prevFill);
    }
    static void print(int a[][]){
        for (int[] array: a){
           for (int element:array)
           {
               System.out.print(element + " ");
           }
            System.out.println();
        }
    }
}

