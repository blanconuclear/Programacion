/**
 * Empregando as variables de clase MAX_VALUE e MIN_VALUE, fai un programa que
 * mostre por pantalla
 * os valores máximos e mínimos para Byte, Short, Integer, Float, Double e Long.
 */
public class Exercicio3 {

    public static void main(String[] args) {

        int maxInteger = Integer.MAX_VALUE;
        int minIntenger = Integer.MIN_VALUE;

        System.out.println(maxInteger);
        System.out.println(minIntenger);

        int maxByte = Byte.MAX_VALUE;
        int minByte = Byte.MIN_VALUE;

        System.out.println(maxByte);
        System.out.println(minByte);

        int maxShort = Short.MAX_VALUE;
        int minShort = Short.MIN_VALUE;

        System.out.println(maxShort);
        System.out.println(minShort);

        Float maxFloat = Float.MAX_VALUE;
        Float minFloat = Float.MIN_VALUE;

        System.out.println(maxFloat);
        System.out.println(minFloat);

        Double maxDouble = Double.MAX_VALUE;
        Double minDouble = Double.MIN_VALUE;

        System.out.println(maxDouble);
        System.out.println(minDouble);

        Long maxLong = Long.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;

        System.out.println(maxLong);
        System.out.println(minLong);
    }
}