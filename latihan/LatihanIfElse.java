import java.util.Scanner;

public class LatihanIfElse {
    public static void main(String[] args) {
        // int nilai = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai anda: ");
        int nilai = input.nextInt();

        if (nilai >= 80) {
            System.out.println("LULUS");
        } else if (nilai < 50 && nilai < 80) {
            System.out.println("REMEDIAL");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}