package zadanie52;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Trojmian trojmian = new Trojmian();
        trojmian.czytajDane();
        trojmian.przetworzDane();
        trojmian.wyswietlWyniki();
    }
}
