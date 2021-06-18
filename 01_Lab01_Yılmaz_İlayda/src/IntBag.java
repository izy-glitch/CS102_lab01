public class IntBag {

    int[] intBag;

    public IntBag() {
        intBag = new int [4];
    }

    public void addValue( int value ){
        for ( int i = 0; i < intBag.length; i++ ){
            if ( i == intBag.length - 1 ){
                int length = intBag.length;
                int temp[] = new int [ length * 2 ];
                System.arraycopy( intBag,0, temp, 0, length);
            }
        }

        this.intBag[0] = value;

        if ( intBag[ intBag.length - 1 ] != -1 ){
            this.intBag[ intBag.length - 1 ] = -1;
        }
    }

    public void addEndValue( int value ){
        for ( int i = 0; i < intBag.length; i++ ){
            if ( i == intBag.length - 1 ){
                int length = intBag.length;
                int temp[] = new int [ length * 2 ];
                System.arraycopy( intBag,0, temp, 0, length);
            }
        }

        this.intBag[ intBag.length - 2 ] = value;

        if ( intBag[ intBag.length - 1 ] != -1 ){
            this.intBag[ intBag.length - 1 ] = -1;
        }
    }

    public void addIndexValue( int value, int index ){
        for ( int i = 0; i < intBag.length; i++ ){
            if ( i == intBag.length - 1 ){
                int length = intBag.length;
                int temp[] = new int [ length * 2 ];
                System.arraycopy( intBag,0, temp, 0, length);
            }
        }

        if ( index < intBag.length ) {
            this.intBag[ index ] = value;
        }
        if ( intBag[ intBag.length - 1 ] != -1 ){
            this.intBag[ intBag.length - 1 ] = -1;
        }
    }

    public void removeIndexValue( int index ){
        int length = intBag.length;
        this.intBag[ index ] = this.intBag[ length - 2];
        this.intBag[ length - 1] = this.intBag[ length - 2];

    }

    public boolean contains ( int value ){
        int x = 0;

        for ( int i : intBag ){
            if ( i == value ){
               x++;
            }
        }
        if ( x > 0){
            return true;
        }
        return false;
    }

    public int numberOfValues(){
        return intBag.length;
    }

    public int getTheValue( int index ){
        return intBag[ index ];
    }

    public String toString() {
        String arrayString = "";
        for (int i=0; i < intBag.length; i++) {
            arrayString = arrayString + intBag[i] + "\n";
        }
        return arrayString;
    }

    public void removeAll( int value ){
        for ( int i = 0; i < intBag.length; i++ ){
            if ( intBag[i] == value ){
                removeIndexValue(i);
            }
        }
    }

}

