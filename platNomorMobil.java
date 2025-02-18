import java.util.Scanner;

public class platNomorMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        String[][] KOTA = {
                { "B", "A", "N", "T", "E", "N" },
                { "J", "A", "K", "A", "R", "T", "A" },
                { "B", "A", "N", "D", "U", "N", "G" },
                { "C", "I", "R", "E", "B", "O", "N" },
                { "B", "O", "G", "O", "R" },
                { "P", "E", "K", "A", "L", "O", "N", "G", "A", "N" },
                { "S", "E", "M", "A", "R", "A", "N", "G" },
                { "S", "U", "R", "A", "B", "A", "Y", "A" },
                { "M", "A", "L", "A", "N", "G" },
                { "T", "E", "G", "A", "L" }
        };

        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = input.next().toUpperCase().charAt(0);

        int indeks = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.print("Nama kota dari plat " + inputKode + ": ");
            for (String huruf : KOTA[indeks]) {
                System.out.print(huruf);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat '" + inputKode + "' tidak ditemukan.");
        }

        input.close();
    }
}
