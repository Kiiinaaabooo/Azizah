import java.util.Scanner;

public class KategorikanUmur {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan umur
        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        // Mengkategorikan umur
        if (umur >= 0 && umur <= 12) {
            System.out.println("Kategori: Anak-anak");
        } else if (umur >= 13 && umur <= 17) {
            System.out.println("Kategori: Remaja");
        } else if (umur >= 18 && umur <= 35) {
            System.out.println("Kategori: Dewasa Muda");
        } else if (umur >= 36 && umur <= 55) {
            System.out.println("Kategori: Dewasa");
        } else if (umur >= 56) {
            System.out.println("Kategori: Lansia");
        } else {
            System.out.println("Umur tidak valid");
        }

        // Menutup scanner
        scanner.close();
    }
}

