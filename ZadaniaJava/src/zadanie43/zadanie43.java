package zadanie43;

import java.util.Random;

public class zadanie43 {

    public static void main(String[] args) {


        int ilosc_liczb=5, i;
        double liczba, suma=0, min,max;

        Random r =new Random();
        min = Math.round(100*(r.nextDouble()));
        System.out.println();
        System.out.println("wylosowano liczby " + min +",");
        max = min;
        suma = suma+max;


        for(i=1; i<=ilosc_liczb-1; i++){
            liczba=Math.round(100*(r.nextDouble()));
            System.out.println(liczba +",");
            if(max<liczba) max=liczba;
            if(liczba<min) min = liczba;
            suma=suma+liczba;
        }
        System.out.println();
        System.out.println("Najwieksza liczba to " + max);
        System.out.println("Najmniejsza liczba to " + min);
        System.out.println("srednia= " +  suma/ilosc_liczb +".");


    }
}
