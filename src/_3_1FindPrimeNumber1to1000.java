public class _3_1FindPrimeNumber1to1000 {



    public static boolean isPrimeNumber(int number){
        for(int i =2 ; i < number; i++){

            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        for(int i = 2; i<=1000; i++){

            if (isPrimeNumber(i)){
                System.out.println(i);

            }
        }
    }
}
