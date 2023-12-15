public class EjemploMatrices {

    public static void main(String[] args) {

        int matriz[][] = new int[3][3];

        // Asignación manual.
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 96;
        matriz[1][0] = 35;
        matriz[1][1] = 33;
        matriz[1][2] = 71;
        matriz[2][0] = 446;
        matriz[2][1] = 228;
        matriz[2][2] = 24;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posición " + i + " j: " + j);
                System.out.println("El valor es de: " + matriz[i][j]);
            }
        }

    }
}