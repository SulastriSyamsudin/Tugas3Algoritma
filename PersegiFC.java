import java.util.Scanner;

public class PersegiFC {

    public static String tentukanPosisi(int nomorPunggung) {
        // Aturan untuk nomor punggung genap (posisi Target Attacker)
        if (nomorPunggung % 2 == 0) {
            if (nomorPunggung >= 50 && nomorPunggung <= 100) {
                return "Target Attacker, dan berhak dipilih menjadi Captain Team.";
            } else {
                return "Target Attacker.";
            }
        } 
        // Aturan untuk nomor punggung ganjil
        else {
            if (nomorPunggung > 90) {
                return "Playmaker.";
            } else if (nomorPunggung % 3 == 0 && nomorPunggung % 5 == 0) {
                return "Keeper.";
            } else {
                return "Defender.";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nomor punggung pemain
        System.out.print("Masukkan nomor punggung pemain: ");
        int nomorPunggung = scanner.nextInt();

        // Menentukan posisi berdasarkan nomor punggung
        String posisi = tentukanPosisi(nomorPunggung);

        // Menampilkan posisi pemain
        System.out.println("Nomor punggung " + nomorPunggung + " digunakan untuk posisi: " + posisi);

        scanner.close();
    }
}
