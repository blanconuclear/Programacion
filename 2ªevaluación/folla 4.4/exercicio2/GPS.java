package exercicio2;

class GPS {
    private double coordenadaX;
    private double coordenadaY;
    private String fecha;
    private String hora;

    public GPS(double coordenadaX, double coordenadaY, String fecha, String hora) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.fecha = fecha;
        this.hora = hora;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "GPS:\nCoordenada X: " + coordenadaX +
                "\nCoordenada Y: " + coordenadaY +
                "\nFecha: " + fecha +
                "\nHora: " + hora;
    }
}
