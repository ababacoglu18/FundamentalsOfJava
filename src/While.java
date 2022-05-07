import java.util.Scanner;

public class While {

    public static void main(String[] args){

//While ile faktroriyel hesabı.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");

        int sayi = scanner.nextInt();

        int faktoriyel = 1;
        while(sayi >0){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel Sonucu: " + faktoriyel);

        //-----------------------------------------------------




    }
}
