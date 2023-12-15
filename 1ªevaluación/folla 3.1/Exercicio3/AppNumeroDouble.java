/*/*Crea unha clase chamada  NumeroDouble, que conteña como atributo  valor  un  double. Crea 2 construtores, un sen
argumentos que asigne o valor a 0.0, 
e outro con un argumento double que garde no atributo valor dese argumento. Crea
noutra clase AppNumeroDouble 4 obxectos da clase empregando 2 veces cada un dos construtores. 
Comproba que os
obxectos van tomando eses valores mostrándoos por pantalla */

package Exercicio3;

/**
 * AppNumeroDouble
 */
public class AppNumeroDouble {

    public static void main(String[] args) {
        NumeroDouble n1 = new NumeroDouble();
        NumeroDouble n2 = new NumeroDouble(2.3);
        NumeroDouble n3 = new NumeroDouble();
        NumeroDouble n4 = new NumeroDouble(4.5);

        System.out.println(n1.getValor());
        System.out.println(n2.getValor());
        System.out.println(n3.getValor());
        System.out.println(n4.getValor());

    }

}