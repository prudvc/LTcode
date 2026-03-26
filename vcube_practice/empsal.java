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




class empsala{

   private String name;
   private int  id ;
   private int salary;

   empsala(String name,int id,int salary)
   {
      this.salary=salary;
      this.id=id;
      this.name=name;
   }

   public void display()
   {
      System.out.println("ID "+id);
      System.out.println("Name "+name);
      System.out.println("Salary"+salary);
   }

}
class empsal
{
     public static void main(String args[])
     {
        empsala e1=new empsala();

        e1.salary=60000;
        e1.id=1;
        e1.name="First";
        e1.display();


     }
}




