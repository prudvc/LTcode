     import java.util.Scanner;
     import java.util.*;
     import java.util.Set;
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


     class astrd{

          public int[] astrdcol(int[] ar)
          {
               Stack<Integer> st=new Stack<>();
               int n=ar.length;

               for(int i=0;i<n;i++)
               {
                    if(ar[i]>0 || st.isEmpty())
                    {
                         st.push(ar[i]);
                    }
                    else{
                         while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(ar[i]))
                         {
                              st.pop();
                         }

                    if (!st.isEmpty() && st.peek() == Math.abs(ar[i])) {
                         st.pop();
                    }
                    else if (st.isEmpty() || st.peek() < 0) {
                         st.push(ar[i]);
                    }
                    }
               }

               int[] ans=new int[st.size()];
               for(int i=ans.length-1;i>=0;i--)
               {
                    ans[i]=st.peek();
                    st.pop();
               }
               System.out.println("Final Asteroids :");

               // for(int i:ans)
               // {
               //      System.out.println(i);
               // }

               System.out.println(Arrays.toString(ans));
          return ans;
     }
}



     class asteroid
     {
          public static void main(String args[])
          {
               int[] asteroids = {5,10,-5};

               astrd a1=new astrd();

               a1.astrdcol(asteroids);


          }
     }




