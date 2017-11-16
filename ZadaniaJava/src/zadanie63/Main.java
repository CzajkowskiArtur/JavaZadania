package zadanie63;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int rozmiar = 10;
        int tab[][] = new int[rozmiar][rozmiar];
        int tab2[][] = new int[rozmiar][rozmiar];

        Matrix m = new Matrix();

        m.czytaj_dane(tab, rozmiar);
        m.zapiszDaneDoPliku(tab, rozmiar);
        m.czytajDaneZPliku(tab2, rozmiar);

    }
}

