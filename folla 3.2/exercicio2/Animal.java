/*
 * Modifica a clase Animal creada no exercicio anterior de xeito que teña unha
 * variable estática chamada
 * numeroAnimais, na que se leve a conta dos animais vivos. Esta variable terá
 * que ser modificada desde os métodos
 * que dan vida ou morte aos animais. Fai a proba creando 4 obxectos animal, e
 * facendo que nazan e/ou morran.
 * Comproba que o valor da variable estática se corresponde co que debe, e toma
 * sempre o mesmo valor para os
 * distintos animais (isto é así porque un atributo estático realmente é unha
 * variable de clase).
 */

package exercicio2;

public class Animal {

    private int idade;
    private String nome;
    private boolean vivo;

    public Animal() {
        idade = 39;
        nome = "Pacomio";
        vivo = false;
    }

    public Animal(int idade, String nome, boolean vivo) {
        this.idade = idade;
        this.nome = nome;
        this.vivo = vivo;
    }

    public static void nace(Animal animal) {
        if (!animal.vivo) {
            animal.vivo = true;
            System.out.println("Benvido ao mundo raparigo " + animal.nome);
        }
    }

    public static void morre(Animal animal) {
        if (animal.vivo) {
            animal.vivo = false;
            System.out.println(" Ata logo raparigo " + animal.nome);
        }
    }

    public int getDatos() {
        System.out.println("Nome: " + this.nome + " idade: " + this.idade);
        return this.idade;
    }

}