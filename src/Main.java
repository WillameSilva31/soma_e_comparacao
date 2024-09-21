import Calculos.Calculadora;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("valor A: ");
        int A = s.nextInt();

        System.out.println("valor B: ");
        int B = s.nextInt();

        System.out.println("Valor C: ");
        int C = s.nextInt();

        int soma = Calculadora.somaNumeros(A, B);

        System.out.println("A soma é igual a: "+soma);
        Calculadora.maiorQue(soma, C);

        s.close();
    }
}