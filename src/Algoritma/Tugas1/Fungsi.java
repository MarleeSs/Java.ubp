package Algoritma.Tugas1;

import static java.lang.System.out;

public class Fungsi {
  // Fungsi Main

  public static void main(String[] args) {
    int harga, ppn;

    harga = 15000;
    ppn = Pajak(harga);

    out.printf("PPN 10%% Tuan Crab adalah Rp. %,d", ppn);
  }

  // Fungsi PPN
  static int Pajak(int Barang) {
    int hasil;

    hasil = (Barang / 100) * 10;

    return hasil;
  }
}
