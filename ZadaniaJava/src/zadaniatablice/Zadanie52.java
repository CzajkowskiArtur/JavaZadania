package zadaniatablice;

public class Zadanie52 {
    public static void main(String[] args) {


        int n = 10;
        int macierz[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0){
                    macierz[i][j]=i;
                }
                if(j==1){
                    macierz[i][j]=i*i;
                }
            }
        }



        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }

        int suma = 0;
        int suma2 =0;

        for(int i=0; i<n; i++){
            suma += macierz[i][0];
            suma2+= macierz[i][1];
        }
        System.out.println(suma);
        System.out.println(suma2);


    }
}
