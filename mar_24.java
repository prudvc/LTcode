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


public class mar_24 {

    // @Override
@Override
protected void finalize() throws Throwable {

    // super.finalize();
                System.out.println("GC  ");

}


    public static void main(String args[])
     {
        mar_24 obj1=new mar_24();

        obj1=null;

        mar_24 obj2=new mar_24();
        mar_24 obj3=new mar_24();

        obj2=obj3;

        System.gc();;

     }

}
