/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjava_cap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mtafrias
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader scanf= new InputStreamReader(System.in);
        BufferedReader dado=new BufferedReader(scanf);
        System.out.println("Insira base do triângulo: ");
        String base = dado.readLine();
        System.out.println("Insira altura do triângulo: ");
        String altura = dado.readLine();
        System.out.println("Área do Triângulo é: "+(Float.parseFloat(base)*Float.parseFloat(altura))/2);
    }
    
}
