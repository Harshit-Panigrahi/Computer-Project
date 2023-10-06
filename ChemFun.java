import java.util.Scanner;

public class ChemFun {
  public static void main(String[] args) {
        System.out.println("                                                                                                                                                    ");
        System.out.println(" _____ _____ _____      _____ _____ _____ _____ _____ ____  _____ _____      _____ _____ _____ __    _____      _____ _____ __    _____ _____ _____ ");
        System.out.println("|_   _|  |  |   __|    |  _  |   __| __  |     |     |    ||     |     |    |_   _|  _  | __  |  |  |   __|    |  |  |   __|  |  |  _  |   __| __  |");
        System.out.println("  | | |     |   __|    |   __|   __|    -|-   -|  |  |  |  |-   -|   --|      | | |     | __ -|  |__|   __|    |     |   __|  |__|   __|   __|    -|");
        System.out.println("  |_| |__|__|_____|    |__|  |_____|__|__|_____|_____|____/|_____|_____|      |_| |__|__|_____|_____|_____|    |__|__|_____|_____|__|  |_____|__|__|");
        System.out.println("                                                                                                                                                    ");
        System.out.println("");
        System.out.println("");
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter atomic number: ");
    int inp = sc.nextInt();

    String dict[][] = {
      //format of string: Name, Symbol, Atomic weight, electronic config, Melting point, Boiling point, Group in which the element is present.
      
      { "Hydrogen", "H", "1.008", "1s¹", "-259.1°C", "-252.9°C", "1" },
      { "Helium", "He", "4.0026", "1s²", "-272.2°C", "-268.9°C", "18" },
      { "Lithium", "Li", "9.012", "[He]2s¹", "180.5°C", "1342°C", "1" },
      { "Beryllium", "Be", "4.0026", "[He]2s²", "1278°C", "2970°C", "2" },
      { "Boron", "B", "10.81", "[He]2s²2p¹", "2079°C", "2550°C", "13" },
      { "Carbon", "C", "12.01", "[He]2s²2p²", "3367°C", "4827°C", "14" },
      { "Nitrogen", "N", "14.01", "[He]2s²2p³", "-209.9°C", "-195.8°C", "15" },
      { "Oxygen", "O", "16.00", "[He]2s²2p⁴", "-218.4°C", "-183°C", "16" },
      { "Fluorine", "F", "19.00", "[He]2s²2p⁵", "-219.8°C", "-188.1°C", "17" },
      { "Neon", "Ne", "20.18", "[He]2s²2p⁶", "-248°C", "-248.7°C", "18" },
      { "Sodium", "Na", "22.99", "[Ne]3s¹", "97.8°C", "883°C", "1" },
      { "Magnesium", "Mg", "24.31", "[Ne]3s²", "649°C", "1090°C", "2" },
      { "Aluminum", "Al", "26.98", "[Ne]3s²3p¹", "660°C", "2467°C", "13" },
      { "Silicon", "Si", "28.09", "[Ne]3s²3p²", "1410°C", "2355°C", "14" },
      { "Phosphorus", "P", "30.97", "[Ne]3s²3p³", "44.1°C", "280°C", "15" },
      { "Sulfur", "S", "32.07", "[Ne]3s²3p⁴", "112.8°C", "444.7°C", "16" }, 
      { "Chlorine", "Cl", "35.45", "[Ne]3s²3p⁵", "-101°C", "-34.6°C", "17" },
      { "Argon", "Ar", "39.95", "[Ne]3s²3p⁶", "-189.2°C", "-185.7°C", "18" },
      { "Potassium", "K", "39.10", "[Ar]4s¹", "63.25°C", "760°C", "1" },
      { "Calcium", "Ca", "40.08", "[Ar]4s²", "839°C", "1484°C", "2" },
      { "Scandium", "Sc", "44.96", "[Ar]3d¹4s²", "1541°C", "2832°C", "3" },
      { "Titanium", "Ti", "47.87", "[Ar]3d²4s²", "1660°C", "3287°C", "4" },
      { "Vanadium", "V", "50.94", "[Ar]3d³4s²", "1890°C", "3380°C", "5" },
      { "Chromium", "Cr", "52.00", "[Ar]3d⁵4s¹", "1857°C", "2672°C", "6" },
      { "Manganese", "Mn", "54.94", "[Ar]3d⁵4s²", "1244°C", "1962°C", "7" },
      { "Iron", "Fe", "55.85", "[Ar]3d⁶4s²", "1535°C", "2750°C", "8" },
      { "Cobalt", "Co", "58.93", "[Ar]3d⁷4s²", "1495°C", "2870°C", "9" },
      { "Nickel", "Ni", "58.69", "[Ar]3d⁸4s²", "1453°C", "2730°C", "10" },
      { "Copper", "Cu", "63.55", "[Ar]3d¹⁰4s¹", "1083°C", "2567°C", "11" },
      { "Zinc", "Zn", "65.38", "[Ar]3d²4s²", "419.6°C", "906°C", "12" },
      { "Gallium", "Ga", "69.72", "[Ar]3d¹⁰4s2²p¹", "29.8°C", "2403°C", "13" }, //31 elements done >:D

    };

    switch(inp) {
      case 1:
        System.out.println("\nElement: Hydrogen");
        System.out.println("Symbol: H");
        System.out.println("Atomic weight: 1");
        System.out.println("Electronic config: 1");
        break;
      case 2:
        System.out.println("\nElement: Helium");
        System.out.println("Symbol: He");
        System.out.println("Atomic weight: 4");
        System.out.println("Electronic config: 2");
        break;
    }
  }
}
