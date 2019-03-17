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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        System.out.println("Insira seu peso: ");
        float peso = dado.nextFloat();
        System.out.println("Insira sua altura: ");
        float altura = dado.nextFloat();
        float imc = peso/(altura*altura);
        if(imc<18.5)
            System.out.println("Peso abaixo do normal.");
        else if(imc>=18.5 && imc<=24.4)
            System.out.println("Peso ideal.");
        else if(imc>=24.5 && imc<=29.9)
            System.out.println("Pré-obesidade");
        else if(imc>=30 && imc<=34.9)
            System.out.println("Obesidade Classe I.");
        else if(imc>=35 && imc<=39.9)
            System.out.println("Obesidade Classe II (severa).");
        else if(imc>39.9)
            System.out.println("Obesidade Classe III (mórbida).");
    }
    
}
