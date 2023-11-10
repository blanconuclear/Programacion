/*Crea unha clase Empregado que terá como atributos o nome e a antigüidade do mesmo, ademais dun atributo es- tático que será o salarioBase dun empregado. A clase debe conter un método estático que permitirá aumentar o sa- lario base na porcentaxe indicada e un método de instancia que fará o cálculo e devolverá o salario do empregado, que será o salario base máis 10€ (constante da clase) por cada ano de antigüidade.
Crea un programa AppEmpregado para probar a funcionalidade da clase. Crea tamén un método cambiarSalario- Base( ), que permita cambiar ese valor. O seguintes Empregados deberán ter un soldo acorde ao novo valor de sa- larioBase.
 */

package exercicio1;

public class Empregado {
    private String nome;
    private int antigüidade;
    private static double salarioBase = 1000;
    private static final double bonusPorAntigüidade = 10;

    public Empregado() {

    }

    public Empregado(String nome, int antigüidade) {
        this.nome = nome;
        this.antigüidade = antigüidade;
    }

    public static void cambiarSalarioBase(double porcentaxeAumento) {
        salarioBase += salarioBase * (porcentaxeAumento / 100);
    }

    public double calcularSalario() {
        return salarioBase + (bonusPorAntigüidade * antigüidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAntigüidade(int antigüidade) {
        this.antigüidade = antigüidade;
    }

    public static void setSalarioBase(double salarioBase) {
        Empregado.salarioBase = salarioBase;
    }

    public int getAntigüidade() {
        return antigüidade;
    }

    public static double getBonusporantigüidade() {
        return bonusPorAntigüidade;
    }

    public String getNome() {
        return nome;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }
}