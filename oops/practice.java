// package oops;

// // // // import java.rmi.server.SocketSecurityException;
// // // import java.util.Arrays;
// // import java.util.Scanner;
// import java.util.regex.Pattern;

// import jdk.internal.platform.Container;


class  manu{
    String name;
    int goals;
     int  contract;


    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    public void  setGoals(int g){
        goals=g;
    }


    public int getGoals(){
        return goals;
    }

    private void setContract(){ //need method to access private variables can't access directly;
        contract=36;
        System.out.println(contract);
        }

    public int   getContract(){
        return contract;
    }
}

public class practice {

        public static void main (String[] args) {

            manu ronaldo= new manu();
            manu messi= new manu();
            manu prudhvi=new manu();

            ronaldo.setName("Cristiano Ronaldo");
            messi.setName("Lionel Messi");
            prudhvi.setName("Prudhvi");



            ronaldo.setGoals(1000);
            messi.setGoals(960);
            prudhvi.setGoals(862);

            // ronaldo.setContract(960);
            // messi.setContract(940);


            // ronaldo.getContract();
            // messi.getContract();   //private can only access through method can't access direct;


            System.out.println(ronaldo.getName());
            System.out.println("Total goals was : " +  ronaldo.getGoals());

            System.out.println(messi.getName());
            System.out.println("Total goals was : " + messi.getGoals());

            System.out.println(prudhvi.getName());
            System.out.println("Total goals was : " + prudhvi.getGoals());

            System.out.println("Salary : "+ ronaldo.getContract());
            System.out.println("Salary : "+messi.getContract());




        }

}

