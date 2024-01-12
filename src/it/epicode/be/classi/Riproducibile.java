package it.epicode.be.classi;

import it.epicode.be.interfaces.Riproduzione;

public class Riproducibile implements Riproduzione {
    private int volume = 50;

    public Riproducibile() {
    }

    public void abbassaVolume() {
        if (getVolume() == 0) {
            System.out.println("Volume già al minimo");
        } else {
            setVolume(getVolume() - 1);
            System.out.println("Volume abbassato");
        }
    }

    public void alzaVolume() {
        if (getVolume() == 100) {
            System.out.println("Volume già al massimo");
        } else {
            System.out.println("Volume alzato");
            setVolume(getVolume() + 1);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
