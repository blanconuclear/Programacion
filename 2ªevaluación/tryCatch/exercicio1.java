class AppEx1 {
    public static void main(String[] args) {
        try {
            int[] x = { 0, 1, 2, 3, 4 };
            x[5] = 5;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Temos esta excepción: " + e);
        }
        System.out.println("O programa recupérase da excepción  e continúa ata aquí");
    }
}