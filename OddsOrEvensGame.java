import java.util.Random;
import java.util.Scanner;
public class OddsOrEvensGame {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Lets play a game called \"Odds and Evens\"");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String OddOrEven = input.next();
        if (OddOrEven.equals("O") || OddOrEven.equals("o")){
            OddOrEven = "o";
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (OddOrEven.equals("E") || OddOrEven.equals("e")){
            OddOrEven = "e";
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("--------------------------------------------------------");


        System.out.println("How many \"fingers\" do you put out?");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("--------------------------------------------------------");

        int sum = fingers+computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        String result = " ";
        if (sum%2 == 0 && sum!=2){
            System.out.println(sum + " is...even!");
            result = "e";
        } else {
            System.out.println(sum + " is...odd!");
            result = "o";
        }
        if (OddOrEven.equals(result)){
            System.out.println(name + " is the winner!");
        } else {
            System.out.println("Computer is the winner!");
        }
        System.out.println("--------------------------------------------------------");
    }
}
