package Pertemuan14;
import java.util.Scanner;
public class Kafe21 {
    
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga21(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon yang diterapkan!");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        Menu("Andi", true, kodePromo);

        System.out.print("\nBerapa jenis menu yang ingin dipesan? ");
        int jumlahJenisMenu = sc.nextInt();

        int totalAkhir = 0;

        for (int i = 0; i < jumlahJenisMenu; i++) {
        System.out.print("\n===== Pesanan ke-" + (i + 1) + "=====");
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga21(pilihanMenu, banyakItem, kodePromo);
        totalAkhir += totalHarga;
        }

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalAkhir);

        sc.close();
    }
}
