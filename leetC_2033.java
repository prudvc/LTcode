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
    public int minOperations(int[][] grid, int x)
    {

        List<Integer> l1=new ArrayList<>();

        for(int[]  row:grid)
        {
            for(int i:row)
            {
                l1.add(i);
            }
        }

        int r=l1.get(0) % x;          // first element remainder as reference

        for(int i:l1)
        {
            if(i % x != r) return -1;
        }

        Collections.sort(l1);

        int median=l1.get(l1.size() / 2);

        int oprs=0;      // operations

        for(int i:l1)
        {
            oprs+=Math.abs(i-median)/x;
        }

        return oprs;
    }
}


class leetC_2033          // leetcode question no : 2033  // okay 
{
    public static void main(String args[])
    {
        int[][] grid={
            {2,4},
            {6,8},
        };

        int x=2;

        Solution obj = new Solution();
        int result = obj.minOperations(grid, x);

        System.out.println(result);

    }
}