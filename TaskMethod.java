 public class TaskMethod {
    public static void SegitigaBintang(int n) {
        int alas = 2 * n + 3;
        int tinggi = (alas + 1) / 2;

        for (int i = 1; i <= tinggi; i++) {
            // Spasi di kiri
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Baris pertama hanya 1 bintang
            if (i == 1) {
                System.out.println("*");
            } 
            // Baris terakhir full bintang
            else if (i == tinggi) {
                for (int j = 1; j <= alas; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } 
            // Baris tengah: bintang - spasi - bintang
            else {
                System.out.print("*");
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("n = 1:");
        SegitigaBintang(1);
        System.out.println("\nn = 2:");
        SegitigaBintang(2);
        System.out.println("\nn = 3:");
        SegitigaBintang(3);
    }
}




   
