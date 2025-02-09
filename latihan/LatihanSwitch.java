import java.util.Scanner;

public class LatihanSwitch {
    public static void main(String[] args) {
    //   String hari = "senin";
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Hari: ");
    String hari = input.nextLine();

      switch (hari) {
        case "senin":
            System.out.println("Fisika Dasar");
            break;
        case "selasa":
            System.out.println("Algoritma");
            break;
        case "rabu":
            System.out.println("Matematika");;
            break;
        default:
            System.out.println("hari yang diberikan salah");
      }

    }
}