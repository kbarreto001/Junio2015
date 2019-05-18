
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class RMIClient {


    public static void main(String[] args) throws NotBoundException, MalformedURLException, IOException {
        System.out.println("Soy el cliente");
        String[] ficheroVolcado,nMaxF;
        try{
            ServidorInterfaz objetoRemoto = (ServidorInterfaz)Naming.lookup("//localhost:1330/SERVIDOR");
            
            SupportRMIC soporte = new SupportRMIC();          
            
            ficheroVolcado = soporte.VolcarFichero();
            nMaxF=objetoRemoto.MaximosF(ficheroVolcado);
            soporte.GuardarnMaxF(nMaxF);
            
            
        } catch (RemoteException ex){
            System.out.println("Error 1: "+ex.getLocalizedMessage());
        }
    }
    
}
