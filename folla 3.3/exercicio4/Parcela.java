package exercicio4;

public class Parcela {
    private String nome;
    private double base;
    private double altura;

    public Parcela() {
    }

    public Parcela(String nome, double base, double altura) {
        this.nome = nome;
        this.base = base;
        this.altura = altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public String getNome() {
        return nome;
    }

    public double area() {
        double area = base * altura;
        return area;
    }

    public static Parcela calculaMaiorArea2(Parcela parcela1, Parcela parcela2) {
        if (parcela1.area() > parcela2.area()) {
            return parcela1;
        } else {
            return parcela2;
        }
    }

    public static Parcela calculaMaiorArea3(Parcela parcela3, Parcela parcela4) {
        if (parcela3.area() > parcela4.area()) {
            return parcela3;
        } else {
            return parcela4;
        }
    }
}