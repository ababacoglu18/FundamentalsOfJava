public class _2_5LocalVariables {



    public static void sum(int z, int b, int c){


        System.out.println("Result: "  + (z + b +c ));
    }


    public static void main(String[] args){
        int a =4;            //variable a connected with main method.
        String print = "hi";

        if(a<10){
            int b = 5;           //b is local variable for if block.
            System.out.println(print);
        }
        //********************************************************************\\

        int d = 1;

        while (d < 10){

            if(d%2 == 0){
                    String print2 = "Even " + d;
                System.out.println(print2);
            }
                    d++;
            //*************************************************************\\


            sum(10,20,30);  //
          // System.out.println(z);   //no funcionará porque la variable z está definida solo para la función de suma
        }
    }
}
