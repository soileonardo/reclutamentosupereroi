package org.example;

public class EroeNonIdoeoException extends Exception {
    public EroeNonIdoeoException(int difficolta, Eroe eroe) {
        super("Eroe %s non idoneo perchè troppo debole (difficoltà missione: %d, potenza eroe: %d)".formatted(
                eroe.getNome(),
                difficolta,
                eroe.getPower()
        ));
    }
}
