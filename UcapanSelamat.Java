import java.util.Scanner;

public class UcapanSelamat {
    public static void main(String[] args) {
        // Membuat objek scanner untuk input dari user
        try (Scanner scanner = new Scanner(System.in)) {
            // Menginputkan nama
            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();
            
            // Menginputkan umur
            System.out.print("Masukkan umur Anda: ");
            int umur = scanner.nextInt();
            
            // Memberikan ucapan selamat
            System.out.println("Selamat, " + nama + "! Anda berumur " + umur + " tahun.");
        }
    }
}

