public class _2_5LocalVariables {




    public static void main(String[] args){
        int a =4;            //variable a connected with main method.
        String print = "hi";

        if(a<10){
            int b = 5;           //b is local variable for if block.
            System.out.println(print);
        }


        for(int i = 0; i<10;i++){

            System.out.println(i); // i local for i
        }
       // System.out.println(i); it wont work.
    }
}
