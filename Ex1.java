/*Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
um número negativo ou 0.*/
import java.util.Scanner;
public class Ex1 {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float num;
        double cubo;
        double raiz;
        int cont=0;
        do
        {
            System.out.println("Digite um número (< ou = 0 para encerrar):\n");
            num = teclado.nextFloat();

            if (num<=0)
            {
                System.out.println("Programa encerrado!\n");
                break;
            }
            if (cont%20==0)
            {
                System.out.println("-----------------------------------------------");
                System.out.println("Valores:\t Cubo:  \t Raiz quadrada:");
                System.out.println("-----------------------------------------------");
            }
            cubo = Math.pow(num, 3);
            raiz = Math.sqrt(num);
            System.out.printf("%.1f\t\t %.1f\t\t  %.1f\n",num,cubo,raiz);
            cont++;

        }while(2>1);
    }
}