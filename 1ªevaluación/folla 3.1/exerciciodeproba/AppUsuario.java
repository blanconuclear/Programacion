
public class AppUsuario {

    public static void main(String[] args) {
        Usuario eva = new Usuario("Eva", 45);
        System.out.println("O nome é: " + eva.nome + " e a sua idade é: " + eva.getIdade());

        eva.SetNome("Joseja");
        eva.SetIdade(134);

        System.out.println("Agora chámase: " + eva.nome);
        System.out.println("Agora ten: " + eva.getIdade());
    }
}