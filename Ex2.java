/*Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores*/
import java.util.Scanner;
public class Ex2 {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
         int[] vet1 = new int[10];
         int[] vet2 = new int[10];
         int[] vet3 = new int[20];
         int cont = 0;
         int i, j;
         for (i=0;i<10;i++)
         {
            System.out.println("Digite o valor do primeiro vetor:");
            vet1[i]=teclado.nextInt();
         }
         for (i=0;i<10;i++)
         {
            System.out.println("Digite o valor do segunto vetor:");
            vet2[i]=teclado.nextInt();
         }
         for (i = 0; i < vet1.length; i++) {
             for (j = 0; j < vet2.length; j++) {
                 if (vet1[i] == vet2[j]) {
                     break;
                 }
             }
             if (j == vet2.length) {
                 vet3[cont] = vet1[i];
                 cont++;
             }
         }
         for (i = 0; i < vet2.length; i++) {
             for (j = 0; j < vet1.length; j++) {
                 if (vet2[i] == vet1[j]) {
                     break;
                 }
             }
             if (j == vet1.length) {
                 vet3[cont] = vet2[i];
                 cont++;
             }
         }
         if(cont==0)
         {
            System.out.print("Os vetores são iguais!");
         }
         else if(cont>0)
         {
            System.out.print("Números não comuns aos dois vetores:\n");
            for (i = 0; i < cont; i++) {
                 System.out.print(vet3[i] + "; ");
            }
        }
    }
    
}