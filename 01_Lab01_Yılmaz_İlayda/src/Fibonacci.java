public class Fibonacci {

    public static void main (String[] args){
        IntBag fibonacci = new IntBag();
        int first = 0;
        int second = 1;

        fibonacci.addIndexValue( first, 0 );
        fibonacci.addIndexValue( second, 1 );

        for ( int i = 0; i < 38; i++){
            fibonacci.addIndexValue(fibonacci.getTheValue( i ) + fibonacci.getTheValue( i + 1 ),
                    i + 2 );
        }

        System.out.println( fibonacci );
    }
}
