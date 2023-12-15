/*
Completa o exercicio anterior dando un nome a cada bombilla, para identificalas. Crea a continuación un
método estático  comparaBombillas( ) que compare a potencia de 2 bombillas, devolvendo o nome da
bombilla con máis potencia de cada 2.
Intercala no AppBombilla unha chamada a ese método, despois da opción c) , f) e g)
 */
package exercicio2;

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