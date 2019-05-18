package sockettcpserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCPServer {

    public static void main(String[] args) {
        int counter = 1, size = 1000;
        String[] ficheroVolcado,nMaxF;
        System.out.println("Soy el server");
        try {
            ServerSocket server = new ServerSocket(5000, size);
            while (true) {
                Socket connection = server.accept();
                DataInputStream disSocket = new DataInputStream(connection.getInputStream());
                DataOutputStream dosSocket = new DataOutputStream(connection.getOutputStream());
                System.out.println("Conexion No: "+counter+" from: "+connection.getInetAddress().getHostName());
                
                SupportS soporte = new SupportS();
                
                ficheroVolcado=soporte.RecibirFichero(disSocket);
                nMaxF = soporte.Algoritmo(ficheroVolcado);
                soporte.EnviarnMaxF(dosSocket, nMaxF);
                
                connection.close();
                disSocket.close();
                dosSocket.close();
                counter++;

            }
        } catch (IOException ex) {
            System.out.println("Error 1: " + ex.getLocalizedMessage());
        }

    }

}
