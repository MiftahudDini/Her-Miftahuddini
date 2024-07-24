/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_HER_MIFTAHUDDINI_2301081009;

/**
 * MIFTAHUD DINI
 * TEKOM 1 B
 * 2301081009
 *
 * @author Thin 15
 */
  import java.util.Scanner;

public class Pdam {
    private String kodePembayaran;
    private String namaPelanggan;
    private String jenisPelanggan;
    private String tanggal;
    private int meterBulanIni;
    private int meterBulanLalu;
    private int totalBayar;

    
    public Pdam(String kodePembayaran, String namaPelanggan, String jenisPelanggan, String tanggal, int meterBulanIni, int meterBulanLalu) {
        this.kodePembayaran = kodePembayaran;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
        this.tanggal = tanggal;
        this.meterBulanIni = meterBulanIni;
        this.meterBulanLalu = meterBulanLalu;
        this.totalBayar = 0;
        
    }

    public String getKodePembayaran() {
        return kodePembayaran;
    }

    public void setKodePembayaran(String kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getMeterBulanIni() {
        return meterBulanIni;
    }

    public void setMeterBulanIni(int meterBulanIni) {
        this.meterBulanIni = meterBulanIni;
    }

    public int getMeterBulanLalu() {
        return meterBulanLalu;
    }

    public void setMeterBulanLalu(int meterBulanLalu) {
        this.meterBulanLalu = meterBulanLalu;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kode Pembayaran: ");
        String kodePembayaran = scanner.nextLine();
        System.out.println("Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.println("Jenis Pelanggan (GOLD/SILVER/UMUM: ");
        String jenisPelanggan = scanner.nextLine().toUpperCase();
        System.out.print("Tanggal: ");
        String tanggal = scanner.nextLine();
        System.out.print("Meter Bulan ini: ");
        int meterBulanIni = scanner.nextInt();
        System.out.print("Meter Bulan Lalu: ");
        int meterBulanLalu = scanner.nextInt();
           
    }
    
    private void hitungTotalBayar(){
        int meterPakai = meterBulanLalu - meterBulanIni;
        int totalbayar = 0;
        
        switch (jenisPelanggan) {
            case "GOLD" -> totalBayar = hitungTotalBayar(meterPakai, 5000, 10000, 20000);
            case "SILVER" -> totalBayar = hitungTotalBayar(meterPakai, 4000, 8000, 10000);
            case "UMUM" -> totalBayar = hitungTotalBayar(meterPakai, 2000, 3000, 5000);
            default -> {
                System.out.println("Jenis Pelanggan tidak valid.");
                return;
            }
        }
         
           System.out.println("Total Bayar: " + totalBayar);
    }

    public static int hitungTotalBayar(int meterPakai, int biaya1, int biaya2, int biaya3) {
        int total = 0;

        if (meterPakai > 20) {
            total += (meterPakai - 20) * biaya3;
            meterPakai = 20;
        }
        if (meterPakai > 10) {
            total += (meterPakai - 10) * biaya2;
            meterPakai = 10;
        }
        total += meterPakai * biaya1;

        return total;
    }
    
     public void Tagihan() {
        System.out.println("Tagihan PDAM:");
        System.out.println("Kode Pembayaran: " + kodePembayaran);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jenis Pelanggan: " + jenisPelanggan);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Meter Bulan Ini: " + meterBulanIni);
        System.out.println("Meter Bulan Lalu: " + meterBulanLalu);
        System.out.println("Total Bayar: Rp " + totalBayar);
    
     Pdam tagihan = new Pdam(kodePembayaran, namaPelanggan, jenisPelanggan,tanggal, meterBulanIni, meterBulanLalu);
        tagihan.hitungTotalBayar();
        tagihan.Tagihan();

     }
}
    
    
    

        
        
   