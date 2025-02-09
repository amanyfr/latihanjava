import java.util.Scanner;

public class TungguTombol {

    public static void main (String[] args) {

        Scanner bacatombol = new Scanner(System.in);
        String tombol = "";
 
        while(!tombol.equals("q")) {
            System.out.println("Aku Seorang Programmer");
            tombol = bacatombol.next(); //baca input
        }

        System.out.println("Anda Berhasil Keluar");
        bacatombol.close();
    }
}