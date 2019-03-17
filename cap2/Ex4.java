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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int a,b;
        System.out.println("Insira valor A:");
        a = dado.nextInt();
        System.out.println("Insira valor B:");
        b = dado.nextInt();
        System.out.println("\n"+a+"+"+b+"= "+(a+b));
        System.out.println(a+"-"+b+"= "+(a-b));
        System.out.println(a+"*"+b+"= "+(a*b));
        System.out.println(a+"/"+b+"= "+((float)a/(float)b));
    }   
}
