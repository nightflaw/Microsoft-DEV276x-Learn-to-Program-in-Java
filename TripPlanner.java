import java.util.Scanner;
public class TripPlanner {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
      //method1();
      //method2();
      //method3();
      //method4();
      //method5();
    }
    public static void method1(){
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name + ", where are you travelling to?");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip.");
        System.out.println("**********\n");
    }
    public static void method2() {
        System.out.println("How many days are you going to spend travelling?");
        int days = input.nextInt();
        System.out.println("How much money, in USD,are you planning to spend on your trip?");
        double budget = input.nextDouble();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        String currency = input.next();
        System.out.println("How many " + currency + " are there in 1 USD?");
        Double conversion = input.nextDouble();

        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("\nIf you are travelling for " + days + " days, that is the same as " + hours + " hours or " + minutes + " minutes.");
        double UsdPerDay = budget / days *100;
        int UsdPerDay1 = (int) UsdPerDay;
        double rounded = UsdPerDay1/100.0;
        System.out.println("If you are going to spend $" + budget + " USD, that means per day you can spend up to $" + rounded + " USD.");
        double totalCurrency = budget * conversion;
        double currencyPerDay = totalCurrency / days * 100;
        int currencyPerDay1 = (int) currencyPerDay;
        double rounded1 = currencyPerDay1/100.0;
        System.out.println("Your total budget in " + currency + " is " + totalCurrency + " " + currency + ", which per day is " + rounded1 + " " + currency + ".");
        System.out.println("**********\n");
    }

    public static void method3(){
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        int hours = input.nextInt();
        int midnight = 0 + hours;
        int noon = (12 + hours)%24;
        System.out.println("That means that when it is midnight at home it will be " + midnight + ":00 at your travel destination \nand when it is noon at home it will be " + noon + ":00");
        System.out.println("**********\n");
    }

    public static void method4(){
        System.out.println("What is the square area of your destination country in km2?");
        int area = input.nextInt();
        double areaMiles = area * 0.386102 *100;
        int areaMiles1 = (int)areaMiles;
        double rounded = areaMiles1 /100.0;
        System.out.println("In miles2 that is " + rounded);
        System.out.println("**********\n");

    }

    public static void method5(){
        System.out.println("What is the latitude value of your home?");
        double B = input.nextDouble();
        System.out.println("What is the longitude value of your home? \n Please use positive value for N/E and negative for S/W.");
        double A = input.nextDouble();
        System.out.println("What is the latitude value of your destination?");
        double D = input.nextDouble();
        System.out.println("What is the longitude value of your destination?");
        double C = input.nextDouble();

        double lon1 = (A*Math.PI)/180;
        double lat1 = (B*Math.PI)/180;
        double lon2 = (C*Math.PI)/180;
        double lat2 = (D*Math.PI)/180;

        double ans1 = Math.pow(Math.sin((lat2 - lat1)/2), 2);
        double ans2 = Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin((lon2 - lon1)/2), 2);
        double ans3 = Math.sqrt(ans1 + ans2);
        double ans4 = 2*6371*Math.asin(ans3);
        System.out.println("The distance between your home and your destination is " + ans4 + "km");
        System.out.println("**********\n");

    }

}
