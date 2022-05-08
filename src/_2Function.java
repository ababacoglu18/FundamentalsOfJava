import java.util.Scanner;

public class _2Function {

    public static void hi(){

        System.out.println("What's up? ");
    }
        public static void factorial(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number.");
            int number = scanner.nextInt();

            int factorialValue = 1;

            for(int i = 1; i <= number; i++){
                factorialValue *= i;
            }
            System.out.println(factorialValue);
        }


        public static void main(String[] args){

        factorial();



    }
}
