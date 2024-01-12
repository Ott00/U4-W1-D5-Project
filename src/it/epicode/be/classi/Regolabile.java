package it.epicode.be.classi;

import it.epicode.be.interfaces.Luminosita;

public class Regolabile implements Luminosita {
    private int luminosita = 100;

    public Regolabile() {
    }

    @Override
    public void aumentaLuminosita() {
        if (getLuminosita() == 0) {
            System.out.println("Luminosità già al minimo");
        } else {
            setLuminosita(getLuminosita() - 1);
            System.out.println("Luminosità abbassata");
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (getLuminosita() == 100) {
            System.out.println("Luminosità già al massimo");
        } else {
            setLuminosita(getLuminosita() + 1);
            System.out.println("Luminosità alzata");
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
