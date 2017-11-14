package zadanie41;

public class Liczbnp {
    public static void main(String[] args) {
        int x=1;
        int suma=0;

        do{
            if(!(x%2==0)){
                suma+=x;
            }

            x++;
        }while(x<=100);
        System.out.println("Suma liczb patrzystych od 1 do 100 wynosi" + suma);
    }
}
