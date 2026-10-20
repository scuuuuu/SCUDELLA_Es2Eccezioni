package org.example;

public class EroeNonIdoneoException extends Exception {
    private String nomeEroe;
    private int livelloPotere;

    public EroeNonIdoneoException(String nomeEroe, int livelloPotere, String messaggio) {
        super(messaggio);
        this.nomeEroe = nomeEroe;
        this.livelloPotere = livelloPotere;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public int getLivelloPotere() {
        return livelloPotere;
    }
}