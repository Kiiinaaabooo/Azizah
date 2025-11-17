import java.util.Scanner;

public class TempatLatihan {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Apakah kamu menyayangi Kina? (Iya/Tidak): ");
        String menyayangi = scanner.nextLine().trim(); // Mengambil input dan menghapus spasi berlebih

        // Memberi jawaban berdasarkan input
        if (menyayangi.equalsIgnoreCase("Iya")) {
            System.out.println("Aww Lovee u Iman ❤️");
        } else if (menyayangi.equalsIgnoreCase("Tidak")) {
            System.out.println("Ga usah Gengsi, Kina tau kok! 😜");
        } else {
            System.out.println("Jawaban tidak valid. Harap jawab dengan 'Iya' atau 'Tidak'.");
        }

        // Menutup scanner
        scanner.close();
    }
}
