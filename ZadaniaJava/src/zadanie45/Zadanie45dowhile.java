package zadanie45;

public class Zadanie45dowhile {


    public static void main(String[] args) {
        char znak;

        znak='A';

        do{
            if(znak<'Z'){
                System.out.print(znak+ ",");
            }else {
                System.out.print(znak + ".");
            }
            znak++;
        }while(znak<='Z');

        System.out.println();
        znak ='Z';
                do{
            if(znak>'A'){
                System.out.print(znak+",");
            }else
                System.out.print(znak+".");
            znak--;
                }while (znak>='A');
    }
}
