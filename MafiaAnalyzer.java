import java.util.Scanner;

public class MafiaAnalyzer {

    public static String analisaAnggotaMafia(String nama, int umur, String tempatTinggal, double tabungan) {
        // Kondisi untuk Don
        if (umur > 40 && (tempatTinggal.equalsIgnoreCase("Nevada") || tempatTinggal.equalsIgnoreCase("New York") || tempatTinggal.equalsIgnoreCase("Havana")) && tabungan > 10000000) {
            return nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Don.";
        }
        // Kondisi untuk Underboss
        else if (umur >= 25 && umur <= 40 && (tempatTinggal.equalsIgnoreCase("New Jersey") || tempatTinggal.equalsIgnoreCase("Manhattan") || tempatTinggal.equalsIgnoreCase("Nevada")) && tabungan >= 1000000 && tabungan <= 2000000) {
            return nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Underboss.";
        }
        // Kondisi untuk Capo
        else if (umur >= 18 && umur <= 24 && (tempatTinggal.equalsIgnoreCase("California") || tempatTinggal.equalsIgnoreCase("Detroit") || tempatTinggal.equalsIgnoreCase("Boston")) && tabungan < 1000000) {
            return nama + " kemungkinan adalah seorang anggota mafia dengan pangkat Capo.";
        }
        // Jika tidak mencurigakan
        else {
            return nama + " tidak mencurigakan.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Menangani newline

        System.out.print("Masukkan tempat tinggal: ");
        String tempatTinggal = scanner.nextLine();

        System.out.print("Masukkan jumlah tabungan dalam dolar: ");
        double tabungan = scanner.nextDouble();

        // Memanggil fungsi analisa
        String hasil = analisaAnggotaMafia(nama, umur, tempatTinggal, tabungan);
        System.out.println(hasil);

        scanner.close();
    }
}