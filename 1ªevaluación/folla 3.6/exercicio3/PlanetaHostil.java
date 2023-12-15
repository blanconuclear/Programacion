package exercicio3;

/**
 * PlanetaHostil
 */
public class PlanetaHostil extends Planeta {

    private boolean vida;
    private boolean fontesDeEnerxia;

    public PlanetaHostil(String nome, int tamaño, double distanciaTerra, boolean accesible, boolean vida,
            boolean fontesDeEnerxia) {
        super(nome, tamaño, distanciaTerra, accesible);
        this.vida = vida;
        this.fontesDeEnerxia = fontesDeEnerxia;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public boolean isFontesDeEnerxia() {
        return fontesDeEnerxia;
    }

    public void setFontesDeEnerxia(boolean fontesDeEnerxia) {
        this.fontesDeEnerxia = fontesDeEnerxia;
    }

}