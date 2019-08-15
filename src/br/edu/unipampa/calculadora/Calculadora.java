/*
 * Classe responsável por efetuar calculos matemáticos
 */
package br.edu.unipampa.calculadora;

/**
 *
 * @author Douglas Giordano
 */
public class Calculadora {
    public Calculadora(){
        
    }
    
    /**
     * Recebe dois números e efetua a soma.
     * @param n1
     * @param n2
     * @return soma n1+n2
     */
    public float somar(float n1, float n2){
        return n1+n2;
    }
    
    /**
     * Recebe dois números e efetua a subtração.
     * @param n1
     * @param n2
     * @return subtração n1-n2
     */
    public float subtrair(float n1, float n2){
        return n1-n2;
    }
    
    /**
     * Recebe dois números e efetua a multiplicação
     * @param n1
     * @param n2
     * @return multiplicação n1*n2
     */
    public float multiplicar(float n1, float n2){
        return n1*n2;
    }
    
    /**
     * Recebe dois números e efetua a divisão
     * @param n1
     * @param n2
     * @return divisão n1/n2
     */
    public float dividir(float n1, float n2){
        return n1/n2;
    }
    
    /**
     * Calcula a raiz quadrada de um número
     * @param n1
     * @return raiz quadrada de n1
     */
    public double calcularRaizQuadrada(double n1){
        return Math.sqrt(n1);
    }
    
    /**
     * Calcula a raiz cúbica de um número
     * @param n1
     * @return raiz cúbica de n1
     */
    public double calcularRaizCubica(double n1){
        return Math.cbrt(n1);
    }
    
    /**
     * Calcula a potência de um número base elevado a determinado expoente
     * @param base
     * @param expoente
     * @return potencia
     */
    public double calcularPotencia(double base, double expoente){
        return Math.pow(base, expoente);
    }
}
