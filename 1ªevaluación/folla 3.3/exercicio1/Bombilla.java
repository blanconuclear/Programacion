/*
 * Imos modificar o exercicio da clase Bombilla. Engade á clase Bombilla un
 * atributo nome, e un atributo privado
 * estático potenciaTotal, na que gardamos a potencia total que está empregando
 * o alumeado. Crea tamén un
 * método estático que devolva o valor desa potenciaTotal. Queremos que se vaia
 * gardando nese atributo o
 * total de watios que están empregando as bombillas en cada momento. Pensa como
 * terás que modificar o
 * exercicio anterior para que isto aconteza: terás que modificar varios dos
 * métodos xa creados.
 * Proba que funciona coas seguintes probas, comprobando o valor de
 * potenciaTotal:
 * a) Crea bombilla1 (10W de inicio), bombilla2 (15W de inicio), bombilla3 (6W
 * de inicio).
 * b) Mostra o valor de potenciaTotal.
 * c) Aumenta bombilla1 en 5 W, bombilla2 en 50 W.
 * d) Mostra a potencia de cada bombilla e o valor de potenciaTotal.
 * e) Pide por teclado un valor de watios por teclado para baixar bombilla2, e
 * outro valor de watios por
 * teclado para baixar bombilla3. Baixa a potencia desas bombillas con eses
 * valores.
 * f) Mostra a potencia de cada bombilla e o valor de potenciaTotal.
 * g) Baixa o valor das 3 bombillas para que chegue a 0, e comproba que valen 0
 * as 3 potencias e
 * potenciaTotal.
 * h) Da un saúdo para indicar que o programa rematou.
 */
package exercicio1;

public class Bombilla {

    private int potencia;
    private String nome;

    private static int potenciaTotal = 0;

    public Bombilla() {
        this.potencia = 10;
        potenciaTotal += 10;
    }

    public Bombilla(int potencia) {
        if (potencia >= 2 && potencia <= 35) {
            this.potencia = potencia;
            potenciaTotal += potencia;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPotencia(int potencia) {
        potenciaTotal -= this.potencia;
        this.potencia = potencia;
        potenciaTotal += potencia;

    }

    public int getPotencia() {
        return potencia;
    }

    public static int getPotenciaTotal() {
        return potenciaTotal;
    }

    public void aumentaPotencia(int h) {
        if ((this.potencia + h) <= 35) {
            this.potencia += h;
            potenciaTotal += h;
        }
    }

    public void baixaPotencia(int h) {
        if ((this.potencia - h) >= 2) {
            this.potencia -= h;
            potenciaTotal -= h;
        }
    }

    public static String comparaBombilla(Bombilla bomb1, Bombilla bomb2) {
        if (bomb1.getPotencia() > bomb2.getPotencia()) {
            return bomb1.getNome();
        } else {
            return bomb2.getNome();
        }
    }
}