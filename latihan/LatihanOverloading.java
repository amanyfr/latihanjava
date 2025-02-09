public class LatihanOverloading {
    public static void Salam() {
        System.out.println("Assalamu alaikum");
    }

    public static void Salam(String nama) {
        System.out.println("Assalamu alaikum," + nama);
    }

    public static void main(String[] args) {
        Salam();
        Salam("Amany");
    }
}
