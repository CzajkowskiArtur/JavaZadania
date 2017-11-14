package zadanie45;

public class zadanie45 {


    public static void main(String[] args) {
        char znak;

        for(znak='A'; znak<='Z'; znak++){
            if(znak<'Z'){
                System.out.print(znak+ ",");
            } else
                System.out.print(znak+".");
        }
        System.out.println();

        for (znak='Z'; znak>='A'; znak--){
            if(znak>'A'){
                System.out.print(znak+",");
            } else
                System.out.print(znak+".");
        }
    }
}
