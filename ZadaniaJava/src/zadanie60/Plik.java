package zadanie60;

import java.io.*;

public class Plik {

    String dane, dane1;

    public void czytajDane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imie i nazwisko");
        dane = (br.readLine());
    }

    public void zapiszDaneDoDysku() throws IOException {
        System.out.println("Zapisujemy dane do pliku");
        FileWriter fw = new FileWriter("imieinazwisko.txt");
        fw.write(dane);
        fw.close();
    }
    public void czytaDanezPliku() throws IOException {
        System.out.println("Odczytujemy dane z pliku");
        FileReader fr = new FileReader("imieinazwisko.txt");
        BufferedReader br = new BufferedReader(fr);

        while((dane1 = br.readLine()) !=null){
            System.out.println(dane1);
        }

    }
}
