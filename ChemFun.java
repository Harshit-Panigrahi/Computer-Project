// https://github.com/Harshit-Panigrahi/Computer-Project/blob/main/ChemFun.java

import java.util.Scanner;

public class ChemFun {

  static String dict[][] = {
      { "0#Name", "1#Symbol", "2#At. wt.", "3#Config", "4#MP", "5#BP", "6#Group", "7#Period", },
      { "Hydrogen", "H", "1.008", "1s¹", "-259.1°C", "-252.9°C", "1", "1" },
      { "Helium", "He", "4.0026", "1s²", "-272.2°C", "-268.9°C", "18", "1" },
      { "Lithium", "Li", "9.012", "[He]2s¹", "180.5°C", "1342°C", "1", "2" },
      { "Beryllium", "Be", "4.0026", "[He]2s²", "1278°C", "2970°C", "2", "2" },
      { "Boron", "B", "10.81", "[He]2s²2p¹", "2079°C", "2550°C", "13", "2" },
      { "Carbon", "C", "12.01", "[He]2s²2p²", "3367°C", "4827°C", "14", "2" },
      { "Nitrogen", "N", "14.01", "[He]2s²2p³", "-209.9°C", "-195.8°C", "15", "2" },
      { "Oxygen", "O", "16.00", "[He]2s²2p⁴", "-218.4°C", "-183°C", "16", "2" },
      { "Fluorine", "F", "19.00", "[He]2s²2p⁵", "-219.8°C", "-188.1°C", "17", "2" },
      { "Neon", "Ne", "20.18", "[He]2s²2p⁶", "-248°C", "-248.7°C", "18", "2" },
      { "Sodium", "Na", "22.99", "[Ne]3s¹", "97.8°C", "883°C", "1", "3" },
      { "Magnesium", "Mg", "24.31", "[Ne]3s²", "649°C", "1090°C", "2", "3" },
      { "Aluminum", "Al", "26.98", "[Ne]3s²3p¹", "660°C", "2467°C", "13", "3" },
      { "Silicon", "Si", "28.09", "[Ne]3s²3p²", "1410°C", "2355°C", "14", "3" },
      { "Phosphorus", "P", "30.97", "[Ne]3s²3p³", "44.1°C", "280°C", "15", "3" },
      { "Sulfur", "S", "32.07", "[Ne]3s²3p⁴", "112.8°C", "444.7°C", "16", "3" },
      { "Chlorine", "Cl", "35.45", "[Ne]3s²3p⁵", "-101°C", "-34.6°C", "17", "3" },
      { "Argon", "Ar", "39.95", "[Ne]3s²3p⁶", "-189.2°C", "-185.7°C", "18", "3" },
      { "Potassium", "K", "39.10", "[Ar]4s¹", "63.25°C", "760°C", "1", "4" },
      { "Calcium", "Ca", "40.08", "[Ar]4s²", "839°C", "1484°C", "2", "4" },
      { "Scandium", "Sc", "44.96", "[Ar]3d¹4s²", "1541°C", "2832°C", "3", "4" },
      { "Titanium", "Ti", "47.87", "[Ar]3d²4s²", "1660°C", "3287°C", "4", "4" },
      { "Vanadium", "V", "50.94", "[Ar]3d³4s²", "1890°C", "3380°C", "5", "4" },
      { "Chromium", "Cr", "52.00", "[Ar]3d⁵4s¹", "1857°C", "2672°C", "6", "4" },
      { "Manganese", "Mn", "54.94", "[Ar]3d⁵4s²", "1244°C", "1962°C", "7", "4" },
      { "Iron", "Fe", "55.85", "[Ar]3d⁶4s²", "1535°C", "2750°C", "8", "4" },
      { "Cobalt", "Co", "58.93", "[Ar]3d⁷4s²", "1495°C", "2870°C", "9", "4" },
      { "Nickel", "Ni", "58.69", "[Ar]3d⁸4s²", "1453°C", "2730°C", "10", "4" },
      { "Copper", "Cu", "63.55", "[Ar]3d¹⁰4s¹", "1083°C", "2567°C", "11", "4" },
      { "Zinc", "Zn", "65.38", "[Ar]3d²4s²", "419.6°C", "906°C", "12", "4" },
      { "Gallium", "Ga", "69.72", "[Ar]3d¹⁰4s2²p¹", "29.8°C", "2403°C", "13", "4" },
      { "Germanium", "Ge", "72.63", "[Ar]3d¹⁰4s2²p²", "947.4°C", "2830°C", "14", "4" },
  };

  public static void main(String[] args) {
    ChemFun.header();
    ChemFun.menu();
  }

  static void header() {
    System.out.println("\n");
    System.out.println(" _____ _____ _____     _____ _____ _____ _____ _____ ____  _____  ____     _____ _____ _____ __    _____     _____ _____ __    _____ _____ _____ ");
    System.out.println("|_   _|  |  |   __|   |  _  |   __| __  |     |     |    \\|     |     |   |_   _|  _  | __  |  |  |   __|   |  |  |   __|  |  |  _  |   __|  _  |");
    System.out.println("  | | |     |   __|   |   __|   __|    -|-   -|  |  |  |  |-   -|   --|     | | |     | __ -|  |__|   __|   |     |   __|  |__|   __|   __|    -|");
    System.out.println("  |_| |__|__|_____|   |__|  |_____|__|__|_____|_____|____/|_____|_____|     |_| |__|__|_____|_____|_____|   |__|__|_____|_____|__|  |_____|__|__|");
    System.out.println("\n");
  }

  static void elemSearch(String inp) {
    int anum = 0;
    try {
      int a = Integer.parseInt(inp);
      if (a >= 0 && a <= 118) anum = a;
    } catch (Exception e) {
      for (int i = 1; i <= dict.length - 1; i++) {
        if (dict[i][0].equals(inp) || dict[i][1].equals(inp)) anum = i;
      }
    }
    if (anum == 0) {
      System.out.println("Element not found, try again (TIP: If you are trying to find an element using it's name/symbol, put the first letter capital)");
    } else {
      System.out.println("Name: " + dict[anum][0]);
      System.out.println("Symbol: " + dict[anum][1]);
      System.out.println("Atomic Weight: " + dict[anum][2]);
      System.out.println("Electronic Configuration: " + dict[anum][3]);
      System.out.println("Group: " + dict[anum][6]);
      System.out.println("Period: " + dict[anum][7]);
      System.out.println("Melting point: " + dict[anum][4]);
      System.out.println("Boiling point: " + dict[anum][5]);
    }
  }

  static void table() {
    System.out.println("\n ____________________________________________________________________________");
    System.out.println("|   | 1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18 |");
    System.out.println("|---+------------------------------------------------------------------------|");
    System.out.println("| 1 | H                 __________                                        He |");
    System.out.println("|   |                  |    H   ¹ |                                          |");
    System.out.println("| 2 | Li  Be           | Hydrogen |                   B   C   N   O   F   Ne |");
    System.out.println("|   |                  |  1.008   |                                          |");
    System.out.println("| 3 | Na  Mg           |__________|                   Al  Si  P   S   Cl  Ar |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 4 | K   Ca  Sc  Ti  V   Cr  Mn  Fe  Co  Ni  Cu  Zn  Ga  Ge  As  Se  Br  Kr |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 5 | Rb  Sr  Y   Zr  Nb  Mo  Tc  Ru  Rh  Pd  Ag  Cd  In  Sn  Sb  Te  I   Xe |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 6 | Cs  Ba   *  Hf  Ta  W   Re  Os  Ir  Pt  Au  Hg  Tl  Pb  Bi  Po  At  Rn |");
    System.out.println("|   |                                                                        |");
    System.out.println("| 7 | Fr  Ra  **  Rf  Db  Sg  Bh  Hs  Mt  Ds  Rg  Cn  Nh  Fl  Mc  Lv  Ts  Og |");
    System.out.println("|---+--------+---------------------------------------------------------------|");
    System.out.println("|            |                                                               |");
    System.out.println("|*Lanthanoids| La  Ce  Pr  Nd  Pm  Sm  Eu  Gd  Tb  Dy  Ho  Er  Tm  Yb  Lu    |");
    System.out.println("|            |                                                               |");
    System.out.println("|**Actinoids | Ac  Th  Pa  U   Np  Pu  Am  Cm  Bk  Cf  Es  Fm  Md  No  Lr    |");
    System.out.println("|____________|_______________________________________________________________|\n");
  }

  static void menu() {
    Scanner sc = new Scanner(System.in);

    System.out.println("1) Full Periodic Table (ASCII art) 🎨");
    System.out.println("2) Element Search And Info 🔎");
    System.out.println("3) Exit ❌");

    while (true) {
      System.out.print("\nEnter your choice (1-3): ");
      byte choice = sc.nextByte();
      switch (choice) {
        case 1:
          ChemFun.table();
          break;
        
        case 2:
          System.out.print("Search element by name/symbol/number: ");
          String inp = sc.next();
          ChemFun.elemSearch(inp);
          break;

        case 3:
          sc.close();
          //created a fake loading animation
          System.out.print("Exiting ");
            for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.print(". ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Successfully exited!");
          return;

        default:
          System.out.println("Invalid choice, try again");
          break;
      }
    }
  }
}
