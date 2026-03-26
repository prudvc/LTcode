// package oops;
// import java.rmi.server.SocketSecurityException;
// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.regex.Pattern;


public class recursive_pattern {

    //  static void pattern(int n){
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }

        // }

        static int  recursive(int n){
            if(n==1){
                return n;
            }
            return  n+recursive(n-1);
        }

        public static void main (String[] args) {

        System.out.println(recursive(6));

        // for(int i=1;i<=6;i++){
        //     for(int j=i;j<=6;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=i ;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        // Pattern(5);


        // Scanner un=new Scanner(System.in);

        // System.out.print("Enter any num : ");
        // int n=un.nextInt();

        // for(int i=1;i<11;i++){
        //     System.out.println(n+" x "+i+" = "+i*n);
        // }

        }
}

