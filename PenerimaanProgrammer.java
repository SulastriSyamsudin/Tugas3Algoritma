import java.util.Scanner;

public class PenerimaanProgrammer {

    public static String hasilTesCoding(int nilaiCoding) {
        if (nilaiCoding > 80) {
            return "LOLOS";
        } else if (nilaiCoding >= 60) {
            return "DIPERTIMBANGKAN";
        } else {
            return "GAGAL";
        }
    }

    public static String hasilTesInterview(String nilaiInterview) {
        if (nilaiInterview.equalsIgnoreCase("A") || nilaiInterview.equalsIgnoreCase("B")) {
            return "LOLOS";
        } else {
            return "GAGAL";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai coding
        System.out.print("Masukkan nilai coding (0-100): ");
        int nilaiCoding = scanner.nextInt();
        scanner.nextLine(); // Menangani newline

        // Input nilai interview
        System.out.print("Masukkan nilai interview (A, B, C, D, atau E): ");
        String nilaiInterview = scanner.nextLine();

        // Mendapatkan hasil tes coding dan interview
        String hasilCoding = hasilTesCoding(nilaiCoding);
        String hasilInterview = hasilTesInterview(nilaiInterview);

        // Menentukan apakah peserta berhasil atau tidak
        if ((hasilCoding.equals("LOLOS") || hasilCoding.equals("DIPERTIMBANGKAN")) && hasilInterview.equals("LOLOS")) {
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer.");
        } else {
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer.");
        }

        scanner.close();
    }
}
