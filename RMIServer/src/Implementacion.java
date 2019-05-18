
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementacion extends UnicastRemoteObject implements ServidorInterfaz {

    Implementacion() throws RemoteException {
        super();
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public String[] MaximosF(String[] ficheroVolcado) throws RemoteException {
        String[] nMaxF;        
        
        return nMaxF = Algoritmo(ficheroVolcado);
    }

    public String[] Algoritmo(String[] ficheroVolcado) {
        int nMax = 0;
        String[] tmp1, tmp2;
        tmp1 = ficheroVolcado[0].split(" ");
        String[] nMaxF = new String[Integer.parseInt(tmp1[0])];
        for (int i = 0; i < Integer.parseInt(tmp1[0]); i++) {
            tmp2 = ficheroVolcado[i + 1].split(" ");
            for (int j = 0; j < tmp2.length; j++) {
                if ((Integer.parseInt(tmp2[j])) > nMax) {
                    nMax = Integer.parseInt(tmp2[j]);
                    nMaxF[i] = tmp2[j];
                }
            }
            nMax = 0;
        }

        return nMaxF;
    }
}
