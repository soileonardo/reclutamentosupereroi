package org.example;

public class Main {
    public static void main() throws EroeNonIdoeoException {
        int difficolta = 75;

        IO.println("Missione difficoltà " + difficolta);
        IO.println("Reclutamento eroi:");

        for (int i = 0; i < 5; i++) {
            Eroe eroe = new Eroe();

            try {
                IO.println(eroe.recluta(difficolta));
            } catch (EroeNonIdoeoException e) {
                IO.println(e.getMessage());
            }
        }
    }
}
