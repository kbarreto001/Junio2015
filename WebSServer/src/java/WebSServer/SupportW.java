package WebSServer;


public class SupportW {

    public String Algoritmo(String palabra) {
        String respuesta,tmp2;
        tmp2 = palabra.toLowerCase();
        char[] tmp1 = tmp2.toCharArray();
        int counter=0;
        for (int i = 0; i < (palabra.length() / 2); i++) {
            if (tmp1[i]==tmp1[palabra.length()-1-i]){
                counter++;
            }
        }        
        if(counter>=palabra.length() / 2){
            respuesta = "Si es palindromo";
        } else respuesta = "No es palindromo";

        return respuesta;
    }

}
