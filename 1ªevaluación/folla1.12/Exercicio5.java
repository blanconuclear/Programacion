import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime o teu nome: ");
        String nome = sc.nextLine();
        nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);

        System.out.println("Dime o teu apelido: ");
        String apelido = sc.nextLine();
        apelido = apelido.substring(0, 1).toUpperCase() + apelido.substring(1);

        if (apelido.compareTo("A") >= 0 && apelido.compareTo("M") <= 0) {
            System.out.println(nome + " " + apelido + " vai no grupos das 16:00");
            System.out.println("o nome completo ten " + (nome.length() + apelido.length())
                    + " letras e o seu primeiro apelido ten "
                    + apelido.length() + " letras.");
        } else {
            System.out.println(nome + " " + apelido + " vai no grupos das 18:00");
            System.out.println("o nome completo ten " + (nome.length() + apelido.length())
                    + " letras e o seu primeiro apelido ten "
                    + apelido.length() + " letras.");
        }
    }
}