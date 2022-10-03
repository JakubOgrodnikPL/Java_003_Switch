import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź ocenę: ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println("Wprowadzona ocena to: " + input);

        switch(input){
            case 1 -> System.out.println("Co tak mało");
            case 2 -> System.out.println("Trochę lepiej");
            case 3,4 -> System.out.println("Nie przyjmuję 3 ani 4 tylko 5");
            case 5 -> System.out.println("Super");
        }
    }
}