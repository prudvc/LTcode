import java.util.Arrays;


public class Sorting {

    public static void main(String[] args){

        //for finding largest and smallest in array;
        int arr[]={0,36,61,123,321},i;
        int largest=arr[0];
        int smallest=arr[0];

        for(i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else
            {
                if(arr[i]<smallest){
                    smallest=arr[i];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.printf("The largest value was : %d and the smallest value was %d ..",largest,smallest);
    }
}
