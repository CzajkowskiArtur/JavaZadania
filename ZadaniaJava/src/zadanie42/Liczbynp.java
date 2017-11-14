package zadanie42;

public class Liczbynp {
    public static void main(String[] args) {
        int x=1;
        int suma=0;

        while(x<=100){
            if(!(x%2==0)){
                suma+=x;
            }

            x++;

        }
        System.out.println("Suma liczb wynosi "+ suma);
    }
}
