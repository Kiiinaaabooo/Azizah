import java.util.Scanner;

public class BiodataMahasiswa {
    public static void main(String[] args) {
        // Meminta input dari pengguna
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta input dari pengguna
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Asal: ");
            String asal = scanner.nextLine();
            System.out.print("Masukkan Kampus: ");
            String kampus = scanner.nextLine();
            System.out.print("Masukkan Departemen: ");
            String departemen = scanner.nextLine();
            System.out.print("Masukkan Jalur Masuk: ");
            String JalurMasuk = scanner.nextLine();
            
            // Menampilkan output sesuai format yang diminta
            System.out.println("Kami Ucapkan Selamat kepada " + nama + " dari " + asal + " diterima " + kampus + " di Departemen " + departemen + " melalui " + JalurMasuk + "." + " Semoga Sukses " + nama + " Kami tunggu pasrtisipasinya di " + kampus + "." + " Teruslah berusaha dan jadilah yang terbaik di perjalanan akademikmu! " + ".");
        }
    }
}
