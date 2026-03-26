// import javax.sql.rowset.spi.SyncResolver;

public class varargss {
    static int sum(int a , int b)
    {
        System.out.println("sum");
        return a+b+a-b;
    }

    static int sums(int...arr){
        int result=0;
        for(int a:arr){
            result +=a;

        }
        System.out.println("sums");
        return   result;
    }

    static int sumss(int x ,int ...arrs)
    {
        int result=x;
        for(int i:arrs)
        {
            result+=i;
        }
        System.out.println("sumss");
        return result;
    }


    public static void main (String[] args) {
        int arrs[]={1,2,3};

        System.out.println("sum was : "+sumss(2,arrs));
    }

}
