package zadanie56;

public class Main {
    public static void main(String[] args) {
        int n =10;
        Triangle liczby = new Triangle();
        System.out.println("Program znajduje 10 pierwszych liczb trojkatnych");

        for(int i=1; i<=n; i++){
            System.out.println("#" + i + "=" + liczby.triangle(i));
        }
    }
}
