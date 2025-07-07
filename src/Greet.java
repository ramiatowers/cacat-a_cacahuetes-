import java.util.Scanner;

public class Greet {
    public static void salute (){
        Scanner greeting = new Scanner(System.in);
                System.out.println("Write the greeting you want");
        String salute = greeting.nextLine();
                System.out.println("Write your name");
        String name = greeting.nextLine();
                greeting.close();
                System.out.println(salute + " " + name);
    }

    public static void salute2 (String salute, String name) {
        System.out.println(salute + " " + name);
    }

    public static String salute3(String salute, String name) {
        String salutation = salute + " " + name;
        return salutation;
    }
}
