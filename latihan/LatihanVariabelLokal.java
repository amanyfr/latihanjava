public class LatihanVariabelLokal {

        int nilaiGlobal = 50;
    
    public void Nilai() {
        int nilaiLokal = 10;
        int nilaiGabungan = nilaiGlobal + nilaiLokal;
        System.out.println(nilaiGabungan); //hasil 60
    }
    public static void main(String[] args) {
        LatihanVariabelLokal contoh = new LatihanVariabelLokal();
        contoh.Nilai(); //tidak menghasilkan apa-apa
    }
}
