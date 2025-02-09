import java.util.Scanner;

public class LatihanSwitchtwo {
    public static void main(String[] args) {
    //   String hari = "senin";
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Hari: ");
    String hari = input.nextLine();

    String matakuliah = switch(hari) {
        case "senin" -> "fisika dasar";
        case "selasa" -> "algoritma";
        case "rabu" -> "matematika";
        default -> "hari salah";
       };
        System.out.println(matakuliah);
    }
}