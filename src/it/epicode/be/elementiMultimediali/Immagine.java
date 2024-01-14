package it.epicode.be.elementiMultimediali;

import it.epicode.be.abstractClass.ElementoMultimediale;
import it.epicode.be.classi.Luminosita;

public class Immagine extends ElementoMultimediale {

    private Luminosita luminosita = new Luminosita();

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

    public Luminosita getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(Luminosita luminosita) {
        this.luminosita = luminosita;
    }
}
