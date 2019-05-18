
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServidorInterfaz extends Remote {

    public int suma(int a, int b) throws RemoteException;

    public String[] MaximosF(String[] ficheroVolcado) throws RemoteException;
}
