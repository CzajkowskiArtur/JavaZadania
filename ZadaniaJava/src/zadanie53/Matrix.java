package zadanie53;

import java.util.Random;

public class Matrix {
    public void czytajDane(double [][]macierz, int rozmiar) {
        Random rand = new Random();

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i == j){
                    macierz[i][j] = Math.round(9*(rand.nextDouble())); //wypisanie licz od 0 do 9 na przekatnej tablicy;
                         } else {
                             macierz[i][j] = 0;
                          }


            }
        }
    }
    public void przetworzDane(double macierz[][], int rozmiar) {

        double suma = 0;

        for (int i = 0; i < rozmiar; i++) {
            suma += macierz[i][i];
            System.out.println("Suma elementow wynosi " + (int) suma + ".");
        }
    }


        public void wyswietlWyniki(double macierz[][],int rozmiar){
            for(int i =0; i<rozmiar; i++){
                for(int j=0; j<rozmiar; j++){
                    System.out.print((int)macierz[i][j] +" ");
                }
                System.out.println();
    }

    }

}
