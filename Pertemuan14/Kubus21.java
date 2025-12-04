package Pertemuan14;
import java.util.Scanner;
public class Kubus21 {
    static double hitungVolume(double sisi) {
        double Volume = sisi * sisi * sisi;
        return Volume;
    }

    static double hitungLuasPermukaan(double sisi) {
        double LuasPermukaan = 6 * (sisi * sisi);
        return LuasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sisi, Volume, LuasPermukaan;

        System.out.print("Masukkan sisi : ");
        sisi = sc.nextDouble();

        Volume = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + Volume);

        LuasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah " + LuasPermukaan);

        sc.close();
    }
}
