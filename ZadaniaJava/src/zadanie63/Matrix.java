package zadanie63;

import java.io.FileWriter;
import java.io.IOException;

public class Matrix {

    int romiar =10;

    public void czytaj_dane(int tablica[][], int rozmiar){

        System.out.println("Tworze tablice 10x10");
        System.out.println();


        for(int i =0; i<rozmiar;i++){
            for(int j=0; j<rozmiar;j++) {
                if (i == j) {
                    tablica[i][j] = 1;
                } else
                    tablica[i][j] = 0;
                System.out.println(tablica[i][j] + " ");
            }
                System.out.println();
            }
           System.out.println();
        }
        public void zapiszDaneDoPliku(int tablica[][], int rozmiar) throws IOException {
            System.out.println("zapisuje tablice");
            FileWriter fw =new FileWriter("tablica.txt");
            for(int i=0; i<rozmiar; i++){
                for(int j =0; j<rozmiar; j++){
                    fw.write((char)(tablica[i][j]));
                    System.out.print(tablica[i][j]);
                }
                System.out.println();
            }
            fw.close();
        }

    }



