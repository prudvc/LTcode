import java.util.*;
import java.util.Set;
import java.util.Scanner;
// import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
// import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.relation.RoleNotFoundException;
import java.util.Random;





class Solution {
    public int rotatedDigits(int n) {

        int[] t = new int[n + 1];
        java.util.Arrays.fill(t, -1);

        t[0] = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {

            int remain = t[i / 10];

            if (remain == 2) {
                t[i] = 2;
                continue;
            }

            int d = i % 10;
            int digitCheck;

            if (d == 0 || d == 1 || d == 8)
                digitCheck = 0;
            else if (d == 2 || d == 5 || d == 6 || d == 9)
                digitCheck = 1;
            else {
                t[i] = 2;
                continue;
            }

            if (remain == 0 && digitCheck == 0)
                t[i] = 0;
            else
                t[i] = 1;

            if (t[i] == 1) {
                count++;
            }
        }

        return count;
    }
}


class leetC_788
     {

          public static void main(String args[])
          {

               Solution s1=new Solution();

               int n=10; // ans:4;
               int m=15; // ans:6;
               int a=20; // ans:9;
               int b=25; // ans:12;

               System.out.println( s1.rotatedDigits(
                    n
               )
               );

          }

     }




