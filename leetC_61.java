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




    class ListNode{
        
        int val; 
        ListNode next;

        ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    class Solution {
        public ListNode rotateRight(ListNode head, int k)
        {
            if(head == null || head.next == null || k==0)
            {
                return head;
            }

            int n=1;
            ListNode tail=head;

            while(tail.next != null) //find length and tail
            {
                n++;
                tail=tail.next;
            }

            k = k%n;       // reduce k , cuz n times rotation gives same list

            if(k == 0) return head;

            tail.next=head;    // make circular


            int st= n-k;   // find new tail
            ListNode newtail = head;

            for(int i=1;i<st;i++)
            {
                newtail=newtail.next;
            }

            ListNode newHead=newtail.next;  //newHead
            newtail.next = null;

            return newHead;

        }
    }

    class leetC_61                   // leetcode no : 61 // okay
        {

            public static void main(String args[])
            {

                Solution s1=new Solution();

                ListNode head=new ListNode(1);
                head.next=new ListNode(2);
                head.next.next=new ListNode(3);
                head.next.next.next=new ListNode(4);
                head.next.next.next.next=new ListNode(5);
                head.next.next.next.next.next=new ListNode(6);

                int k=2;

                ListNode r=s1.rotateRight(head, k);

                    printList(r);

            }


                    // Helper function to print list

                    public static void printList(ListNode head)
                    {
                        ListNode temp=head;

                        while(temp != null)
                        {
                            System.out.print(temp.val+ " -> ");
                            temp=temp.next;
                        }
                        System.out.println("null");
                    }
            }





