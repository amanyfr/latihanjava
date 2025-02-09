public class LatihanFungsiThree {
    public static int Penjumlahan (int a, int b) {
        return a + b;
    }

    public static int Perkalian(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int hasilTambah = Penjumlahan (a,b);
        int hasilkali = Perkalian(a, b);
        System.out.println("jumlah" + a + " dan" + b + " adalah" + hasilTambah);
        System.out.println(String.format("Hasil perkalian %d dan %d adalah %d%n", a, b, hasilkali));
        System.out.printf("Perkalian %d dan %d adalah %d%n", a, b, hasilkali);

        // System.out.println("jumlah" + a  + " dan" + b + " adalah" + hasilkali);
    }
}
