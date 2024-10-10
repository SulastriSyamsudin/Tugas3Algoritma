import java.util.Scanner;

public class DisneyIslandTarif {

    public static int hitungTarif(int umur, int tinggi) {
        // Kasus umur kurang dari 1 tahun
        if (umur < 1) {
            System.out.println("Dilarang masuk.");
            return 0;
        } 
        // Kasus umur kurang dari 3 tahun
        else if (umur < 3) {
            int tarif = 30000;
            if (umur >= 2 && tinggi > 70) {
                tarif += 10000;
            }
            return tarif;
        } 
        // Kasus umur kurang dari 7 tahun
        else if (umur < 7) {
            int tarif = 40000;
            if (tinggi > 120) {
                tarif += 15000;
            }
            return tarif;
        } 
        // Kasus umur kurang dari 10 tahun
        else if (umur < 10) {
            int tarif = 50000;
            if (tinggi > 150) {
                tarif += 20000;
            }
            return tarif;
        } 
        // Kasus umur 10 tahun ke atas
        else {
            return 80000;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input umur dan tinggi anak
        System.out.print("Masukkan umur anak: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan tinggi anak (dalam cm): ");
        int tinggi = scanner.nextInt();

        // Menghitung tarif
        int tarif = hitungTarif(umur, tinggi);

        // Menampilkan tarif jika tidak dilarang masuk
        if (tarif > 0) {
            System.out.println("Tarif masuk: Rp " + tarif);
        }

        scanner.close();
    }
}
