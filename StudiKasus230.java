import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int pilihan, dokumen, peringkat, pendanaan;
        int kurang;

        System.out.println("=== VALIDASI DANA PENGHARGAAN MAHASISWA ===");

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.println("\nJenis kegiatan:");
        System.out.println("1. BELMAWA");
        System.out.println("2. BAKORMA");
        System.out.println("3. PKM");
        System.out.println("4. MANDIRI");
        System.out.println("5. LAINNYA");
        System.out.print("Pilih jenis kegiatan: ");
        pilihan = sc.nextInt();

        if (pilihan == 1) {
            jenisKegiatan = "BELMAWA";
        } else if (pilihan == 2) {
            jenisKegiatan = "BAKORMA";
        } else if (pilihan == 3) {
            jenisKegiatan = "PKM";
        } else if (pilihan == 4) {
            jenisKegiatan = "MANDIRI";
        } else {
            jenisKegiatan = "LAINNYA";
        }

        System.out.print("Jumlah dokumen yang diupload (0-4): ");
        dokumen = sc.nextInt();

        System.out.print("Peringkat juara (1, 2, 3, atau 0 jika bukan juara): ");
        peringkat = sc.nextInt();

        System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
        pendanaan = sc.nextInt();

        System.out.println("\n=== HASIL SELEKSI ===");
        System.out.println("Nama mahasiswa: " + namaMahasiswa);
        System.out.println("Jenis kegiatan: " + jenisKegiatan);

        if (dokumen < 4) {

            kurang = 4 - dokumen;

            System.out.println("Status dana: TIDAK DIBERIKAN");
            System.out.println("Alasan: Dokumen tidak lengkap.");
            System.out.println("Jumlah dokumen yang kurang: " + kurang);

        } else {

            if (jenisKegiatan.equals("BELMAWA")
                    || jenisKegiatan.equals("BAKORMA")
                    || jenisKegiatan.equals("MANDIRI")) {

                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status dana: DIBERIKAN");
                    System.out.println("Alasan: Mendapat juara " + peringkat + ".");
                } else {
                    System.out.println("Status dana: TIDAK DIBERIKAN");
                    System.out.println("Alasan: Tidak mendapat juara 1, 2, atau 3.");
                }

            } else if (jenisKegiatan.equals("PKM")) {

                if (pendanaan == 1) {
                    System.out.println("Status dana: DIBERIKAN");
                    System.out.println("Alasan: Tim PKM dinyatakan lolos.");
                } else {
                    System.out.println("Status dana: TIDAK DIBERIKAN");
                    System.out.println("Alasan: Tim PKM tidak lolos.");
                }

            } else {

                System.out.println("Status dana: TIDAK DIBERIKAN");
                System.out.println("Alasan: Kegiatan termasuk kategori Lainnya.");
            }

            System.out.println("Jumlah dokumen yang kurang: 0");
        }

        sc.close();
    }
}