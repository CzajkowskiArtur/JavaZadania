package zadaniatablice;

public class Zadanie53 {
    public static void main(String[] args) {


        int n = 10;
        int macierzone[][] = new int[n][n];
        int macierztwo[][]= new int[n][n];

        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                macierzone[i][j]=j;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(macierzone[i][j]);
            }
            System.out.println();
        }
        System.out.println("Pierwsza macierz");

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                macierztwo[i][j]= macierzone[j][i];
                System.out.print(macierztwo[i][j]+ "\t");
            }
            System.out.println();
        }
    }


}
