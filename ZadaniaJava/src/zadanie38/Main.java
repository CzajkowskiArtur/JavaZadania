package zadanie38;

public class Main {
    public static void main(String[] args) {
        int x=1;
        int suma=0;

        do{
            suma+=x;
            x++;

        }while(x<=100);

        System.out.println("Suma liczb od 1 do 100 wynosi: "+ suma);
    }
}
