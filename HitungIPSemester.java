import java.util.Scanner;

public class HitungIPSemester {

    public static String konversiNilai(int nilaiAngka) {
        if (80 <= nilaiAngka && nilaiAngka <= 100) {
            return "A";
        } else if (73 <= nilaiAngka && nilaiAngka < 80) {
            return "B+";
        } else if (65 <= nilaiAngka && nilaiAngka < 73) {
            return "B";
        } else if (60 <= nilaiAngka && nilaiAngka < 65) {
            return "C+";
        } else if (50 <= nilaiAngka && nilaiAngka < 60) {
            return "C";
        } else if (39 <= nilaiAngka && nilaiAngka < 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double hitungBobotNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===================================");
       

        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] nilaiAngka = new int[mataKuliah.length];
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextInt();
        }
        System.out.println("==================================");
        System.out.println("\nhasil Konversi Nilai");
        System.out.println("==================================");
        System.out.printf("%-50s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilaiBobot = 0;
        int totalSks = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilai(nilaiAngka[i]);
            double bobotNilai = hitungBobotNilai(nilaiHuruf);
            System.out.printf("%-50s %-15d %-15s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, bobotNilai);
            totalNilaiBobot += bobotNilai;
            totalSks += 1;
        }

        double ip = totalNilaiBobot / totalSks;
        System.out.println("==================================");
        System.out.printf("IP : %.2f", ip);
        

        input.close();
    }
}