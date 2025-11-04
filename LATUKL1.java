    
import java.util.Scanner;

public class LATUKL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ==============================
        // Bagian 1: Perhitungan Biaya Ekspedisi
        // ==============================
        System.out.println("=== PROGRAM PERHITUNGAN BIAYA EKSPEDISI ===");

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        double biayaPerKg;

        // Menentukan biaya per kg berdasarkan jarak
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biaya = berat * biayaPerKg;

        // Tambahan biaya volume
        if (volume > 100) {
            biaya += 50000;
        }

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Volume paket : " + volume + " cm^3");
        System.out.println("Biaya kirim  : Rp " + biaya);

    }
}
