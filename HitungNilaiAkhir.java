import java.util.Scanner;

public class HitungNilaiAkhir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("============================");

        double tugas = getInput(input, "Tugas");
        double kuis = getInput(input, "Kuis");
        double uts = getInput(input, "UTS");
        double uas = getInput(input, "UAS");

        if (isNilaiValid(tugas) && isNilaiValid(kuis) && isNilaiValid(uts) && isNilaiValid(uas)) {
            double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.40 * uas);

            char nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
            String keterangan = tentukanKelulusan(nilaiHuruf);

            System.out.println("============================");
            System.out.println("Nilai Akhir: " + ((int) (nilaiAkhir * 10)) / 10.0); // Perubahan di sini
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("============================");
            System.out.println(keterangan);
        } else {
            System.out.println("============================");
            System.out.println("nilai tidak valid");
            System.out.println("============================");
        }

        input.close();
    }

    static double getInput(Scanner input, String namaNilai) {
        System.out.print("Masukkan Nilai " + namaNilai + ": ");
        return input.nextDouble();
    }

    static boolean isNilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    static char konversiNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return 'A';
        } else if (nilaiAkhir >= 73) {
            return 'B';
        } else if (nilaiAkhir >= 65) {
            return 'B';
        } else if (nilaiAkhir >= 60) {
            return 'C';
        } else if (nilaiAkhir >= 50) {
            return 'C';
        } else if (nilaiAkhir >= 39) {
            return 'D';
        } else {
            return 'E';
        }
    }

    static String tentukanKelulusan(char nilaiHuruf) {
        switch (nilaiHuruf) {
            case 'A':
            case 'B':
            case 'C':
                return "SELAMAT ANDA LULUS";
            default:
                return "ANDA TIDAK LULUS";
        }
    }
}