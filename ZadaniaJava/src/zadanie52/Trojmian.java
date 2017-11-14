package zadanie52;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trojmian {
    double a, b, c, delta, x1, x2;
    char liczbapierwiastkow;

    public void czytajDane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pierwiastki równania kwadratowego");
        System.out.println("Podaj a");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("Niedozwolona wartosc wspolczynnika a, program zakonczy prace");
            System.exit(1);
        } else
            System.out.println("Podaj b");
        b = Double.parseDouble(br.readLine());
        System.out.println("Podaj c");
        c = Double.parseDouble(br.readLine());
    }

    public void przetworzDane() {
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            liczbapierwiastkow = 0;
        }
        if (delta == 0) {
            liczbapierwiastkow = 1;
        }
        if (delta > 0) {
            liczbapierwiastkow = 2;
        }
        switch (liczbapierwiastkow) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            }
            break;
        }
    }

    public void wyswietlWyniki() {
        System.out.println("Dla wprowadzonych liczb");
        System.out.printf("a= " + "%2.2f.\n", a);
        System.out.printf("b= " + "%2.2f.\n", b);
        System.out.printf("c= " + "%2.2f.\n", c);

        switch (liczbapierwiastkow) {
            case 0:
                System.out.println("Brak pierwiastkow rzeczywistych");
                break;
            case 1:
                System.out.printf("Trojmian ma jeden pierwiastek podwojny\n" + "x1 = " + "%2.2f.\n", x1);
                break;
            case 2: {
                System.out.println("trojmian ma dwa pierwiastki");
                System.out.printf("x1 = " + "%2.2f.\n", x1);
                System.out.printf("x2 = " + "%2.2f.\n", x2);
            }
            break;
        }
    }
}

