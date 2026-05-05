    import java.util.*;
    import java.util.Set;
    import java.util.Scanner;
    // import java.rmi.StubNotFoundException;
    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.Iterator;
    import java.util.LinkedList;
    import java.util.PriorityQueue;
    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Stack;

    import javax.management.relation.RoleNotFoundException;
    import java.util.Random;



 class Solution {

    public int maximumBeauty(int[] nums, int k)
    {
       Arrays.sort(nums);

          int mxcnt =0 ;       //max count
          int wincnt=0;        // window count
          int l=0,r=0;          // left right

          int n=nums.length;

          while(r<n)
          {
            while(r<n && (nums[r]-nums[l] <= 2*k))
            {
                wincnt++;
                r++;
            }

            mxcnt=Math.max(mxcnt,wincnt);

            if(r == n) break;

            while(l <= r && (nums[r]-nums[l] > 2*k))
            {
                wincnt--;
                l++;
            }

          }

          return mxcnt;
    }

}

    class leetC_2779            // leetcode no: 2779  // okay
        {

            public static void main(String args[])
            {
                int[] arr={4,6,1,2};
                int k=2;

                Solution s1=new Solution();

                System.out.println(s1.maximumBeauty(arr, k));


            }
    }





