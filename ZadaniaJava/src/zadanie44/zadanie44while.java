package zadanie44;

public class zadanie44while {

    public static void main(String[] args) {
        int n=10, wiersze,kolumny;
        wiersze=1;
        while(wiersze<=n){
            kolumny=1;
            while (kolumny<n){
                System.out.print(wiersze*kolumny + "\t");
                kolumny++;
            }
            wiersze++;
            System.out.println();
        }
    }
}
