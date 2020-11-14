
package primeiroprograma;

import java.util.Scanner;


public class PrimeiroPrograma {

   
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int di5 = 0;
        int nulo = 0;
        int somapares = 0;
        float media = 0;
        int totNum = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "o. valor: ");
            int v = teclado.nextInt();
            soma = soma + v;
            if (v%5 == 0) {
                di5++;
            }
            if (v == 0) {
                nulo++;
            }
            if (v%2 == 0) {
                somapares = somapares + v;
            }
            totNum = i;
        }
        
        media = soma / totNum;
        
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);
        System.out.println("Valores divisíveis por 5: " + di5);
        System.out.println("Valores nulos: " + nulo);
        System.out.println("Soma dos valores pares: " + somapares);
        
        
        
    } // fim do void main
} // fim da classe primeiro programa
             
    
    


