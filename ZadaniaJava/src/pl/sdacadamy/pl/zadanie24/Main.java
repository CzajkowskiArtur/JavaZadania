package pl.sdacadamy.pl.zadanie24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        double a,b,c,x;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza wartosc x z rownania niliniwe ax+b=0");
        System.out.println("Podaj a");
        a=Double.parseDouble(br.readLine());
        if(a==0){
            System.out.println("Niedozwolona wartosc wspolczynnika a");
        }
        else{
            System.out.println("Podaj b");
            b=Double.parseDouble(br.readLine());
            System.out.println("Podaj c");
            c=Double.parseDouble(br.readLine());


            x=(c-b)/a;

            System.out.println("Dla a =");
            System.out.printf("%4.2f", a);
            System.out.println("Dla b =");
            System.out.printf("%4.2f", b);
            System.out.println("Dla c =");
            System.out.printf("%4.2f", c);
            System.out.println("X wynosi = ");
            System.out.printf("%4.2f", x);
        }
    }
}
