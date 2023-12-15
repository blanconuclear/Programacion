/*
 * Define unha clase Bombilla que teña como atributo privado a súa potencia.
 * Define agora dous construtores: un por defecto
 * que asigne a potencia a 10 e outro que pida como argumento a potencia. Define
 * agora dous métodos setPotencia(int j) que
 * asigne á variable potencia ese valor j, e outro método getPotencia( ) que
 * devolva a potencia que ten o obxecto desde o que o
 * chamamos. Define tamén 2 métodos máis aumentaPotencia(int h) que aumente a
 * potencia no valor h, e baixaPotencia(int h)
 * que baixe a potencia nun valor h. Controla que os valores da potencia teñen
 * que estar comprendidos entre 2 e 35 W.
 * Crea nunha clase AppBombilla un obxecto Bombilla e comproba que todo
 * funciona. Comproba que o comportamento é
 * correcto, asignando 30, subindo 20, baixando 10, subindo 5, asignando 10 e
 * baixando 20, revisando cada vez o valor da
 * potencia e comprobando que en todo momento está entre os valores permitidos.
 */

package Exercicio7;

public class Bombilla {

    private int potencia;

    public Bombilla() {
        potencia = 10;
    }

    public Bombilla(int potencia) {
        if (potencia >= 2 && potencia <= 35) {
            this.potencia = potencia;
        }
    }

}