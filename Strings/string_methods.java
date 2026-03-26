import java.util.Scanner;


public class string_methods {


    public static void main(String[] args){

        System.out.println("Hai how are you : ");
    System.out.println("Enter ur name : ");
    Scanner n=new Scanner(System.in);
    String name=n.nextLine();

    System.out.print("Hello  ");

    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    // // String name="Prudhvi";
    // System.out.println(name.startsWith("pru")); // only returns true or false;

    // System.out.println(name.substring(0,4)); //returns chars b/w them

    // System.out.println(name.replace('a', 'o'));

    // System.out.println(name.charAt(1)); //returns character at given index;

    // System.out.println(name.indexOf('r')); //returns index of character

    // System.out.println(name.equals("prud")); // only returns true if equal or false if not equal



    }

}
