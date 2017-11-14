package zadanie60;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Plik plik = new Plik();
        plik.czytajDane();
        plik.zapiszDaneDoDysku();
        plik.czytaDanezPliku();

    }
}
