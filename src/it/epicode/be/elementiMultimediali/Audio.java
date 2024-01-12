package it.epicode.be.elementiMultimediali;

import it.epicode.be.abstractClass.ElementoMultimediale;
import it.epicode.be.classi.Riproducibile;

public class Audio extends ElementoMultimediale {

    private int durata;

    private Riproducibile riproducibile = new Riproducibile();

    public Audio(int durata, String titolo) {
        super(titolo);
        this.durata = durata;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print(i + 1 + " " + getTitolo());
            for (int j = 0; j < riproducibile.getVolume(); j++) {
                if (j == riproducibile.getVolume() - 1) {
                    System.out.println("!");
                } else {
                    System.out.print("!");
                }
            }
        }
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public Riproducibile getRiproducibile() {
        return riproducibile;
    }

    public void setRiproducibile(Riproducibile riproducibile) {
        this.riproducibile = riproducibile;
    }
}
