package zadanie54;

import java.util.Random;

public class Sortowanie {
    public void czytajDane(int[]liczby, int n){
//        liczby[0] = 57;
//        liczby[1] =303;
//        liczby[2] = 34;
//        liczby[3] = 1025;
//        liczby[4] = 8;
//        liczby[5] = 20;
        Random rand = new Random();
        for(int i=0; i<n; i++) {
            liczby[i]= (int) Math.round(9*(rand.nextDouble()));

        }


        System.out.println("Liczby nieposortowane to: ");
        for(int i =0; i<n; i++){
            if(i<n-1){
                System.out.print(liczby[i]+ ",");
            } else
                System.out.print(liczby[i]+ ".");
        }
    }
    public void przetworzDane(int[] liczby, int n){
        int przechowalnia;

        for(int i =1; i<n-1; i++){
            for(int j =n-1; j>=1; j--){
                if(liczby[j]<liczby[j-1]) {
                    przechowalnia = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = przechowalnia;
                }
            }
        }

    }

    public void wyswietlDane(int[]liczby, int n){
        System.out.println();
        System.out.println("Liczby posortowane to: ");
        for(int i=0; i<n; i++){
            if(i<n-1){
                System.out.print(liczby[i]+ ",");
            }else
                System.out.print(liczby[i]+".");
        }
    }
}
