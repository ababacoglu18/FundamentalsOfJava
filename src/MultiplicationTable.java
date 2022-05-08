import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Multiplication Table. ");
        int i ;


        for(i = scanner.nextInt() ; i<=10 ; i++){
            System.out.println("*******************************");
            for(int j = 1; j<= 10 ; j++){
                System.out.println(i*j);

            }

            System.out.println("*******************************");
            break;

        }
    }
}
