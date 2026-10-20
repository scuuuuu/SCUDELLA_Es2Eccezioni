package org.example;

import net.datafaker.Faker;
import org.example.EroeNonIdoneoException;

import java.util.Random;

public class Reclutatore {
    private Faker faker;
    private Random random;

    public Reclutatore() {
        this.faker = new Faker();
        this.random = new Random();
    }
    public void valutaCandidato(int difficoltaMissione) throws EroeNonIdoneoException {
        String nomeEroe = faker.superhero().name();
        int livelloPotere = random.nextInt(100) + 1;
        System.out.println("Eroe: " + nomeEroe + " | Potere: " + livelloPotere);
        if (livelloPotere < difficoltaMissione) {
            throw new EroeNonIdoneoException(
                    nomeEroe,
                    livelloPotere,
                    "L'eroe " + nomeEroe + " ha un potere di " + livelloPotere + ", insufficiente per la missione (richiesti: " + difficoltaMissione + ")"
            );
        }
        System.out.println("eroe " + nomeEroe + " reclutato \n");
    }
}