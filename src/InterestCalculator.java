import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("Welcome to Pekao Bank Interest Calculator. Today's rate % 6");
        System.out.println("************************************");

        int principal;
        int maturity;
        System.out.print("Amount you want to deposit: ");
        principal = scanner.nextInt();
        System.out.print("For how many years do you want to deposit your money? ");
        maturity = scanner.nextInt();

        System.out.println("Calculating Please Wait...");
        try {
            Thread.sleep( 2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        double totalMoney = principal;
        double interestRate = 0.06;

        for(int i = 1; i <= maturity; i++){
            totalMoney = (totalMoney * interestRate) + totalMoney;

            if(i % 10 == 1){
                System.out.println("Your money at the end of the " + i + "st year is " + (int)totalMoney + " $");
            }
           else if(i % 10 == 2){
                System.out.println("Your money at the end of the " + i + "nd year is " + (int)totalMoney + " $");
            }
            else if(i % 10 == 3){
                System.out.println("Your money at the end of the " + i + "rd year is " + (int)totalMoney + " $");
            }
           else{
                System.out.println("Your money at the end of the " + i + "th year is " + (int)totalMoney + " $");
            }
            try {
                Thread.sleep( 400);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
