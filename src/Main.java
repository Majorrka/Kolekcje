import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<String> nazwy = new ArrayList<>();

        nazwy.add("Laptop Dell");
        nazwy.add("Telefon iPhone");
        nazwy.add("Monitor LG");
        nazwy.add("Konsola PS5");


        Stack<String> historiaProduktow = new Stack<>();

        String naprawione = nazwy.remove(0);
        historiaProduktow .push(naprawione);


        System.out.println("Pozostale urzadzenia do naprawy: ");
        for(String urz : nazwy){
            System.out.println("- " + urz);
        }

        System.out.println();
        System.out.println("Ostatnio naprawione urzadzenia: " + historiaProduktow. peek());
    }
}