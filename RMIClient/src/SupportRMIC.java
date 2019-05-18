
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SupportRMIC {

    protected File File1 = new File("File1.txt");
    protected File File2 = new File("File2.txt");

    public String[] VolcarFichero() throws FileNotFoundException, IOException {
        String tmp1;
        int counter = 0;
        String[] ficheroVolcado = null;
        try (
                BufferedReader brT = new BufferedReader(new FileReader(File1));
                BufferedReader br = new BufferedReader(new FileReader(File1));) {

            while ((tmp1 = brT.readLine()) != null) {
                counter++;
            }

            ficheroVolcado = new String[counter];
            for (int i = 0; i < ficheroVolcado.length; i++) {
                ficheroVolcado[i] = br.readLine();
            }
        }
        return ficheroVolcado;
    }

    public void GuardarnMaxF(String[] nMaxF) throws IOException {
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(File2));) {
            for (int i = 0; i < nMaxF.length; i++) {
                bw.write(nMaxF[i] + "\n");
            }
        }
    }

}
