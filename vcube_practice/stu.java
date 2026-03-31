
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




class studata{

   private String name;
   private int  id ;
   private String  email;
   private String address;
   static int cnt=0;

   studata(String name,int id,String  email,String address)
   {
      this.name=name;
      this.id=id;
      this.email=email;
      this.address=address;
      // cnt++;
   }

   public void display()
   {

      System.out.println("ID : "+id);
      System.out.println("Name :"+name);
      System.out.println("Email :"+email);
      System.out.println("Address : "+address);
      //System.out.println("Count : "+cnt+"\n\n");

   }

}

class stu
{

     public static void main(String args[])
     {

        // studata s1=new studata("First",1,"First@gmail","Vijayawada");
        //         s1.display();

        // studata s2=new studata("Second",2,"Second@gmail","Vizag");
        //         s2.display();

        // studata s3=new studata("Three",3,"Three@gmail","Kerala");
        //         s3.display();

        // studata s4=new studata("Four",4,"Four@gmail","Kochi");
        //         s4.display();

        // studata s5=new studata("Five",5,"Five@gmail","Chennai");
        //         s5.display();

        System.out.println("Enter total students number : ");
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        studata[] sl=new studata[n];

        for(int i=0;i<n;i++)
        {
         int c=i+1;
         System.out.println("Enter "+c+" student name :");
         String sn=s.next();
         System.out.println("Enter "+c+" student id  :");
         int si=s.nextInt();
         System.out.println("Enter "+c+" student email :");
         String se=s.next();
         System.out.println("Enter "+c+" student address :");
         String sa=s.next();

         sl[i]=new studata(sn, si, se, sa);
         //sl[i].display();
        }

        for(int i=0;i<n;i++)
        {
         sl[i].display();
        }


     }
}




