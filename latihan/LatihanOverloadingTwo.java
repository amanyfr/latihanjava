public class LatihanOverloadingTwo {
    public static int Gravitasi(int massa) {
        return massa * 10 * 10;
    }

    public static double Gravitasi(double massa) {
        return massa * 9.8 * 9.8;
    }

    public static void main(String[] args) {
        int massa = 5;
        double massa2 = 5.0;
        int percepatantidakPresisi = Gravitasi(massa);
        double percepatanPresisi = Gravitasi(massa2);
        System.out.println(percepatantidakPresisi);
        System.out.println(percepatanPresisi);
        
    }
}
