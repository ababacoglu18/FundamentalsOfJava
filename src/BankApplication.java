import java.util.Scanner;

import java.util.concurrent.TimeUnit;


public class BankApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int bakiye  = 1000;
        String islemler = "1. Islem: Bakiye Ogrenme \n"
                +           "2. Islem: Para Çekme\n"
                +           "3. Islem: Para Yatırma\n"
                +           "Çıkış için q ya basın\n"
                +           "4. Islem: Transfer\n";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");


        while (true){
            System.out.println("Yapılacak işlemi seçiniz. ");
            String islem = scanner.nextLine();

            if(islem.equals("q")  ){

                System.out.println("Islemden Çıkılıyor. ");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: " + bakiye);

            }
            else if(islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutar.");
                int tutar = scanner.nextInt();
                scanner.nextLine();          //Donus yaptiktan sonra satir atlamasi icin yapildi

                if(bakiye - tutar < 0){
                    System.out.println("Yeterli Bakiye yok, Bakiyeniz: " + bakiye +" TL");
                }
                else {
                    System.out.println("Paranız Hazırlanıyor.");
                    TimeUnit.SECONDS.toSeconds(2);
                    bakiye -= tutar;
                    System.out.println("Yeni Bakiyeniz " + bakiye);
                }}
            else if(islem.equals("3")) {
                System.out.println("Yatirmak istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);

            }
            else if(islem.equals("4")){
                System.out.println("Transfer etmek istediğiniz tutar.");
                int tutar = scanner.nextInt();
                scanner.nextLine();          //Donus yaptiktan sonra satir atlamasi icin yapildi

                if(bakiye - tutar < 0){
                    System.out.println("Yeterli Bakiye yok, Bakiyeniz: " + bakiye +" TL");
                }
                else {
                    System.out.println("Tutar Gonderiliyor.");
                    TimeUnit.SECONDS.toSeconds(2);
                    bakiye -= tutar;
                    System.out.println("Islem Basarili. ");
                    System.out.println("Yeni Bakiyeniz " + bakiye);
                }}
            else{
                System.out.println("Geçersiz İşlem. ");
            }
        }
}
}
