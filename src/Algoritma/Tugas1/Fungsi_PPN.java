package Algoritma.Tugas1;

import static java.lang.System.out;

public class Fungsi_PPN {
  public static void main(String[] args) {
    int harga, ppn;

    harga = 15000;
    ppn = Pajak(harga);

    Data("Crab");
    out.printf("(PPN 10%% Tuan Crab dari %,d adalah Rp. %,d)", harga, ppn);
  }

  // Prosedur
  public static void Data(String Nama) {

    out.printf("Hallo Tuan %s \nKami akan menghitung PPN anda.\n", Nama);

  }

  // Fungsi PPN
  static int Pajak(int Barang) {
    int hasil;

    hasil = (Barang / 100) * 10;

    return hasil;
  }

}
