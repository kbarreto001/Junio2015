
package WebSServer;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "WebSServer")
@Stateless()
public class WebSServer {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "palabra") String palabra) {        
        SupportW soporte = new SupportW();        
        return soporte.Algoritmo(palabra);
    }
}
