import java.util.Scanner;

/**
 * Crea unha clase FraseBuilder que teña como atributo un StringBuilder frase e
 * outro atributo String saudo.
 * Crea agora os seguintes métodos:
 * a) iniciaFrase( ): engadirá un valor pedido por teclado a frase
 * b) eliminaFrase( ): Podes empregar o método delete, ou asignar un length = 0.
 * c) mostraFrase( ): Mostrará o saúdo, e a continuación a frase
 * d) mostraLonxitudeCapacidade( ): mostra a lonxitude e a capacidade de frase
 * e) eliminaParte( ): Pedirá dous índices e eliminará as letras entre eses
 * índices de frase.
 * f) introducirDouble( ): Pedirá a posición e o double e o introducirá na
 * frase.
 * g) invertirFrase( ): inverterá a frase
 * O teu programa deberá ter un menú, e cada opción será chamada cun switch( )
 */

public class FraseBuilder {
    Scanner sc = new Scanner(System.in);

    public StringBuilder frase;
    public String saudo;

    public FraseBuilder() {
        this.frase = new StringBuilder();
        this.saudo = new String("Hola amig@!");
    }

    public void iniciaFrase(String novaFrase) {

        frase.append(novaFrase);
    }

    public void eliminaFrase() {
        frase.delete(0, frase.length());
    }

    public void mostraFrase() {
        System.out.println(saudo);
        System.out.println(frase);

    }

    public void mostraLonxitudeCapacidade() {
        System.out.println("Lonxitude: " + frase.length());
        System.out.println("Capacidade: " + frase.capacity());
    }

    public void eliminaParte(int a, int b) {
        frase.delete(a, b);
    }

    public void introducirDouble(int i, double numeroDoble) {
        frase.insert(i, numeroDoble);
    }

    public void invertirFrase() {
        frase.reverse();
    }
}