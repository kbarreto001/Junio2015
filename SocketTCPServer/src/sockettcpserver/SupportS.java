package sockettcpserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class SupportS {

    public String[] RecibirFichero(DataInputStream disSocket) {
        String[] ficheroVolcado = null;
        int size;
        try {
            size = disSocket.readInt();
            ficheroVolcado = new String[size];
            for (int i = 0; i < ficheroVolcado.length; i++) {
                ficheroVolcado[i] = disSocket.readUTF();
            }
        } catch (IOException ex) {
            System.out.println("Error 1: " + ex.getLocalizedMessage());
        }
        return ficheroVolcado;
    }

    public String[] Algoritmo(String[] ficheroVolcado) {
        int nMax = 0;
        String[] tmp1, tmp2;
        tmp1 = ficheroVolcado[0].split(" ");
        String[] nMaxF = new String[Integer.parseInt(tmp1[0])];
        System.out.println("Numero de filas: " + nMaxF.length);
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
        for (int i = 0; i < nMaxF.length; i++) {
            System.out.println(nMaxF[i]);
        }
        return nMaxF;
    }

    public void EnviarnMaxF(DataOutputStream dosSocket, String[] nMaxF) {
        try {
            dosSocket.writeInt(nMaxF.length);
            for(int i=0;i<nMaxF.length;i++){
                dosSocket.writeUTF(nMaxF[i]);
            }
        } catch (IOException ex) {
            System.out.println("Error 1: " + ex.getLocalizedMessage());
        }
    }

}
