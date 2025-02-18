public class RoyalGarden {

    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;

    static int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    static int[] penguranganStok = {1, 2, 0, 5};

    public static void tampilkanPendapatan() {
        System.out.println("Pendapatan tiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = (stokBunga[i][0] * hargaAglonema) + (stokBunga[i][1] * hargaKeladi) +
                    (stokBunga[i][2] * hargaAlocasia) + (stokBunga[i][3] * hargaMawar);
            System.out.println("RoyalGarden" + (i + 1) + ": Rp " + pendapatan);
        }
        System.out.println("========================================");
    }

    public static void tampilkanStokCabang4() {
        int cabang = 3; // Indeks cabang 4 (dimulai dari 0)

        System.out.println("Stok bunga cabang RoyalGarden 4:");
        System.out.println("Bunga Aglonema: " + stokBunga[cabang][0]);
        System.out.println("Bunga Keladi: " + stokBunga[cabang][1]);
        System.out.println("Bunga Alocasia: " + stokBunga[cabang][2]);
        System.out.println("Bunga Mawar: " + stokBunga[cabang][3]);
        System.out.println("---------------------------------------");

        System.out.println("Stok bunga setelah pengurangan bunga mati:");
        for (int i = 0; i < stokBunga[cabang].length; i++) {
            stokBunga[cabang][i] -= penguranganStok[i];
        }

        System.out.println("Bunga Aglonema: " + stokBunga[cabang][0]);
        System.out.println("Bunga Keladi: " + stokBunga[cabang][1]);
        System.out.println("Bunga Alocasia: " + stokBunga[cabang][2]);
        System.out.println("Bunga Mawar: " + stokBunga[cabang][3]);
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Stok Bunga Semua Cabang Toko RoyalGarden");
        System.out.println("========================================");
        tampilkanPendapatan();
        tampilkanStokCabang4();
    }
}