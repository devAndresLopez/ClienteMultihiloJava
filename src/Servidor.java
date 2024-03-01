import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000); // Puerto del servidor

            while (true) {
                Socket socket = serverSocket.accept(); // Espera por la conexión del cliente
                System.out.println("Cliente conectado.");

                //ClienteHandler clienteHandler = new ClienteHandler(socket);
                //Thread clienteThread = new Thread(clienteHandler);
                //clienteThread.start();

                int numThreads = 2 ;
                for ( int i = 0 ; i < numThreads ; i++) {
                    ClienteHandler clienteHandler = new ClienteHandler(socket);
                    Thread clienteThread = new Thread(clienteHandler);
                    clienteThread.start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
