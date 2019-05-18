
package webservice;


public class WebService {


    public static void main(String[] args) {
        String palabra;
        
        SupportW soporte = new SupportW();
        
        palabra = soporte.RecibiendoCadena();
        
        System.out.println("Respuesta: "+soporte.Algoritmo(palabra));
        
    }
    
}
