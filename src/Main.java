import it.epicode.be.abstractClass.ElementoMultimediale;
import it.epicode.be.elementiMultimediali.Audio;
import it.epicode.be.elementiMultimediali.Immagine;
import it.epicode.be.elementiMultimediali.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Audio audio1 = new Audio(4, "Canzone");
        Immagine immagine1 = new Immagine("Foto Cucciolo");
        Immagine immagine2 = new Immagine("Foto Vaso");
        Immagine immagine3 = new Immagine("Foto Auto");
        Video video1 = new Video(5, "Video");

        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];
        elementiMultimediali[0] = audio1;
        elementiMultimediali[1] = immagine1;
        elementiMultimediali[2] = immagine2;
        elementiMultimediali[3] = immagine3;
        elementiMultimediali[4] = video1;

        avviaLettore(elementiMultimediali);
    }

    public static void avviaLettore(ElementoMultimediale[] elementiMultimediali) {
        {
            Scanner scanner = new Scanner(System.in);
            ElementoMultimediale elementoDaEseguire;

            while (true) {
                System.out.println("Quale oggetto vuoi eseguire?");

                System.out.println("0 - Chiudi Lettore ");
                for (int i = 0; i < elementiMultimediali.length; i++) {
                    System.out.println(i + 1 + " - " + elementiMultimediali[i].getTitolo());
                }

                System.out.print("Digita il numero corrispondente: ");
                int objDaEseguire = scanner.nextInt() - 1;

                if (objDaEseguire > elementiMultimediali.length) {
                    System.out.println("Valore non valido");
                    avviaLettore(elementiMultimediali);
                }
                if (objDaEseguire == -1) {
                    System.out.println("Processo terminato");
                    break;
                }

                elementoDaEseguire = elementiMultimediali[objDaEseguire];

                if (elementoDaEseguire instanceof Audio) {
                    ((Audio) elementoDaEseguire).play();
                }

                if (elementoDaEseguire instanceof Video) {
                    ((Video) elementoDaEseguire).play();
                }

                if (elementoDaEseguire instanceof Immagine) {
                    ((Immagine) elementoDaEseguire).show();
                }


            }
        }
    }
}