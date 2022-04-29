/*
Faça um programa que leia 10 números e gere um novo vetor onde
Posições pares terão seu valor multiplicado por 2
Posições ímpares não terão o valor modificado
 */
package programa1;
import java.util.Scanner;
public class Programa1 {

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        
        int vetor[] = new int [10];
        
        for(int i=0;i<10;i++){
            System.out.print("Digite o valor para a posição " + i + ": ");
            
            int valor = my_scan.nextInt();
                if(i%2==0){
                
                System.out.print("\nA posicao " + i + " e par e o valor armazenado nessa posicao, multiplicado por 2 e: \n" +valor*2);
                System.out.println("\n");
                }
                else{
                    vetor[i] = valor;
                    System.out.print("\nA posicao " + i + " e impar e o valor armazenado nessa posicao e: \n" +valor);
                    System.out.println("\n");
                }
        }
    }
    
}
