package zadanie62;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int rozmiar =10;
       int tab[][] = new int[rozmiar][rozmiar];

       Matrix m = new Matrix();
       m.czytajDane();
       m.przetworzDane();
       m.zapiszDaneDoPliku();
       m.czytajDanezPliku();
    }
}
