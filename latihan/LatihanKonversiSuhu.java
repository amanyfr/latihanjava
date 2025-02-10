import java.util.Scanner;


public class LatihanKonversiSuhu {
        public static double celciustoFahrenheit (double celcius) {
            return (celcius * 9/5) + 32;
        }

        public static double celciustoKelvin (double celcius) {
            return celcius + 273.15;
        }

    public static void main(String[] args) {
        System.out.print("masukkan suhu celcius: ");
        Scanner input = new Scanner(System.in);
        double celcius = input.nextDouble();
        double suhu = celciustoFahrenheit(celcius);
        double kelvin = celciustoKelvin(celcius);


        System.out.printf("konversi %f celcius adalah %f fahrenheit \n", celcius, suhu);
        System.out.printf("konversi %f celcius adalah %f kelvin \n", celcius, kelvin);
    }
}
