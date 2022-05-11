import java.util.Scanner;

public class _3_2FindEbobEcho {

    public static int findEbob(int number1, int number2){
        int ebob = 1;
        for (int i = 1; i<=number1 && i<=number2; i++) {   //Because of the i<=number1 and number2 (which one is less) it cannot divided by the smallest number already.

            if ((number1 % i == 0) && (number2 % i == 0)) {

                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        int first_number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Second Number: ");
        int second_number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ebob: " + findEbob(first_number,second_number));




    }
}
