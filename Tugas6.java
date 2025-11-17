class Kendaraan {
    public String caraBergerak = "Menggunakan roda";
    public String bahanBakar = "Bensin atau Listrik";

    public void tampilkanInfoUmum() {
        System.out.println("== INFORMASI KENDARAAN ==");
        System.out.println("Kendaraan bergerak dengan: " + caraBergerak);
        System.out.println("Jenis bahan bakar: " + bahanBakar);
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {
    public int jumlahPintu = 5;  // sedikit diubah
    public String suara = "Brummm";

    public void tampilkanInfo() {
        System.out.println("== MOBIL ==");
        System.out.println("Bergerak dengan: " + caraBergerak);
        System.out.println("Bahan bakar: " + bahanBakar);
        System.out.println("Jumlah pintu: " + jumlahPintu);
        System.out.println("Suara mesin: " + suara);
    }
}

// Subclass Motor
class Motor extends Kendaraan {
    public boolean memilikiKopling = false; // diubah dari true ke false
    public String suara = "Ngeeng ngeeng";

    public void tampilkanInfo() {
        System.out.println("== MOTOR ==");
        System.out.println("Bergerak dengan: " + caraBergerak);
        System.out.println("Bahan bakar: " + bahanBakar);
        System.out.println("Memiliki kopling: " + (memilikiKopling ? "Ya" : "Tidak"));
        System.out.println("Suara mesin: " + suara);
    }
}

public class Tugas6 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.tampilkanInfo();

        System.out.println();

        Motor mt = new Motor();
        mt.tampilkanInfo();

        System.out.println();

        Kendaraan k = new Kendaraan();
        k.tampilkanInfoUmum();
    }
}
