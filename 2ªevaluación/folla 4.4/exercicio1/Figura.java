package exercicio1;

/**
 * Figura
 */
public class Figura implements Comparable {

    private int area;
    private String cor;

    public Figura(int area, String cor) {
        this.area = area;
        this.cor = cor;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int compareTo(Object obx) {
        Figura outraFigura = (Figura) obx;
        if (this.area < outraFigura.area) {
            return -1;
        }
        if (this.area > outraFigura.area) {
            return 1;
        }
        return 0;
    }

}