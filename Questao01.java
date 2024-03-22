/*1. Escreva um algoritmo que leia 3 números a partir do teclado.
O algoritmo deve apresentar:
a. O maior número.
b. O menor número.
c. A média aritmética dos três números.*/

package com.mycompany.psc.lista032024;
import java.util.*;

public class Questao01 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        double valor1, valor2, valor3, media, maiorNumero, menorNumero;
        
        System.out.print("Valores \n"
                + "Informe o primeiro valor: ");
            valor1 = ler.nextDouble();
        System.out.print("Informe o segundo valor: ");
            valor2 = ler.nextDouble();
        System.out.print("Informe o terceiro valor: ");
            valor3 = ler.nextDouble();
            
            maiorNumero = valor1;
            menorNumero = valor1;
            
        if (maiorNumero < valor2)  {  
            
            maiorNumero = valor2;
                    
        }if (maiorNumero < valor3)  {  
            
            maiorNumero = valor3;
                    
        }if (menorNumero > valor2)  {  
            
            menorNumero = valor2;
                    
        }if (menorNumero > valor3)  {  
            
            menorNumero = valor3;
                    
        }
        
        media = (valor1 + valor2 + valor3) / 3;
        
        System.out.print("\nO maior número é: "+maiorNumero);
        System.out.print("\nO menor número é: "+menorNumero);
        System.out.print("\nA média dos valores é: "+media);
        
    }
}
