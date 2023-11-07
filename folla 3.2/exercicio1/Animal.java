/*
 * Crea unha clase Animal que teñan como atributo a idade, o nome e un "boolean"
 * vivo, que valerá true se o animal
 * está vivo (nace) e false se está morto (logo de chamar ao método morre).
 * Define dous constructores, un con
 * argumentos e outro sen eles. Define un método nace( ) que mostre un saúdo
 * cando o animal nace, un método
 * morre( ) que se despida da terra ao morrer, así como un método getDatos( )
 * que imprima os valores de idade e
 * nome, e devolva a idade. Lembra que nace( ) e morre( ) teñen que modificar o
 * valor de vivo. Comproba que todo
 * vai ben creando 3 animais, dándolle valores aos seus atributos e chamando a
 * todos os métodos.
 */

package exercicio1;

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
            System.out.println("Benvido ao mundo " + animal.nome);
        }
    }

    public static void morre(Animal animal) {
        if (animal.vivo) {
            animal.vivo = false;
            System.out.println(" Boa viaxe " + animal.nome);
        }
    }

    public int getDatos() {
        System.out.println("Nome: " + this.nome + " idade: " + this.idade);
        return this.idade;
    }

}