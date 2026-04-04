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
    public String decodeCiphertext(String ect, int rows) 
    {
        int l=ect.length();

        int cols=l/rows;

        StringBuilder ot=new StringBuilder();

        for(int c=0;c<cols;c++)
        {
            for(int j=c;j<l;j+=(cols+1))
            {
                ot.append(ect.charAt(j));
            }
        }

        while(ot.length() > 0 && ot.charAt(ot.length() -1) == ' ')
        {
            ot.deleteCharAt(ot.length()-1);
        }

        return ot.toString();
    }
}


class cipher
     {

          // LeetCode no:2075 , april 4,2026

          public static void main(String args[])
          {
               String encodedText = "ch   ie   pr";
               int rowss=3;

               Solution ob1=new Solution();

               String r=ob1.decodeCiphertext(encodedText, rowss);
               System.out.println(r);;
          }
     }




