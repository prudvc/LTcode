public class recursionn {

    static int factorial(int n)
    {

        // factorial(0)=1;
        // factorila(1)=1;
        if(n==0 || n==1)
        {
            return 1;
        }
        // else
        // {
        // return n*factorial(n-1);
        // }
        else
        {

            int product=1;
            for(int i=1;i<=n;i++)
            {
                product*=i;
            }
            return product;

        }


    }


    public static void main (String[] args) {

        int n=4;

        System.out.println("factorial was : "+factorial(n));
    }

}
