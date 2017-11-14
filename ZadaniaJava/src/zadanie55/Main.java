package zadanie55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Silnia s = new Silnia();
        System.out.println("obliczanie silni dla dowolnej liczby calkowitej.");
        System.out.println("Podaj n");
        n = Integer.parseInt(br.readLine());

        for(int i =1;  i<=n; i++){
            System.out.println(" "+ i + "! = " + s.silnia(i));
        }
    }
}
