import java.io.IOException;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000); // Conecta al servidor en el puerto 5000
            ClienteThread clienteThread = new ClienteThread(socket);
            clienteThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
