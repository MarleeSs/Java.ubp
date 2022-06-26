package StrukturData.UTS;

public class LuasBalok {
  public static void main(String[] args) {
    System.out.println(ConsoleColors.BLUE_BRIGHT + "[    Luas Balok   ]" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.GREEN_BRIGHT + "[-----------------]" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.BANANA_YELLOW + "[ Panjang   = 5cm ]");
    System.out.println("[ Lebar     = 6cm ]");
    System.out.println("[ Tinggi    = 7cm ]" + ConsoleColors.RESET);

    double Luas = luasBalok(5, 6, 7);
    System.out.println(ConsoleColors.YELLOW + "[ Luas      = " + (ConsoleColors.BLUE_UNDERLINED + Luas + "cm ") +
        ConsoleColors.RESET + (ConsoleColors.YELLOW + "]"));
  }

  static double luasBalok(double panjang, double lebar, double tinggi) {
    double Sisi = 2;
    return (Sisi * (panjang * lebar)
        + (Sisi * (panjang * lebar))
        + (Sisi * (tinggi * lebar)));
  }
}
