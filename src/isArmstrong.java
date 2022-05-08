import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args){


        //Armstrong numbers:
        //1634 = 1^4 + 6^4 + 3^4 + 4^4
        //371 =  3^3 + 7^3 + 1^3 if it's true, that's an Armstrong number.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome on Board Boeing 737");
        try {
            Thread.sleep( 2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Just joke, Enter the number. :))");


        int number = scanner.nextInt();
        System.out.println("Enter how many digits the number is, because I dont know how to. ");
        int numberOfDigits = scanner.nextInt();

        int temporaryNumber = number;
        int sum = 0;

        do{
        int valueOfDigit = temporaryNumber%10;
        temporaryNumber = temporaryNumber / 10;
        sum += Math.pow(valueOfDigit, numberOfDigits);

        }while (temporaryNumber>0);


        if(number == sum){
            System.out.println("*** Yes, you found an Armstrong Number, Congratulations. ***");
        }
        else{
            System.out.println("Try Again...");
        return;
        }







    }
}
