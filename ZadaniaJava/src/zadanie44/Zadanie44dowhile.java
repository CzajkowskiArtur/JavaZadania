package zadanie44;

public class Zadanie44dowhile {

    public static void main(String[] args) {


        int wiersze, kolumny, n = 10;
        wiersze = 1;
        do {
            kolumny = 1;
            do {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            } while (kolumny <= n);
            wiersze++;
            System.out.println();

        }while (wiersze <= n);
    }
}
