import java.util.Scanner;

public class Peanuts {

    public static String cockatoo() {
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println(askFood());
            answer = sc.nextLine();

            if (!answer.equalsIgnoreCase("PEANUTS")) {
                System.out.println("Cockatoo wants Peanuts!");
            }
        } while (!answer.equalsIgnoreCase("PEANUTS"));

        return sleep();
    }

    public static String askFood(){
        return "What food do you want to give the Cockatoo?";
    }

    public static String sleep(){
        return "zzzZZZzzz...";
    }

}
