/*5. Escrever um algoritmo que leia a partir do teclado dois números reais e um dos
símbolos de operação: + , - , * , / ou ^ .
O algoritmo deve retornar o resultado da operação.
Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo
deve apresentar uma mensagem de erro, informando que o símbolo da operação é
inválido.*/
package com.mycompany.psc.lista032024;
import java.util.*;

public class Questao05 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double numero1, numero2;
        char operacao;
       
        System.out.print("Digite o primeiro número: ");
            numero1 = ler.nextDouble();
            
        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
            operacao = ler.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
            numero2 = ler.nextDouble();
        
        
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        if (operacao == '+') {
            
            resultado = numero1 + numero2;
            
        } else if (operacao == '-') {
            
            resultado = numero1 - numero2;
            
        } else if (operacao == '*') {
            
            resultado = numero1 * numero2;
            
        } else if (operacao == '/') {
            
            if (numero2 != 0) {
                
                resultado = numero1 / numero2;
                
            } else {
                
                System.out.println("Erro: Divisão por zero.");
                operacaoValida = false;
                
            }
        } else if (operacao == '^') {
            
            resultado = Math.pow(numero1, numero2);
            
        } else {
            
            System.out.println("Erro: Símbolo de operação inválido.");
            operacaoValida = false;
        }
        
        
        if (operacaoValida) {
            System.out.println("O resultado da operação é: " + resultado);
        }
    }
}
