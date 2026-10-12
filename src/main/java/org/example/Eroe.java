package org.example;

import net.datafaker.Faker;

public class Eroe {
    private final Faker faker = new Faker();

    private final String nome = faker.name().firstName();
    private final int power = faker.number().numberBetween(1, 100);

    public String getNome() { return nome; }
    public int getPower() { return power; }

    public String recluta(int diff) throws EroeNonIdoeoException {
        if (this.getPower() < diff) { throw new EroeNonIdoeoException(diff, this); }
        else {
            return "Eroe %s reclutato!".formatted(this.getNome());
        }
    }
}
