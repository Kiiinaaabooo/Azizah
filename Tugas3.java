import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tugas3 {

    public static void main(String[] args) {
        String filePath = "naruto.txt";
        int countYang = 0;
        int countDengan = 0;
        int countItu = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Konversi ke huruf kecil agar pencocokan tidak case sensitive
                line = line.toLowerCase();
                String[] words = line.split("\\s+|\\p{Punct}");

                for (String word : words) {
                    switch (word) {
                        case "yang" -> countYang++;
                        case "dengan" -> countDengan++;
                        case "itu" -> countItu++;
                    }
                }
            }

            System.out.println("Jumlah kata 'yang': " + countYang);
            System.out.println("Jumlah kata 'dengan': " + countDengan);
            System.out.println("Jumlah kata 'itu': " + countItu);

        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
