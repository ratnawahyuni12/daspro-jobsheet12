package Pertemuan14;
import java.util.Scanner;
public class NilaiMahasiswa21 {
    
    // a. isianArray (input nilai N mahasiswa)
    static void isianArray (double[] nilaiMahasiswa, Scanner sc) {
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = sc.nextDouble();
        }
    }

    // b. tampilArray (terima parameter array nilai mahasiswa dan tampil seluruh nilai yang telah diinput)
    static void tampilArray (double[] nilaiMahasiswa) {
        System.out.println("\nDaftar Nilai Mahasiswa : ");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("mahasiswa " + (i + 1) + " : " + nilaiMahasiswa[i]);
        }
    }

    // c. hitTot (terima parameter array nilai mahasiswa, hitung dan kembalikan total nilai seluruh mahasiswa)
    static double hitTot (double[] nilaiMahasiswa) {
        double total = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        return total;
    }

    // d. main (baca nilai N, membuat array dengan ukuran N, panggil fungsi (isianArray, tampilArray, dan hitTot), tampilkan total nilai yang dikembalikan oleh fungsi hitTot)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====- TOTAL NILAI MAHASISWA -=====");
        
        System.out.print("\nMasukkan jumlah mahasiswa (N) : ");
        int N = sc.nextInt();

        double[] nilaiMahasiswa = new double[N];

        isianArray(nilaiMahasiswa, sc);
        tampilArray(nilaiMahasiswa);

        double totalNilai = hitTot(nilaiMahasiswa);

        System.out.println("\nTotal nilai seluruh mahasiswa : " + totalNilai);

        System.out.println("\n============- SELESAI -============");

        sc.close();
    }
}
