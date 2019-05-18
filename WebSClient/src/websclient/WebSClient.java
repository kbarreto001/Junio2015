
package websclient;

public class WebSClient {

    public static void main(String[] args) {
        SupportC soporte = new SupportC();
        System.out.println(operation(soporte.Cadena()));
    }

    private static String operation(java.lang.String palabra) {
        websserver.WebSServer_Service service = new websserver.WebSServer_Service();
        websserver.WebSServer port = service.getWebSServerPort();
        return port.operation(palabra);
    }
    
}
