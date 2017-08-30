import java.util.Scanner;
public class LongestName {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        longestName();
    }

    public static void longestName() {
        String longest = " ";
        boolean tie = false;
        for (int i = 1; i <= 100; i++) {
            System.out.println("Please enter name #" + i + "\nIf there are no more names, enter \"done\"");
            String name = input.nextLine();
            if (name.equals("done")){
                break;
            }else if (name.length() > longest.length()) {
                longest = name;
                tie = false;
            } else if (name.length() == longest.length()) {
                tie = true;
            }
        }
        String capitalized = longest.substring(0, 1).toUpperCase() + longest.substring(1).toLowerCase();
        System.out.println("The longest name is " + capitalized);
        if (tie == true) {
            System.out.println("There was a tie.");
        }
    }

}
