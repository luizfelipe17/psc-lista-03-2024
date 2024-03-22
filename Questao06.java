/*6. Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número
aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo
teclado, para que independente da ordem que o usuário digite os números, consiga
realizar o sorteio.
Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que
ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e
que ele é um número ímpar.
*/
package com.mycompany.psc.lista032024;
import java.util.*;

public class Questao06 {
    public static void main (String[] args){
    
        Scanner ler = new Scanner(System.in);
        
        int numero1, numero2, menorNumero, maiorNumero;
    
        System.out.print("Digite o primeiro número inteiro: ");
             numero1 = ler.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
             numero2 = ler.nextInt();
        
            menorNumero = Math.min(numero1, numero2);
            maiorNumero = Math.max(numero1, numero2);
        
        Random random = new Random();
        int numeroSorteado = random.nextInt(maiorNumero - menorNumero + 1) + menorNumero;
        
        System.out.print("\nNúmero sorteado: " +numeroSorteado);
        
        if (numeroSorteado % 2 == 0) {
            System.out.println("\n\nO número sorteado é par.");
        } else {
            System.out.println("\nO número sorteado é ímpar.");
        }
    }    
}
