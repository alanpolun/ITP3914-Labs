public class Ex6b {
    public static void main( String[] args ) {
        int i = 5;
        do {
           System.out.println( i-- );
        } while ( i >= 0 );
        System.out.println( "After loop, i=" + i );
     }
}