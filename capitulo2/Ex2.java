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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        float contaBancaria = 0;
        System.out.println("Sua conta tem R$"+contaBancaria+" reais.");
        System.out.println("Digite o valor do depósito: ");
        contaBancaria += dado.nextFloat();
        System.out.println("Sua conta tem R$"+contaBancaria+" reais.");
        System.out.println("Digite o valor do saque:");
        contaBancaria -= dado.nextFloat();
        System.out.println("Sua conta tem R$"+contaBancaria+" reais.");
        
    }
}
