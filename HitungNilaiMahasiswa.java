import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        double tugas = inputNilai(sc, "Masukkan Nilai Tugas");
        double kuis = inputNilai(sc, "Masukkan Nilai Kuis");
        double uts = inputNilai(sc, "Masukkan Nilai UTS");
        double uas = inputNilai(sc, "Masukkan Nilai UAS");

        if (tugas == -1 || kuis == -1 || uts == -1 || uas == -1) {
            System.out.println("==============================");
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
        } else {
           
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            nilaiAkhir = Math.floor(nilaiAkhir); 
            String nilaiHuruf = konversiHuruf(nilaiAkhir);
            boolean lulus = !(nilaiHuruf.equals("D") || nilaiHuruf.equals("E"));

            System.out.println("==============================");
            System.out.printf("nilai akhir : %.1f\n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");

            if (lulus) {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
        sc.close();
    }

    static double inputNilai(Scanner sc, String teks) {
        System.out.print(teks + ": ");
        double nilai = sc.nextDouble();
        return (nilai < 0 || nilai > 100) ? -1 : nilai;
    }

    static String konversiHuruf(double nilai) {
        return nilai >= 80 ? "A"
                : nilai >= 73 ? "B+"
                        : nilai >= 65 ? "B" : nilai >= 60 ? "C+" : nilai >= 55 ? "C" : nilai >= 39 ? "D" : "E";
    }
}