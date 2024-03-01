public class Main {
    public static void main ( String[ ] args ) {
        int numThreads = 5 ; // Nmero de hilos a crear
        for ( int i = 0 ; i < numThreads ; i++) {
            Thread thread = new Thread (new MiRunnable( )) ;
            thread.start ( ) ;
        }
    }

    static class MiRunnable implements Runnable {
        public void run ( ) {
            System . out.println("Hola desde el hilo : " + Thread.currentThread( ).getName( )) ;
        }
    }

}