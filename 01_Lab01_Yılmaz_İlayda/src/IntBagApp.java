import java.util.Scanner;

public class IntBagApp {
    public static void displayMenu(){
        System.out.println( "----------------MENU----------------" );
        System.out.println( "1. Create a new empty collection(any previous values are lost!)" );
        System.out.println( "2. Read a set of positive values into the collection (use zero to indicate all the values " +
                "have been entered.)" );
        System.out.println( "3. Print the collection of values." );
        System.out.println( "4. Add a value to the collection of values at a specified location." );
        System.out.println( "5. Remove the value at a specified location from the collection of values." );
        System.out.println( "6. Remove all instances of a value within the collection." );
        System.out.println( "7. Quit the program." );

        System.out.print( "Enter choice: " );
    }

    public static void main( String args[]){

        boolean noQuit = true;
        Scanner input = new Scanner( System.in );
        IntBag collection = new IntBag();
        int choice;
        int value;
        int index;

        do{
            displayMenu();
            choice = input.nextInt();

            if ( choice == 1 ){
                collection = new IntBag();
            }
            else if ( choice == 2 ){
                do{
                    System.out.println( "Enter the value: " );
                    value = input.nextInt();
                    collection.addEndValue( value );
                } while( value != 0 );
            }
            else if ( choice == 3 ){
                System.out.println( collection.toString() );
            }
            else if ( choice == 4 ){
                System.out.println( "Enter the value: " );
                value = input.nextInt();
                System.out.println( "Enter the index: " );
                index = input.nextInt();
                collection.addIndexValue( value, index);
            }
            else if ( choice == 5 ){
                System.out.println( "Enter the index: " );
                index = input.nextInt();
                collection.removeIndexValue( index );
            }
            else if ( choice == 6 ){
                System.out.println( "Enter the value: " );
                value = input.nextInt();
                collection.removeAll( value );
            }
            else if ( choice == 7 ) {
                System.out.println( "Goodbye!" );
                noQuit = false;
            }
        }while ( noQuit );
    }
}
