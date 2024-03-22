/*Escreva um algoritmo que resolva uma equação de segundo grau, realizando a
verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do
discriminante (delta).
a. Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de
zero, apresentar a mensagem "Coeficientes informados incorretamente.".
b. Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero,
deverá ser impressa a mensagem: "Essa é uma equação de primeiro grau" e deverá
ser informado o valor da raiz real da equação.
c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: "Esta
equação não possui raízes reais".
d. Caso o discriminante seja zero, apresentar a mensagem "Esta equação possui duas
raízes reais iguais. " e informar o valor das raízes da equação.
e. Caso o discriminante seja maior que zero, apresentar a mensagem "Esta equação
possui duas raízes reais diferentes. " e informar o valor das raízes da equação.*/
package com.mycompany.psc.lista032024;
import java.util.*;

public class Questao03 {
    public static void main(String[] args) {
        
        Scanner ler  = new Scanner(System.in);
        
        double a, b, c;
        
        System.out.println("Informe os coeficientes da equação ax^2 + bx + c = 0:");
        System.out.print("a: ");
             a = ler.nextDouble();
        System.out.print("b: ");
             b = ler.nextDouble();
        System.out.print("c: ");
             c = ler.nextDouble();
        
        
        if (a == 0 && b == 0 && c != 0) {
            
            System.out.println("Coeficientes informados incorretamente.");
            return;
            
        } else if (a == 0 && b != 0) {
            
            double x = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("A raiz real da equação é: " +x);
            return;
        }
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            
            System.out.println("Esta equação não possui raízes reais.");
            
        } else if (delta == 0) {
            
            double raiz = -b / (2 * a);
            System.out.println("Esta equação possui duas raízes reais iguais: " + raiz);
            
        } else {
            
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }    
}
