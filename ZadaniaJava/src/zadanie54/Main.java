package zadanie54;

public class Main {
    public static void main(String[] args) {
        int n =6;
        int liczby[] = new int[n];

        Sortowanie sort = new Sortowanie();
        sort.czytajDane(liczby,n);
        sort.przetworzDane(liczby,n);
        sort.wyswietlDane(liczby,n);
    }
}
