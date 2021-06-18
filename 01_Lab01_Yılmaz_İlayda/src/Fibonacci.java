public class Fibonacci {

    public static void main (String[] args){
        IntBag fibonacci = new IntBag();
        int first = 0;
        int second = 1;
        int nextNumber;

        fibonacci.addValue( first );
        fibonacci.addValue( second );

        for ( int i = 0; fibonacci.numberOfValues() <= 38; i++){

            nextNumber = fibonacci.getTheValue( i ) + fibonacci.getTheValue( i + 1 );
            fibonacci.addValue( nextNumber );

        }

        System.out.println( fibonacci );
    }
}
