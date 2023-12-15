/*Crea un programa que sume os dous números enteiros 123 e 345 chamando a unha función suma
que devolva o valor da suma*/

public class Exercicio1 {

    public static void main(String[] args) {

        int n1 = 123;
        int n2 = 345;
        int resultado = suma(n1, n2);

        System.out.println(n1 + " + " + n2 + " = " + resultado);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}