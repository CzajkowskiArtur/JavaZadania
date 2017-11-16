package zadanie62;

import java.io.*;

public class Matrix {


    int rozmiar = 10;
    int a[][]= new int[rozmiar][rozmiar];
    int b[][]= new int[rozmiar][rozmiar];
    int c[][]= new int[rozmiar][rozmiar];


    public void czytajDane() {
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j<rozmiar;j++){
                if(i==1){
                    a[i][j]=1;
                }
                else {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }


    public void przetworzDane(){
        System.out.println("Przetwarzam tablice");
        for (int i=0; i<rozmiar; i++){
            for(int j=0; j<rozmiar; j++){
                b[i][j]=a[j][i];
            //    System.out.print(b[j][i]);
            }

        }
    }

    public void zapiszDaneDoPliku() throws IOException {
        FileWriter fw = new FileWriter("dane.txt");
        for(int i =0; i<rozmiar;i++){
            for(int j =0; j<rozmiar;j++){
                fw.write((char)(b[i][j]));
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
        fw.close();
    }

    public void czytajDanezPliku() throws IOException {
        System.out.println("Odczytujemy dane z pliku");
        FileReader fr = new FileReader("dane.txt");
        BufferedReader br = new BufferedReader(fr);

        for(int i =0; i<rozmiar; i++){
            for(int j =0; j<rozmiar; j++){
                c[i][j]= (int)br.read();
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
