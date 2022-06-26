package StrukturData.UTS;

import java.util.Scanner;

public class FungsiPangkat {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println(ConsoleColors.RED_BRIGHT + "[ ~~ Fungsi Pangkat ~~ ]" + ConsoleColors.RESET);
      System.out.print("Masukkan Bilangan\t\t: ");
      double x = input.nextDouble();
      System.out.print("Mau dipangkatin berapa?\t: ");
      int y = input.nextInt();
      System.out.println(ConsoleColors.GREEN_BRIGHT + "\t\t\t\t\t\t ====" + ConsoleColors.RESET);

      double hasil = Math.pow(x, y);
      System.out.println(ConsoleColors.PURPLE + "Hasil\t\t\t\t\t: " + hasil);
    }
  }
}
