/*4. Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de
operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o
primeiro valor lido seja:
a. 1: calcular e imprimir o perímetro do círculo.
b. 2: calcular e imprimir a área do círculo.
c. 3: calcular e imprimir o volume da esfera.
Se o primeiro valor lido for diferente desses três valores possíveis, imprimir uma
mensagem de erro, informando que o código da operação é inválido.*/
package com.mycompany.psc.lista032024;
import java.util.*;

public class Questao04 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int operacao;
        double raio;

        System.out.print("Digite o código da operação "
                + "\n\n1 - para perímetro do círculo \n"
                + "2 - para área do círculo \n"
                + "3 - para volume da esfera \n"
                + "Informe: ");
            operacao = ler.nextInt();

        System.out.println("Digite o raio do círculo ou esfera: ");
            raio = ler.nextDouble();

        if (operacao == 1) {
            
            double perimetro = 2 * Math.PI * raio;
            System.out.printf("Perímetro do círculo: %.2f" ,perimetro);
            
        } else if (operacao == 2) {
            
            double area = Math.PI * raio * raio;
            System.out.printf("Área do círculo: %.2f" ,area);
            
        } else if (operacao == 3) {
            
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
            System.out.printf("Volume da esfera: %.2f",volume);
            
        } else {
            
            System.out.print("Código de operação inválido.");
            
        }

    }
}
