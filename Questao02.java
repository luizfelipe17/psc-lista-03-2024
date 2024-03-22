/*Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces,
sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve
ser dado de troco para um pagamento efetuado.
O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que
o valor da compra, a máquina deve apresentar uma mensagem, informando que a
quantia paga é insuficiente para realizar a compra. A máquina aceita apenas notas de
R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.
*/
package com.mycompany.psc.lista032024;
import java.util.*;

public class Questao02 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0, valorPago;
        double valorTotal, troco, troco1;
        
        
        System.out.print("Supermercado\nInforme o valor da compra: ");
            valorTotal = ler.nextDouble();
        System.out.print("Qual foi o valor pago (Cédulas): ");
            valorPago = ler.nextInt();

            troco =  valorPago - valorTotal; 
            troco1 =  valorPago - valorTotal; 
         
         if (valorPago < valorTotal){
             
             System.out.print("\nA quantia paga é insuficiente para realizar a compra ");
             
         }   
          
         while (troco >= 50){
             
             troco -= 50;
             
             nota50++;
             
         }while (troco >= 20){
             
             troco -= 20;
             
             nota20++;
             
         }while (troco >= 10){
             
             troco -= 10;
             
             nota10++;
             
         }while (troco >= 5){
             
             troco -= 5;
             
             nota5++;
             
         }while (troco >= 2){
             
             troco -= 2;
             
             nota2++;
             
         }while (troco > 1){
             
             troco -= 1;
             
             nota1++;
             
         }
         
         System.out.print("O TOTAL DA COMPRA FOI DE: "+valorTotal+"\n"
                 + "VALOR PAGO: "+valorPago+"\n"
                         + "TROCO: "+troco1+"\n\n"
                                 + "Notas de R$ 50,00: "+nota50+"\n" +
                   "Notas de R$ 20,00: "+nota20+"\n" +
                   "Notas de R$ 10,00: "+nota10+"\n" +
                   "Notas de R$ 5,00: "+nota5+"\n" +
                   "Notas de R$ 2,00: "+nota2+"\n" +
                   "Notas de R$ 1,00: "+nota1); 
         
    }
}
