// packname conditionals;
import java.util.Scanner;


//not working for methods;
//not working for input;



public class SwitchCase {

    public static void main(String[] args)
    {


        // Scanner name=new Scanner(System.in);
        System.out.println("Enter ur name : ");
        Scanner n =new Scanner(System.in);
        String name =n.nextLine();

     switch(name){

        case "prudhvi" :
        System.out.println("you are welcome..");
        break;

        case "ronaldo":
        System.out.println("you are welcome..");
        break;

        default :
         System.out.println("Byee..");

        }

    }

}
