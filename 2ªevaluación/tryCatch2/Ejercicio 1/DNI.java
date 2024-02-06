class DNI {
    private String DNI;

    public DNI(String dni) throws DNIException {
        this.DNI = dni;

        // Comprobación de que ten 8 díxitos
        if (dni.length() != 9) {
            throw new DNIException("O DNI debe ter 8 díxitos.");
        }

        // Dividir o DNI na parte do número e na parte da letra
        int dniNumero;
        try {
            dniNumero = Integer.parseInt(dni.substring(0, 8));
        } catch (NumberFormatException ex) {
            throw new DNIException("Os primeiros 8 caracteres deben ser díxitos.");
        }

        String dniLetra = dni.substring(8);

        // Comprobar que a letra sexa unha letra
        if (!Character.isLetter(dniLetra.charAt(0))) {
            throw new DNIException("O último carácter debe ser unha letra.");
        }
    }

    public String getDNI() {
        return DNI;
    }
}
