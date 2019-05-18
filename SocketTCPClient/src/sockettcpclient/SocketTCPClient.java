package sockettcpclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketTCPClient {

    public static void main(String[] args) throws IOException {
        System.out.println("Soy el cliente");
        String[] ficheroVolcado,nMaxF;
        try(
                Socket client = new Socket("localhost",5000);
                DataInputStream disSocket = new DataInputStream(client.getInputStream());
                DataOutputStream dosSocket = new DataOutputStream(client.getOutputStream());
                ){
            
            SupportC soporte = new SupportC();
            
            ficheroVolcado=soporte.VolcarFichero();
            soporte.EnviarFichero(ficheroVolcado, dosSocket);
            nMaxF = soporte.RecibirnMaxF(disSocket);
            soporte.GuardarnMaxF(nMaxF);
            
        }
        
    }
    
}
