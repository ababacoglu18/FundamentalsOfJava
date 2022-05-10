public class _2Return {


    public static int multiplyBy2(int a){

        return a*2;
    }

    public static int addBy2(int a){

        return a+2;
    }
    public static int multiplyBy4(int a){

        return a*4;
    }



    public static int sum(int a, int b, int c){
                                                        //Void function cannot return a value.
        return (a+b+c);                                   //So we have to change parameter void to as we wish.

    }
    public static void main(String[] args){

        System.out.println("Result: " + sum(3,4,5));


        System.out.println("Result: " + multiplyBy4(addBy2(multiplyBy2(8))));   //Using return in different methods.


    }
}
