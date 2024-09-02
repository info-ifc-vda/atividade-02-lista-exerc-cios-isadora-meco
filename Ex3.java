/*Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
calcule e mostre 2 vetores resultantes:
• no primeiro vetor resultante, cada elemento será composto pela soma de cada
número par do primeiro vetor somado a todos os números do segundo vetor;
• o segundo vetor resultante será composto pela quantidade de divisores que cada
número ímpar do primeiro vetor tem no segundo vetor.*/
import java.util.Scanner;
public class Ex3 {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[5];
        int[] soma = new int[10];
        int[] div = new int[10];
        int cont = 0;
        int contd = 0;
        int i, j;

        for (i=0;i<10;i++)
        {
            System.out.println("Digite o valor do primeiro vetor:");
            vet1[i] = teclado.nextInt();
        }
        for (i=0;i<5;i++)
        {
            System.out.println("Digite o valor do segundo vetor:");
            vet2[i] = teclado.nextInt();
        }
        for (i=0;i<vet1.length;i++)
        {
            if (vet1[i]%2==0)
            {
                soma[cont]=vet1[i];
                for (j=0;j<vet2.length;j++)
                {
                    soma[cont]+=vet2[j];
                }
                cont++;
            }
        }
        cont = 0;
        for (i=0;i<vet1.length;i++)
        {
            if (vet1[i]%2==1)
            {
                for (j=0;j<vet2.length;j++)
                {
                    if (vet1[i]%vet2[j]==0)
                    {
                        contd++;
                    }
                }
                div[cont]=contd;
                cont++;
                contd=0;
            }
        }
        System.out.println("Vetor 1: ");
        for (i=0;i<vet1.length;i++)
        {
            System.out.print(vet1[i]+"; ");
        }
        System.out.println("\n");
        System.out.println("Vetor 2: ");
        for (i=0;i<vet2.length;i++)
        {
            System.out.print(vet2[i]+"; ");
        }
        System.out.println("\n");
        System.out.println("Vetor soma: ");
        for (i=0;i<soma.length;i++)
        {
            System.out.print(soma[i]+"; ");
        }
        System.out.println("\n");
        System.out.println("Vetor divisores: ");
        for (i=0;i<div.length;i++)
        {
            System.out.print(div[i]+"; ");
        }

    }
}