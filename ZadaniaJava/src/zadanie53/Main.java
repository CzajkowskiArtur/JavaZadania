package zadanie53;

public class Main {
    public static void main(String[] args) {
        int r =10;
        double tablica[][] = new double[r][r];

        Matrix matrix = new Matrix();

        matrix.czytajDane(tablica,r);
        matrix.przetworzDane(tablica,r);
        matrix.wyswietlWyniki(tablica,r);
    }
}
