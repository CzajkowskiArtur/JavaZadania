package zadanie25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class Main{
    public static void main(String[] args) throws IOException {
        double losuj_liczbe, zgadnij_liczbe;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program losuje liczbe z przedziału od 0 do 9");
        System.out.println("Zgadnij tą liczbę liczbe");

        Random r = new Random();
        losuj_liczbe = Math.round(10*(r.nextDouble()));
        zgadnij_liczbe = Double.parseDouble(br.readLine());

        if(zgadnij_liczbe == -losuj_liczbe)
        {
            System.out.println("Gratualcje odgałes liczbe");
        }
        else
        {
            System.out.println("Bardzo mi przykro wylosowana liczba to: " );
            System.out.println((int) losuj_liczbe +".");
        }


    }
}
