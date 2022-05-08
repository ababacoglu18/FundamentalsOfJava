import java.util.Scanner;

public class UserLoginPage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rightToTry = 3;

        String sys_user_name = "Altan Babacoglu";
        String sys_password  = "12345";

        System.out.println("**********************************");
        System.out.println("Welcome to Our Program");
        System.out.println("**********************************");

        while (true){
            System.out.println("User Name: ");
            String userID = scanner.nextLine();
            System.out.println("Password");
            String password = scanner.nextLine();

            if(userID.equals(sys_user_name) && password.equals(sys_password)){
                System.out.println("Welcome, " + sys_user_name);
                break;
            }
            else if(userID.equals(sys_user_name) && !password.equals(sys_password)){
                System.out.println("Wrong password Try Again");
                rightToTry -= 1;
                System.out.println("You have " + rightToTry + " entries left. ");
            }
            else {
                System.out.println("User Not Found");
                rightToTry -= 1;
                System.out.println("You have " + rightToTry + " entries left. ");
            }

            if(rightToTry <=0 ){

                System.out.println("Check Your Email Adress.");
                break;
            }
        }
    }
}
