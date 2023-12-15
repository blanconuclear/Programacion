package staticProba;

class Esfera {

    private double radio;
    private static final double PI = 3.1416;

    public static int numEsferas = 0;

    public Esfera() {
        radio = 1;
        numEsferas++;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    // calcular volumen.
    public double getVolume() {
        double volume = 4.0 / 3 * PI * radio * radio * radio;
        return volume;
    }

    // Método Vaime devolver o radio da esfera mais grande.
    public static double devolveRadioMaior(Esfera esf1, Esfera esf2) {
        if (esf1.radio > esf2.radio) {
            return esf1.radio;
        } else {
            return esf2.radio;
        }
    }
}