import java.util.Scanner;

public class Kubus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            int pilihan = input.nextInt();

            if (pilihan == 4) {
                break; // Keluar dari loop jika pilihan 4
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            sisi = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungVolume(sisi);
                    break;
                case 2:
                    hitungLuasPermukaan(sisi);
                    break;
                case 3:
                    hitungKeliling(sisi);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }

    public static void hitungVolume(int sisi) {
        double volume = Math.pow(sisi, 3);
        System.out.println("Volume kubus adalah: " + volume);
    }

    public static void hitungLuasPermukaan(int sisi) {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
    }

    public static void hitungKeliling(int sisi) {
        double keliling = 12 * sisi;
        System.out.println("Keliling kubus adalah: " + keliling);
    }
}