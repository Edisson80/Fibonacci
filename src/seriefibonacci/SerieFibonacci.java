/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

/**
 *
 * @author EDISSON
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Fibonacci objFibonacci = new Fibonacci(11);
        objFibonacci.imprimirSerieFibonacci();
        objFibonacci.imprimirNumeroPrimo();
    }
}
