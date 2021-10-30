import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my currency converter!\n ");

        System.out.println("Press 1 convert US dollars to DKK");
        System.out.println("Press 2 convert DK to US Dollars");

        if(input.nextDouble() == 1){
            System.out.println("How many US dollars do you want to convert to DKK ?");
            usToDKK(input);
        }else {
            System.out.println("How many DKK do you want to convert to US dollars?");
            dkkToUS(input);
        }
    }

    public static void usToDKK(Scanner scan){
        double dkk;
        double number = scan.nextDouble();
        dkk = number * 6.44;
        System.out.println("Your amount of DKK is: " + dkk);



    }
    public static void dkkToUS(Scanner scan){
        double us;
        double number = scan.nextDouble();
        us = number / 6.44;
        System.out.println("Your amount of US dollars is: " + us);
    }
}
