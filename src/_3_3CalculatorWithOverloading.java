import java.util.Scanner;

public class _3_3CalculatorWithOverloading {

    public static int minus(int a, int b){

        return (a-b);
    }

    public static double divide(int a, int b){

        return  ((double)a / b);
    }
    public static int add(int a, int b){

        return (a+b);
    }
    public static int add(int a, int b,int c){

        return (a+b+c);
    }

    public static int multiply(int a, int b,int c){

        return (a*b*c);
    }
    public static int multiply(int a, int b){

        return (a*b);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String calculations = "1. Add \n" +
                "2. Minus \n" +
                "3. Multiply by \n" +
                "4. Divide \n " +
                "Press q for exit.";


        System.out.println("*************************************************");
        System.out.println(calculations);
        System.out.println("*************************************************");

        while (true) {
            System.out.println("Choose Operation");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {

                System.out.println("Exiting Program...");
                break;
            } else if (operation.equals("1")) {
                System.out.print("How many value you will enter? (2 or 3)");
                int howManyNumber = scanner.nextInt();
                if (howManyNumber == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println(add(a, b));

                } else if (howManyNumber == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println(add(a, b, c));

                } else {
                    System.out.println("Invalid Transaction...");
                }
            } else if (operation.equals("2")) {


                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();

                scanner.nextLine();

                System.out.println(minus(a, b));


            } else if (operation.equals("3")) {
                System.out.print("How many value you will enter? (2 or 3)");
                int howManyNumber = scanner.nextInt();
                if (howManyNumber == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println(multiply(a, b));

                } else if (howManyNumber == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println(multiply(a, b, c));

                } else {
                    System.out.println("Invalid Transaction...");}
        }  else if (operation.equals("4")){


                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();

                scanner.nextLine();

                System.out.println(divide(a, b));


            }
    }}}
