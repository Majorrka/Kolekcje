import java.util.ArrayList;
import java.util.List;

public class Cwiczenie {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();
        liczby.add(10);
        liczby.add(20);
        liczby.add(0, 5); // Dodanie na indeksie 0
        liczby.remove(1); // Usunięcie elementu pod indeksem 1
        System.out.println(liczby);
    }
}

