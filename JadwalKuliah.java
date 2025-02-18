import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
            System.out.println("----------------------");
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                tampilkanSeluruhJadwal(namaMK, sks, semester, hariKuliah);
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari kuliah: ");
                String hari = sc.nextLine();
                tampilkanJadwalBerdasarkanHari(namaMK, sks, semester, hariKuliah, hari);
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester: ");
                int sem = sc.nextInt();
                tampilkanJadwalBerdasarkanSemester(namaMK, sks, semester, hariKuliah, sem);
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                String nama = sc.nextLine();
                cariMataKuliah(namaMK, sks, semester, hariKuliah, nama);
            } else if (pilihan == 5) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }

    public static void tampilkanSeluruhJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-20s | %-5s | %-10s | %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-20s | %-5d | %-10d | %-10s%n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
        System.out.printf("%-20s | %-5s | %-10s%n", "Nama Mata Kuliah", "SKS", "Semester");
        System.out.println("--------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.printf("%-20s | %-5d | %-10d%n", namaMK[i], sks[i], semester[i]);
            }
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        System.out.printf("%-20s | %-5s | %-10s%n", "Nama Mata Kuliah", "SKS", "Hari");
        System.out.println("--------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == sem) {
                System.out.printf("%-20s | %-5d | %-10s%n", namaMK[i], sks[i], hariKuliah[i]);
            }
        }
    }

    public static void cariMataKuliah(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String nama) {
        System.out.println("\nHasil Pencarian Mata Kuliah:");
        System.out.printf("%-20s | %-5s | %-10s | %-10s%n", "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-------------------------------------------------");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(nama)) {
                System.out.printf("%-20s | %-5d | %-10d | %-10s%n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
} 