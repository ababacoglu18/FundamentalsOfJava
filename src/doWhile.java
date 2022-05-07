import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        /*Do while'ın While'dan farkı koşul kontrol edilmeden
        en az 1 kere çalısmayı garanti eder.
         */
int i = 0;

        do {
            System.out.println(i);
            i++;
        }while(i<5);

        //Sadece while ile yazilsa
        i = 0;
        System.out.println("\n");
        while (i<5){
            System.out.println(i);
            i++;

        }


        // Girilen sayinin rakamlari toplami..

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayiyi gir ");
        int toplam = 0;

        int sayi = scanner.nextInt();
        do {
            toplam += sayi %10;
            sayi = sayi /10;

        }while(sayi > 0);

        System.out.println("Rakamları toplamı = " + toplam);

        //Break kullanim

        sayi = 0;

        while(sayi <= 20){
            sayi++;
            System.out.println("sayi = " + sayi);
            if(sayi == 10){
                break;
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" \n Break Sayisi  Gir. ");



        while (true){

            int a = scanner1.nextInt();
            if(a == -1){
                System.out.println("Donguden Cikiliyor.");
                break;
        }

            System.out.println("Donguden cikilamiyor.. \n" + a);

        }

        //Continue..

        for(int d = 0; d < 10 ; d++){
            if(d == 3 || d == 5) {

                continue;                       //d = 3 || 5 oldugunda dongu calismayacak.
            }
            System.out.println("d = " + d);
        }


    }
}
