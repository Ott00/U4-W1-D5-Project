import it.epicode.be.abstractClass.ElementoMultimediale;
import it.epicode.be.elementiMultimediali.Audio;
import it.epicode.be.elementiMultimediali.Immagine;
import it.epicode.be.elementiMultimediali.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arrayLength = 3;
        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            ElementoMultimediale elemento = creaElementoMultimediale();
            while (elemento == null) {
                System.out.println("Errore nella creazione dell'elemento. Riprova.");
                elemento = creaElementoMultimediale();
            }
            elementiMultimediali[i] = elemento;
        }

        avviaLettore(elementiMultimediali);
    }

    private static ElementoMultimediale creaElementoMultimediale() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Che tipo di elemento multimediale vuoi aggiungere? %n1 - Immagine %n2 - Audio %n3 - Video %nInserisci il numero corrispondente: ");
        int objDaCreare = scanner.nextInt();
        scanner.nextLine(); //Pulizia buffer dello scanner

        ElementoMultimediale elementoCreato = null;

        switch (objDaCreare) {
            case 1:
                System.out.println("Aggiungiamo un Immagine");
                System.out.println("Inserisci un nome per l'immagine: ");
                String nomeImmagine = scanner.nextLine();
                elementoCreato = new Immagine(nomeImmagine);
                break;
            case 2:
                System.out.println("Aggiungiamo un Audio");
                System.out.println("Inserisci un nome per l'audio: ");
                String audioNome = scanner.nextLine();
                System.out.println("Inserisci la durata dell'audio: ");
                int audioDurata = scanner.nextInt();
                elementoCreato = new Audio(audioDurata, audioNome);
                break;
            case 3:
                System.out.println("Aggiungiamo un Video");
                System.out.println("Inserisci un nome per il video: ");
                String videoNome = scanner.nextLine();
                System.out.println("Inserisci la durata del video: ");
                int videoDurata = scanner.nextInt();
                elementoCreato = new Video(videoDurata, videoNome);
                break;
            default:
                System.out.println("Valore non valido...");
                creaElementoMultimediale();
        }

        return elementoCreato;
    }

    public static void avviaLettore(ElementoMultimediale[] elementiMultimediali) {
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
                System.out.println("Lettore chiuso");
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