import java.util.Scanner;
public class EvenOdd {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number.");
        int number = input.nextInt();
        if (number%2 == 0 && number!=2){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
