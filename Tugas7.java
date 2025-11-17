import java.io.BufferedReader;
import java.io.FileReader;

public class Tugas7 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("ckd-dataset-v2.csv"));
        String header = br.readLine(); // Baca header
        String[] kolom = header.split(",");

        int idxUmur = -1, idxStage = -1;

        // Cari index kolom "age" dan "classification" (stage)
        for (int i = 0; i < kolom.length; i++) {
            if (kolom[i].trim().equalsIgnoreCase("age")) {
                idxUmur = i;
            } else if (kolom[i].trim().equalsIgnoreCase("classification")) {
                idxStage = i;
            }
        }

        if (idxUmur == -1 || idxStage == -1) {
            System.out.println("Kolom 'age' atau 'classification' tidak ditemukan.");
            br.close();
            return;
        }

        String line;
        System.out.printf("%-10s | %-10s | %-10s%n", "Age", "Category", "Effected");
        System.out.println("----------------------------------------");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length > idxUmur && data.length > idxStage) {
                String ageStr = data[idxUmur].trim();
                String stage = data[idxStage].trim().toLowerCase();

                if (!ageStr.isEmpty() && !stage.isEmpty()) {
                    try {
                        double age = Double.parseDouble(ageStr);
                        String kategoriUmur = "";
                        if (age <= 12) kategoriUmur = "Anak-anak";
                        else if (age <= 17) kategoriUmur = "Remaja";
                        else if (age <= 59) kategoriUmur = "Dewasa";
                        else kategoriUmur = "Lansia";

                        String effected = stage.equals("ckd") ? "Yes" : "No";

                        System.out.printf("%-10s | %-10s | %-10s%n", (int)age, kategoriUmur, effected);
                    } catch (NumberFormatException e) {
                        // Lewatkan data dengan umur tidak valid
                    }
                }
            }
        }
        br.close();
    }
}
