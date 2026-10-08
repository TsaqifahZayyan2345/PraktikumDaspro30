import java.util.Scanner;
public class StudiKasus130 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 1800;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        
        System.out.println("Masukkan jumlah cup yang dibeli");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan jumlah uang yang dibayarkan");
        uangBayar = sc.nextInt();
        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= 10000) {
            diskon = totalHarga *10/100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println(" total harga: " + totalHarga);
        System.out.println(" diskon: " + diskon);
        System.out.println(" total bayar: " + totalBayar);
        if (uangBayar > totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println(" kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println(" uang yang dibayarkan kurang sebesar: " + kurang);
        }
    }
}