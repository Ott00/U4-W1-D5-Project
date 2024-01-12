package it.epicode.be.elementiMultimediali;

import it.epicode.be.abstractClass.ElementoMultimediale;
import it.epicode.be.classi.Regolabile;

public class Immagine extends ElementoMultimediale {

    private Regolabile luminosita = new Regolabile();

    public Immagine(String titolo) {
        super(titolo);
    }

    public void show() {
        System.out.print(getTitolo() + " ");
        for (int i = 0; i < luminosita.getLuminosita(); i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }

    public Regolabile getRegolabile() {
        return luminosita;
    }

    public void setRegolabile(Regolabile regolabile) {
        this.luminosita = regolabile;
    }
}
