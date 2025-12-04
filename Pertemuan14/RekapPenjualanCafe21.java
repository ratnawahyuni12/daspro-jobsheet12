package Pertemuan14;
import java.util.Scanner;
public class RekapPenjualanCafe21 {

    static Scanner sc = new Scanner(System.in);
    static int[][] penjualan = new int[5][7];
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    // 1(a). input data tiap menu (array 2 dimensi)
    static void inputDataPenjualan() {
        System.out.println("\n=====- INPUT DATA PENJUALAN -=====");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nMenu " + menu[i]);

            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(" - Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // 2(a). tampil seluruh data penjualan dari hari pertama hingga terakhir (tabel)
    static void tampilDataPenjualan(int[][] penjualan) {
        System.out.println("\n=====- TAMPIL TABEL DATA PENJUALAN -=====");

        System.out.printf("| %-15s |", "");

        for (int j = 1; j <= penjualan[0].length; j++) {
            System.out.printf(" Hari %-1s |", j);
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("| %-15s |", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf(" %-6s |", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    // 3(a). tampil menu dengan penjualan tertinggi selama 7 hari (tampil nama dan totalnya)
    static String tampilMenuTertinggi (int[][] penjualan) {
        int totalTertinggi = 0;
        String namaMenu = "";

        System.out.println("\n=====- TAMPIL MENU TERTINGGI -=====");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > totalTertinggi) {
                totalTertinggi = total;
                namaMenu = menu[i];
            }
        }
        System.out.println(namaMenu + " dengan total " + totalTertinggi);
        return namaMenu;
    }
    // 4(a). tampil rata-rata penjualan tiap menu selama 7 hari (tampil nama dan rata-ratanya)
    static double[] rataRataPenjualan (int[][] penjualan) {
        double[] hasilRata = new double[5];

        System.out.println("\n=====- RATA-RATA PENJUALAN -=====");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / 7.0;
            hasilRata[i] = rataRata;
            System.out.println(menu[i] + " : " + rataRata);
        }
        System.out.println();
        return hasilRata;
    }

    public static void main(String[] args) {

        // 1(a)
        inputDataPenjualan();

        // 2(a)
        tampilDataPenjualan(penjualan);

        // 3(a)
        tampilMenuTertinggi(penjualan);

        // 4(a)
        rataRataPenjualan(penjualan);
    }
}
