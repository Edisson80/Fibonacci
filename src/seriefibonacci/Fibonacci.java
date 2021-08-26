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
public class Fibonacci {

    private int numeroLimite;
    private int resultadoDeLaSerie;

    public Fibonacci(int numeroLimite) {
        this.numeroLimite = numeroLimite;
    }

    /**
     * @return the numeroLimite
     */
    public int getNumeroLimite() {
        return numeroLimite;
    }

    /**
     * @param numeroLimite the numeroLimite to set
     */
    public void setNumeroLimite(int numeroLimite) {
        this.numeroLimite = numeroLimite;
    }

    /**
     * @return the resultadoDeLaSerie
     */
    public int getResultadoDeLaSerie() {
        return resultadoDeLaSerie;
    }

    /**
     * @param resultadoDeLaSerie the resultadoDeLaSerie to set
     */
    public void setResultadoDeLaSerie(int resultadoDeLaSerie) {
        this.resultadoDeLaSerie = resultadoDeLaSerie;
    }

    public void imprimirSerieFibonacci() {
        System.out.println("--------------------------------");
        System.out.println("la serie fibonaccio de longitud" + this.numeroLimite + "es: ");
        for (int i = 0; i < this.numeroLimite; i++) {
            System.out.println(this.calcularFibonacci(i) + " ");
            this.resultadoDeLaSerie = this.calcularFibonacci(i);
        }
        System.out.println();
        System.out.println("-----------------");

    }

    public void imprimirNumeroPrimo() {
        if (this.primo(this.resultadoDeLaSerie)) {
            System.out.println(this.resultadoDeLaSerie + " el numero resultante es primo");

        } else {
            System.out.println(this.resultadoDeLaSerie + " EL NUMERO RESULTANTE NO ES PRIMO");
        }
    }
   private boolean primo(int numero){
       int contador = 0;
       boolean primo = false;
       for (int i = 1; i <= numero; i++){
           if (numero % i == 0){
               contador +=1;
           }
       }
       if (contador == 2){
           primo = true;
           
       }
   return primo;
   }
    private int calcularFibonacci(int resultado) {
        if (resultado == 0) {
            return 0;
        } else if (resultado == 1) {
            return 1;
        } else {
            return this.calcularFibonacci(resultado - 1) + this.calcularFibonacci(resultado - 2);
        }
    }

}
