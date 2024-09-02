/*Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:
• Efetuar depósito
• Efetuar saque
• Consultar o ativo bancário (soma de todos os saldos)
• Finalizar programa
Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
para o saque.
*/
import java.util.Scanner;
public class Ex4 {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int i;
        int c;
        int op;
        int loc=0;
        double val;
        int[] cod = new int[10];
        double[] saldo = new double[10];

        for (i=0;i<10;i++)
        {
            System.out.println("Digite o código e saldo da conta "+(i+1)+":");
            cod[i] = teclado.nextInt();
            saldo[i] = teclado.nextDouble();
        }
        do
        {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consuta ao ativo bancário");
            System.out.println("4 - Finalizar atendimento");
            op = teclado.nextInt();
            if (op==1)
            {
                System.out.println("Qual o código da conta e qual valor deseja depositar?");
                c = teclado.nextInt();
                val = teclado.nextDouble();
                for(i=0;i<cod.length;i++)
                {
                    if(c==cod[i])
                    {
                       saldo[i]+=val;
                       System.out.println("Depósito feito com sucesso!");
                    }
                 }
                 c=0;
                 val=0;
            }
            else if (op==2)
            {
                System.out.println("Qual o código da conta e qual valor deseja sacar?");
                c = teclado.nextInt();
                val = teclado.nextDouble();
                for(i=0;i<cod.length;i++)
                {
                    if(c==cod[i])
                    {
                       if (val>saldo[i])
                       {
                            System.out.println("Saldo insuficiente!");
                       }
                       else
                       {
                            saldo[i]-=val;
                            System.out.println("saque feito com sucesso!");
                       }
                    }
                 }
                 c=0;
                 val=0;
            }
            else if (op==3)
            {
                double soma = 0;
                for (i=0;i<saldo.length;i++)
                {
                    soma+=saldo[i];
                }
                System.out.println("Valor total: "+soma);
            }


        }while(op!=4);
        System.out.println("Atendimento finalizado!");
    }
}
