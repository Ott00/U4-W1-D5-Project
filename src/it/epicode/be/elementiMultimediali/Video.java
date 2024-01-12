package it.epicode.be.elementiMultimediali;

import it.epicode.be.abstractClass.ElementoMultimediale;
import it.epicode.be.classi.Regolabile;
import it.epicode.be.classi.Riproducibile;

public class Video extends ElementoMultimediale {

    private int durata;
    private Riproducibile riproducibile = new Riproducibile();
    private Regolabile luminosita = new Regolabile();

    public Video(int durata, String titolo) {
        super(titolo);
        this.durata = durata;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print(i + 1 + " " + getTitolo());
            for (int j = 0; j < riproducibile.getVolume(); j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosita.getLuminosita(); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
