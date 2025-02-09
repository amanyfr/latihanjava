import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LatihanList {
    public static void main(String[] args) {
        
        Scanner merkBaru = new Scanner(System.in);
    
        List<String> merekMobil = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            System.out.println("masukkan merk mobil baru: ");
            String mobilBaru = merkBaru.nextLine();
            merekMobil.add(mobilBaru);
        }
        // merekMobil.add("Avanza"); //list ke 0
        // merekMobil.add("Mobilio"); // list ke 1
        // merekMobil.add("Ferrari"); // list ke 2
        
        System.out.println(merekMobil);

    }
}
