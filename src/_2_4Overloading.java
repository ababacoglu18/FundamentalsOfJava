public class _2_4Overloading {

    public static void sum(int a, int b){

        System.out.println("Sum = " + a+b);
    }
    public static void sum(String a, String b){

        System.out.println(a + "Hi " +b + "\n");
    }
        public static void sum(int a, int b, int c){            //java allowed us even though the function names are the same...
                                                                //Overloaded function.
            System.out.println("Sum = " + a+b+c);
        }



        //***************************************************************************************************\\



    public static void calculateScore(String first, int score){

        System.out.println(first + " has " + score + " points.");
    }
    public static void calculateScore( int score){

        System.out.println("Unnamed" + " has " + score + " points.");
    }
    public static void calculateScore( String name){

        System.out.println(name  + " has " + "no points.");
    }




    public static void main(String[] args){

                sum(3,4,5);
                sum(3,4);
                sum("Java","Dude.!");

                //************************************************************************************\\

        calculateScore("Ahmet",20);
        calculateScore(20);
        calculateScore("Thomas");



    }
}
