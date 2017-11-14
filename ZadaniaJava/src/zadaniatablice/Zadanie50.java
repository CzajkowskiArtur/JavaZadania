package zadaniatablice;

public class Zadanie50 {

    public static void main(String[] args) {
        int n = 10;
        int macierz[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n == i + j + 1) {
                    macierz[i][j] = 1;
                } else
                    macierz[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


                System.out.print(macierz[i][j]);
            }
            System.out.println();
        }

        int suma=0;
        for(int i =0; i<n; i++){
            suma+= macierz[i][n-i-1];
        }
        System.out.println("suma równa się = " +suma);
    }
}




