package zadanie51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pole_prostokąta {

    double a, b, pole;

    public void czytajDane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pole prostokąta");
        System.out.println("Podaj bok A");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok B");
        b = Double.parseDouble(br.readLine());

    }


    public void przetworzDane() {
        pole = a * b;
    }

    public void wyswietlWyniki() {
        System.out.println("Pole prostokata wynosi: ");
        System.out.printf("%2.2f.\n", pole);
    }
}






