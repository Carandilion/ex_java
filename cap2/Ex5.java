/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjava_cap1;

import java.util.Scanner;

/**
 *
 * @author mtafrias
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        System.out.println("Insira o tamanho do arquivo em bytes: ");
        int bytes = dado.nextInt();
        System.out.println("Tamanho do arquivo em bytes: "+bytes);
        System.out.println("Segundos necessários para download: "+((float)bytes*8)/2000000);
    }
    
}
