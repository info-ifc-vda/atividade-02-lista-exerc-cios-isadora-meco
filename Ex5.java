/*Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um que contenham, respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados.*/
import java.util.Scanner;
public class Ex5 {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int i,j;
        int cont = 0;
        int[][] mat = new int[3][3]; //3 p facilitar a saída
        int[] maior = new int[3];
        int auxMaior = -11111;
        int auxMenor = 20000;
        int[] menor = new int[3];

        for (i=0;i<mat.length;i++)
        {
            for (j=0;j<mat.length;j++)
            {
                System.out.println("Digite o valor da posição ["+i+"]["+j+"]");
                mat[i][j] = teclado.nextInt();
            }
        }
        for (i=0;i<mat.length;i++)
        {
            for (j=0;j<mat.length;j++)
            {
                if(mat[i][j]>auxMaior)
                {
                    auxMaior=mat[i][j];
                }   
            }
            maior[i]=auxMaior;
            auxMaior = -111111;
        }
        for (i=0;i<mat.length;i++)
        {
            for (j=0;j<mat.length;j++)
            {
                if(mat[j][i]<auxMenor)
                {
                    auxMenor=mat[j][i];
                }
            }
            menor[i]=auxMenor;
            auxMenor = 200000;
        }


        System.out.print("Matriz:\n");
        for (i=0;i<mat.length;i++)
        {
            for (j=0;j<mat.length;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.print("\n");
        }
        System.out.print("Vetor dos maiores valores por linha:\n");
        for (i=0;i<maior.length;i++)
        {
            System.out.print(maior[i]+"  ");
        }
        System.out.print("\n");
        System.out.print("Vetor dos menores valores por colunas:\n");
        for (i=0;i<maior.length;i++)
        {
            System.out.print(menor[i]+"  ");
        }

    }
    
}