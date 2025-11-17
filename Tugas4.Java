import java.util.Scanner;
import java.util.Random;

public class Tugas4 {
    public static void main(String[] args) {
        tebakAngka();
    }

    public static void tebakAngka() {
        Random rand = new Random();
        int jawaban = rand.nextInt(11);
        Scanner input = new Scanner(System.in);
        int tebakan;

        do {
            System.out.print("Tebak angka (0–10): ");
            tebakan = input.nextInt();

            if (tebakan < jawaban) {
                System.out.println("Terlalu rendah! Coba tebak lebih tinggi.");
            } else if (tebakan > jawaban) {
                System.out.println("Terlalu tinggi! Coba tebak lebih rendah.");
            } else {
                System.out.println("Selamat! Tebakan kamu benar.");
            }
        } while (tebakan != jawaban);
        
        input.close();
    }
}
