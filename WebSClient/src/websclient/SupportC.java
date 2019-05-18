/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websclient;

import java.util.Scanner;

/**
 *
 * @author kbarreto001
 */
public class SupportC {
    
    public String Cadena(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cadena");
        return sc.next();
    }
    
}
