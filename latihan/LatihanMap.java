import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class LatihanMap {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Map<String, Integer> mahasiswa = new HashMap<>();

       
        System.out.print("jumlah data baru yang dimasukkan: ");
        int jumlahData = inputData.nextInt();
        inputData.nextLine();


        for (int i = 0; i < jumlahData; i++) {
            System.out.print("masukkan nama mahasiswa baru: ");
            String nama = inputData.nextLine();

            System.out.print("masukkan usia mahasiswa baru: ");
            int umur = inputData.nextInt();
            inputData.nextLine();

            mahasiswa.put(nama, umur);

        }

        // mahasiswa.put("Reza", 18);
        // mahasiswa.put("Amany", 18);
        // mahasiswa.put("fulan", 18);

        System.out.println(mahasiswa);

    }
}
