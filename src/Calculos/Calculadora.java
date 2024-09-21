package Calculos;

public class Calculadora {
    public static int somaNumeros(int a, int b){
        return a+b;
    };

    public static void maiorQue(int soma, int c){
        if (soma > c){
            System.out.println("A soma é maior que C");
        } else if (soma < c) {
            System.out.println("A soma é menor que C");
        } else System.out.println("A soma é igual a C");
    }
}
