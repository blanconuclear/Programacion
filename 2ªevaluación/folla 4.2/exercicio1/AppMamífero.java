package exercicio1;

public class AppMamífero {

    public static void main(String[] args) {
        Balea balea1 = new Balea();
        Balea balea2 = new Balea();

        balea1.amamantarCrias();
        balea2.amamantarCrias();

        Ornitorrinco ornitorrinco1 = new Ornitorrinco();
        Ornitorrinco ornitorrinco2 = new Ornitorrinco();

        ornitorrinco1.amamantarCrias();
        ornitorrinco1.porOvos();
        ornitorrinco2.amamantarCrias();
        ornitorrinco2.porOvos();
    }

}
