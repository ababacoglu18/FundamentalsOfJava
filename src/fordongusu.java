
import java.util.Scanner;

public class fordongusu {
    public static void main(String[] args){




int i = 0;
int j = 10;
     for (; i < 10 && j > 0; i++,j--){         //Don't forget ; in first step.
         System.out.println("i = " + i + " j = " + j);
     }

        System.out.println("\n");
//--------------------------------------------------------------------------
     for(int a = 2; a < 100; a *= 2){
         System.out.println("a : " + a);
     }

        System.out.println("\n");
//--------------------------------------------------------------------------
//Faktoriyel Islemi

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktoriyel Sayisi Gİriniz: ");

        int faktoriyelToplam =  1;

        int sayi = scanner.nextInt();



        for(int c = 1; c <= sayi; c++){

            faktoriyelToplam *= c;


        }
        if(sayi>0) {
            System.out.println("Faktoriyel = " + faktoriyelToplam);
        }
        else{
            System.out.println("Hatali Islem...");

        }




    }
}
