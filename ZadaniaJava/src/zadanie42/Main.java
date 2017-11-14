package zadanie42;

public class Main {
    public static void main(String[] args) {
        int x=1;
        int suma=0;

        while(x<=100){
            if(x%2==0){
                suma+=x;
            }
            x++;
        }
        System.out.println("suma licz patrzystych z przedziału od 1 do 100 wynosi " + suma);
    }
}
